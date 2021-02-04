package fr.alba0404.astuce.api.errors;

import fr.alba0404.astuce.api.enums.Lines;
import fr.alba0404.astuce.api.enums.Stations;

/**
 * Error when you try to combine a line with a station that is not on this line.
 * 
 * @author Alba0404
 *
 */
@SuppressWarnings("serial")
public class StationNotOnLineException extends Exception {
	
	public StationNotOnLineException(Stations station, Lines line) {
		super("The station '" + station.toString() + "' is not on the line '" + line.toString() +"'.");
	}
	
}
