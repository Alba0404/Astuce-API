package fr.alba0404.astuce.api.enums;

import java.util.Arrays;
import java.util.List;

/**
 * Stations of the Astuce transport network;
 * 
 * @author Alba0404
 * @version 2.0
 */
public enum Station {
	
	//Ok
	ABATTOIRS("abattoirs", 246, new int[][] { {100666, 100667} }, new Line[] {Line._32}),
	ABBAYE_DE_ST_MARTIN_DE_BOSCHERVILLE("abbaye-de-saint-martin-de-boscherville", 1322, new int[][] { {} }, new Line[] {}),
	ABBESSES("abbesses", 1488, new int[][] { {} }, new Line[] {}),
	ACHAVANNE("achavanne", 8, new int[][] { {100017, 100018} }, new Line[] {Line._13}),
	ADENAUER("adenauer", 9, new int[][] { {100019, 100020} }, new Line[] {Line._40}),
	AEROPORT("aeroport", 1489, new int[][] {{}}, new Line[] {}),
	ALLEE_DE_L_OREE_DU_BOIS("allee-de-loree-du-bois", 1585, new int[][] {{}}, new Line[] {}),
	ALLEE_DES_DEUX_FERMES("allee-des-deux-fermes", 1586, new int[][] {{}}, new Line[] {}),
	ALLEE_DE_PEUPLIERS("allee-des-peupliers", 24, new int[][] { {100054, 100055} }, new Line[] {Line._39}),
	
	GARE_RUE_VERTE("gare-rue-verte", 314, new int[][] { {102210, 102537}, {102555, 102556}, {102555, 102556}, {102555, 102556} }, new Line[] {Line.T4, Line.F2, Line._8, Line._11}),
	
	//========================================
	//METRO
	//Ok
	BOULINGRIN("boulingrin", 71, new int[][] { {100191, 100191, 100191}, {100197, 100197}, {100194, 100192}, {100193, 100193}, {100195, 100195}, {100196, 100196}}, new Line[]{Line.METRO, Line.T4, Line.F2, Line._22, Line._40, Line.t53}),
	BEAUVOISINE("beauvoisine", 979, new int[][] { {100124, 100125}, {102189, 102530}, {100119, 100120}, {100118, 100118}, {100119, 100121} }, new Line[]{Line.METRO, Line.T4, Line.F1, Line._6, Line._20}),
	GARE_RUE_VERTE_METRO("gare-rue-verte-quai-station", 1368, new int[][] { {100872, 100873} }, new Line[]{Line.METRO}),
	PALAIS_DE_JUSTICE("palais-de-justice", 386, new int[][] { {101065, 101066}, {101067, 101068} }, new Line[]{Line.METRO, Line._8}),
	THEATRE_DES_ARTS("theatre-des-arts", 716, new int[][] { {101987, 101988}, {101989, 101990}, {101989, 101990}, {101989, 101990}, {101981, 101981}, {101985, 101985}, {101983, 101984}, {100927, 100927}, {100927, 100927}, {102471, 102471}}, new Line[]{Line.METRO, Line.T1, Line.T2, Line.T3, Line.F3, Line.F5, Line._8, Line._32, Line._33, Line._34}),
	JOFFRE_MUTUALITE("joffre-mutualite", 375, new int[][] { {101031, 101032}, {102457, 102456} }, new Line[]{Line.METRO, Line._34}),
	SAINT_SEVER("saint-sever", 706, new int[][] { {101957, 101958}}, new Line[]{Line.METRO}),
	
