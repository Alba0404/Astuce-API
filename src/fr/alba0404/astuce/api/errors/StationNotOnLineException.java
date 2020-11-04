package fr.alba0404.astuce.api.errors;

import fr.alba0404.astuce.api.Line;
import fr.alba0404.astuce.api.Station;

@SuppressWarnings("serial")
public class StationNotOnLineException extends Exception {
	
	public StationNotOnLineException(Station station, Line line) {
		super("The station '" + station.toString() + "' is not on the line '" + line.toString() +"'.");
	}
	
}
