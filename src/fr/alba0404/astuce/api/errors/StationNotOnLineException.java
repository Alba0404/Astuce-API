package fr.alba0404.astuce.api.errors;

import fr.alba0404.astuce.api.enums.Line;
import fr.alba0404.astuce.api.enums.Station;

/**
 * Error when you try to combine a line with a station that is not on this line.
 * 
 * @author Alba0404
 *
 */
@SuppressWarnings("serial")
public class StationNotOnLineException extends Exception {
	
	public StationNotOnLineException(Station station, Line line) {
		super("The station '" + station.toString() + "' is not on the line '" + line.toString() +"'.");
	}
	
}
