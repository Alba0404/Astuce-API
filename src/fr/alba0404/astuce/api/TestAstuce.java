package fr.alba0404.astuce.api;

import fr.alba0404.astuce.api.enums.Line;
import fr.alba0404.astuce.api.enums.Station;
import fr.alba0404.astuce.api.errors.StationNotOnLineException;

/**
 * Class for tests.
 * 
 * @author Alba0404
 *
 */
public class TestAstuce {
	
	/**
	 * Just for testing.
	 * @param args Not used.
	 */
	public static void main(String[] args) {
		System.out.println("Test\t\t\t\t\tPass");
		System.out.println("============================================");
		System.out.println("StationNotOnLineExceptionThrow \t\t" + testStationNotOnLine());
		System.out.println("StationNotOnLineExceptionNotThrow \t" + testStationOnLine());
		System.out.println("getNext 1 \t\t\t\t" + testGetNextOne());
		System.out.println("Station \t\t\t\t" + testStation());
		System.out.println("Line \t\t\t\t\t" + testLine());
	}
	
	/**
	 * Test {@link Line} parameters and getter.
	 * @return If the test succeed
	 */
	private static boolean testLine() {
		boolean flag = true;
		return flag;
	}
	
	/**
	 * Test {@link Station} parameters and getter.
	 * @return If the test succeed.
	 */
	private static boolean testStation() {
		boolean flag = true;
		Station station = Station._14_JUILLET;
		if(station.getName() != "14-juillet")                                         flag = false;
		if(station.getId() != 383)                                                    flag = false;
		if(station.toString() != "14-juillet")                                        flag = false;
		if(station.getPhysicalIds(1, Line.METRO) != 101051)                           flag = false;
		if(station.getLines().size() != 1 && station.getLines().get(0) != Line.METRO) flag = false;
		return flag;
	}
	
	
	/**
	 * Test if the exception is correctly catch.
	 * @return If the test succeed.
	 */
	private static boolean testStationNotOnLine() {
		boolean flag = false;
		try {
			Astuce_API api = new Astuce_API();
			api.getNext(Line.METRO, Station.ABATTOIRS, 1);
		} catch (StationNotOnLineException e) {
			flag = true;
		}
		return flag;
	}
	
	/**
	 * Test if the {@link StationNotOnLineException} is not throw
	 * in normal use.
	 * @return If the test succeed.
	 */
	private static boolean testStationOnLine() {
		boolean flag = false;
		try {
			Astuce_API api = new Astuce_API();
			api.getNext(Line.METRO, Station.VOLTAIRE, 1);
			flag = true;
		} catch (StationNotOnLineException e) {
			flag = false;
		}
		return flag;
	}
	
	/**
	 * If the return value 
	 * @return If the test succeed
	 */
	private static boolean testGetNextOne() {
		boolean flag = true;
		try {
			Astuce_API api = new Astuce_API();
			int t = api.getNext(Line.METRO, Station.PLACE_DU_8_MAI, 2);
			if(t == -1 || t == -2) flag = false;
		} catch (StationNotOnLineException e) {
			flag = false;
		}
		return flag;
	}

}
