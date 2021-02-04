package fr.alba0404.astuce.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import fr.alba0404.astuce.api.enums.Lines;
import fr.alba0404.astuce.api.enums.Stations;
import fr.alba0404.astuce.api.errors.StationNotOnLineException;

/**
 * API for the transport network Astuce in Rouen Metropole (FR).
 * 
 * @author Alba0404
 * @version 0.1
 *
 */
public class Astuce_API {
	
	//String urlParameters = "destinations=%7B%221%22%3A%22Technop%C3%B4le+SAINT-ETIENNE-DU-ROUVRAY%22%7D&stopId=102154&lineId=175&sens=1";	//Vers Technopole
	//String urlParameters = "destinations=%7B%221%22%3A%22Boulingrin+ROUEN%22%7D&stopId=102155&lineId=175&sens=2";	//Vers Boulingrin
	

	/**
	 * Useless constructor
	 */
	public Astuce_API() {}
	
	/**
	 * Return the time in minute before the next transport.
	 * Return -1 if no transport, -2 and a message when there is an error.
	 * 
	 * @param line The line you want the next transport.
	 * @param station The station on this line.
	 * @param sens The direction you want to go.
	 * @return The time in minute before the next transport (-1 if nothing, -2 if error).
	 * @throws StationNotOnLineException If the station you specified is not on the line.
	 */
	public int getNext(Lines line, Stations station, int sens) throws StationNotOnLineException{
		int time = -1;
		
		if(!station.getLines().contains(line)) throw new StationNotOnLineException(station, line);
		
		String request = "destinations=%7B%221%22%3A%22" + line.getTerminus(sens)
						+ "%22%7D&stopId=" + station.getPhysicalIds(sens, line)
						+ "&lineId=" + line.getId()
						+ "&sens=" + sens;
		System.out.println(request);
		try {
			time = HTTPRequester.requestTime(request, 1).get(0);
		} catch (IOException e) {
			System.err.println("Can't connect to the server :(");
			time = -2;
		}
		
		return time;
	}
	
	
	
	/**
	 * Return stations of a line.
	 * 
	 * @param line The line you want the stations.
	 * @return A list of stations of this line.
	 */
	public List<Stations> getStations(Lines line) {
		List<Stations> stations = new ArrayList<Stations>();
		for(Stations s : Stations.values()) {
			if(s.getLines().contains(line)) stations.add(s);
		}
		return stations;
	}
	
	

}
