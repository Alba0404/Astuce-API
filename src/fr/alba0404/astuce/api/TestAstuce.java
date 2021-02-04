package fr.alba0404.astuce.api;

import fr.alba0404.astuce.api.enums.Lines;
import fr.alba0404.astuce.api.enums.Stations;
import fr.alba0404.astuce.api.errors.StationNotOnLineException;

public class TestAstuce {
	
	/**
	 * Just for testing.
	 * @param args Not used.
	 * @throws StationNotOnLineException Useful to see errors during test.
	 */
	public static void main(String[] args) throws StationNotOnLineException {
		//int t = getNext(Line.METRO, Station._14_JUILLET_BOULINGRIN);
		Astuce_API api = new Astuce_API();
		
		int t = api.getNext(Lines.METRO, Stations.PLACE_DU_8_MAI, 2);
		System.out.println(t);
		System.out.println(api.getStations(Lines._34));
	}

}
