package fr.alba0404.astuce.api;

import java.io.IOException;

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
		/*
		System.out.println(Line.METRO.toString());
		System.out.println("Braque: " + getNext(Line.F1, Station.BOULINGRIN_BRAQUE));
		System.out.println("Braque: " + getNext(Line.METRO, Station.BOULINGRIN_BRAQUE));
		System.out.println("Technopole: " + getNext(Line.METRO, Station.BOULINGRIN_TECHNOPOLE));
		System.out.println("Boulingrin: " + getNext(Line.METRO, Station.BOULINGRIN_BOULINGRIN));
		*/
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
		
		if(!station.getLine().contains(line)) throw new StationNotOnLineException(station, line);
		
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
	
	

}