	//OK
	EUROPE("europe", 209, new int[][] {{100769, 100770}, {100771, 100772} }, new Line[]{Line.METRO, Line._6}),
	HONORE_DE_BALZAC("honore-de-balzac", 38, new int[][] {{100089,100090}}, new Line[]{Line.METRO}),
	VOLTAIRE("voltaire", 780, new int[][] {{102154, 102155}}, new Line[]{Line.METRO}),
	GARIBALDI("garibaldi", 317, new int[][] {{100874, 100875}}, new Line[]{Line.METRO}),
	HDV_SOTTEVILLE("hotel-de-ville-de-sotteville", 692, new int[][] { {101921, 101922}, {101918, 101918}, {101920, 101919}, {101920, 101919}}, new Line[]{Line.METRO, Line.F3, Line._41, Line.t54}),
	_14_JUILLET("14-juillet", 383, new int[][] { {101051, 101052}}, new Line[]{Line.METRO}),
	JEAN_ZAY("jean-zay", 370, new int[][] { {101020, 101021}}, new Line[]{Line.METRO}),
	TOIT_FAMILIAL("toit-familial", 284, new int[][] { {100783, 100784}}, new Line[]{Line.METRO}),
	CHAMP_DE_COURSE("champ-de-courses", 193, new int[][] { {100525, 100526}}, new Line[]{Line.METRO}),
	ERNEST_RENAN("ernest-renan", 606, new int[][] { {101684, 101685}, {101682, 101683} }, new Line[]{Line.METRO, Line._42}),
	LE_PARC("le-parc", 534, new int[][] { {101480, 101481}}, new Line[]{Line.METRO}),
	MARYSE_BASTIE("maryse-bastie", 44, new int[][] { {100106, 100107}}, new Line[]{Line.METRO}),
	TECHNOPOLE("technopole", 754, new int[][] { {102092, 102093}, {102088, 102089} }, new Line[]{Line.METRO, Line._27}),
	
	//A faire
	AVENUE_DE_CAEN("avenue-de-caen", 34, new int[][] { {100078, 100079}}, new Line[]{Line.METRO}),
	JEAN_JAURES("jean-jaures", 1101, new int[][] { {101009, 101010}}, new Line[]{Line.METRO}),
	FRANCOIS_TRUFFAUT("francois-truffaut", 753, new int[][] { {102086, 102087}}, new Line[]{Line.METRO}),
	PLACE_DU_8_MAI("place-du-8-mai", 1, new int[][] { {100000, 100001}, {100002, 100003} }, new Line[]{Line.METRO, Line._41}),
	SAINT_JULIEN("saint-julien", 385, new int[][] { {101059, 101060}}, new Line[]{Line.METRO}),
	CHARLES_DE_GAULLE("charles-de-gaulle", 136, new int[][] { {100363, 100364}}, new Line[]{Line.METRO}),
	PROVINCES("provinces", 1399, new int[][] { {101618, 101619}}, new Line[]{Line.METRO}),
	JF_KENNEDY("jf-kennedy", 388, new int[][] { {101071, 101072}}, new Line[]{Line.METRO}),
	LEON_BLUM("leon-blum", 411, new int[][] { {101132, 101133}}, new Line[]{Line.METRO}),
	PAUL_CEZANNE("paul-cezanne", 123, new int[][] { {100332, 100333}}, new Line[]{Line.METRO}),
	GEORGES_BRAQUE("georges-braque", 74, new int[][] { {100204, 100205}}, new Line[]{Line.METRO});
	//========================================
	
	private String name;
	private int id;
	private int[][] pysicalIds;
	private Line[] lines;
	
	private Station(String name, int id, int[][] physicalIds, Line[] lines) {
		this.name = name;
		this.id = id;
		this.pysicalIds = physicalIds;
		this.lines = lines;
	}
	
	/**
	 * Getter for the name of the station.
	 * 
	 * @return The name of the station, used by the system.
	 */
	public final String getName() { return this.name; }
	
	/**
	 * Getter for the id of the station.
	 * 
	 * @return The id of the station.
	 */
	public final int getId() { return this.id; }
	
	/**
	 * Get the physical id (the platform) of the station.
	 * 
	 * @param sens The direction (1/2).
	 * @param line The concerned line.
	 * @return The physical id.
	 */
	public final int getPhysicalIds(int sens, Line line) { return this.pysicalIds[this.getLines().indexOf(line)][sens-1]; }
	
	/**
	 * Getter for Liness which go to this station.
	 * 
	 * @return The list of Liness available in this station. 
	 */
	public final List<Line> getLines() { return Arrays.asList(lines); }
	
	@Override
	public String toString() { return this.name; }

}
