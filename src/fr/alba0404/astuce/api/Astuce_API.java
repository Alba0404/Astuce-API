package fr.alba0404.astuce.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import fr.alba0404.astuce.api.enums.Line;
import fr.alba0404.astuce.api.enums.Station;
import fr.alba0404.astuce.api.errors.StationNotOnLineException;

/**
 * API for the transport network Astuce in Rouen Metropole (FR).
 * @author Alba0404
 * @version 1.0
 *
 */
public class Astuce_API {
	
	//String urlParameters = "destinations=%7B%221%22%3A%22Technop%C3%B4le+SAINT-ETIENNE-DU-ROUVRAY%22%7D&stopId=102154&lineId=175&sens=1";	//Vers Technopole
	//String urlParameters = "destinations=%7B%221%22%3A%22Boulingrin+ROUEN%22%7D&stopId=102155&lineId=175&sens=2";	//Vers Boulingrin
	
	public static void main(String[] args) throws StationNotOnLineException {
		
		int t = getNext(Line.F1, Station._14_JUILLET_BOULINGRIN);
		System.out.println(t);
	}
	
	/**
	 * Return the time in minute before the next transport. <br/>
	 * Return -1 if no transport, -2 and a message when there is an error.
	 * @param line The line you want the next transport.
	 * @param station The station on this line (1 for each direction).
	 * @return The time in minute before the next transport.
	 * @throws StationNotOnLineException
	 */
	public static int getNext(Line line, Station station) throws StationNotOnLineException{
		int time = -1;
		
		if(!station.getLines().contains(line)) throw new StationNotOnLineException(station, line);
		
		String request = "destinations=%7B%221%22%3A%22" + station.getDestination()
						+ "%22%7D&stopId=" + station.getId()
						+ "&lineId=" + line.getId()
						+ "&sens=" + station.getSens();
		try {
			time = HTTPRequester.requestTime(request);
		} catch (IOException e) {
			System.err.println("Can't connect to the server :(");
			time = -2;
		}
		
		return time;
	}
	
	/**
	 * Return stations of a line.
	 * @param line The line you want the stations.
	 * @return A list of stations of this line.
	 */
	public static List<Station> getStations(Line line) {
		List<Station> stations = new ArrayList<Station>();
		for(Station s : Station.values()) {
			//Sens = 2 car deux branches dans l'autre sens
			if(s.getLines().contains(line) && s.getSens() == 2) stations.add(s);
		}
		return stations;
	}
	
	

}
