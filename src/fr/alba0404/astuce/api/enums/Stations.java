package fr.alba0404.astuce.api.enums;

import java.util.Arrays;
import java.util.List;

/**
 * Stations of the Astuce transport network;
 * 
 * @author Alba0404
 * @version 2.0
 */
public enum Stations {
	
	//Ok
	ABATTOIRS("abattoirs", 246, new int[][] { {100666, 100667} }, new Lines[] {Lines._32}),
	ABBAYE_DE_ST_MARTIN_DE_BOSCHERVILLE("abbaye-de-saint-martin-de-boscherville", 1322, new int[][] { {} }, new Lines[] {}),
	ABBESSES("abbesses", 1488, new int[][] { {} }, new Lines[] {}),
	ACHAVANNE("achavanne", 8, new int[][] { {100017, 100018} }, new Lines[] {Lines._13}),
	ADENAUER("adenauer", 9, new int[][] { {100019, 100020} }, new Lines[] {Lines._40}),
	AEROPORT("aeroport", 1489, new int[][] {{}}, new Lines[] {}),
	ALLEE_DE_L_OREE_DU_BOIS("allee-de-loree-du-bois", 1585, new int[][] {{}}, new Lines[] {}),
	ALLEE_DES_DEUX_FERMES("allee-des-deux-fermes", 1586, new int[][] {{}}, new Lines[] {}),
	ALLEE_DE_PEUPLIERS("allee-des-peupliers", 24, new int[][] { {100054, 100055} }, new Lines[] {Lines._39}),
	
	GARE_RUE_VERTE("gare-rue-verte", 314, new int[][] { {102210, 102537}, {102555, 102556}, {102555, 102556}, {102555, 102556} }, new Lines[] {Lines.T4, Lines.F2, Lines._8, Lines._11}),
	
	//========================================
	//METRO
	//Ok
	BOULINGRIN("boulingrin", 71, new int[][] { {100191, 100191, 100191}, {100197, 100197}, {100194, 100192}, {100193, 100193}, {100195, 100195}, {100196, 100196}}, new Lines[]{Lines.METRO, Lines.T4, Lines.F2, Lines._22, Lines._40, Lines.t53}),
	BEAUVOISINE("beauvoisine", 979, new int[][] { {100124, 100125}, {102189, 102530}, {100119, 100120}, {100118, 100118}, {100119, 100121} }, new Lines[]{Lines.METRO, Lines.T4, Lines.F1, Lines._6, Lines._20}),
	GARE_RUE_VERTE_METRO("gare-rue-verte-quai-station", 1368, new int[][] { {100872, 100873} }, new Lines[]{Lines.METRO}),
	PALAIS_DE_JUSTICE("palais-de-justice", 386, new int[][] { {101065, 101066}, {101067, 101068} }, new Lines[]{Lines.METRO, Lines._8}),
	THEATRE_DES_ARTS("theatre-des-arts", 716, new int[][] { {101987, 101988}, {101989, 101990}, {101989, 101990}, {101989, 101990}, {101981, 101981}, {101985, 101985}, {101983, 101984}, {100927, 100927}, {100927, 100927}, {102471, 102471}}, new Lines[]{Lines.METRO, Lines.T1, Lines.T2, Lines.T3, Lines.F3, Lines.F5, Lines._8, Lines._32, Lines._33, Lines._34}),
	JOFFRE_MUTUALITE("joffre-mutualite", 375, new int[][] { {101031, 101032}, {102457, 102456} }, new Lines[]{Lines.METRO, Lines._34}),
	SAINT_SEVER("saint-sever", 706, new int[][] { {101957, 101958}}, new Lines[]{Lines.METRO}),
	
	//OK
	EUROPE("europe", 209, new int[][] {{100769, 100770}, {100771, 100772} }, new Lines[]{Lines.METRO, Lines._6}),
	HONORE_DE_BALZAC("honore-de-balzac", 38, new int[][] {{100089,100090}}, new Lines[]{Lines.METRO}),
	VOLTAIRE("voltaire", 780, new int[][] {{102154, 102155}}, new Lines[]{Lines.METRO}),
	GARIBALDI("garibaldi", 317, new int[][] {{100874, 100875}}, new Lines[]{Lines.METRO}),
	HDV_SOTTEVILLE("hotel-de-ville-de-sotteville", 692, new int[][] { {101921, 101922}, {101918, 101918}, {101920, 101919}, {101920, 101919}}, new Lines[]{Lines.METRO, Lines.F3, Lines._41, Lines.t54}),
	_14_JUILLET("14-juillet", 383, new int[][] { {101051, 101052}}, new Lines[]{Lines.METRO}),
	JEAN_ZAY("jean-zay", 370, new int[][] { {101020, 101021}}, new Lines[]{Lines.METRO}),
	TOIT_FAMILIAL("toit-familial", 284, new int[][] { {100783, 100784}}, new Lines[]{Lines.METRO}),
	CHAMP_DE_COURSE("champ-de-courses", 193, new int[][] { {100525, 100526}}, new Lines[]{Lines.METRO}),
	ERNEST_RENAN("ernest-renan", 606, new int[][] { {101684, 101685}, {101682, 101683} }, new Lines[]{Lines.METRO, Lines._42}),
	LE_PARC("le-parc", 534, new int[][] { {101480, 101481}}, new Lines[]{Lines.METRO}),
	MARYSE_BASTIE("maryse-bastie", 44, new int[][] { {100106, 100107}}, new Lines[]{Lines.METRO}),
	TECHNOPOLE("technopole", 754, new int[][] { {102092, 102093}, {102088, 102089} }, new Lines[]{Lines.METRO, Lines._27}),
	
	//A faire
	AVENUE_DE_CAEN("avenue-de-caen", 34, new int[][] { {100078, 100079}}, new Lines[]{Lines.METRO}),
	JEAN_JAURES("jean-jaures", 1101, new int[][] { {101009, 101010}}, new Lines[]{Lines.METRO}),
	FRANCOIS_TRUFFAUT("francois-truffaut", 753, new int[][] { {102086, 102087}}, new Lines[]{Lines.METRO}),
	PLACE_DU_8_MAI("place-du-8-mai", 1, new int[][] { {100000, 100001}, {100002, 100003} }, new Lines[]{Lines.METRO, Lines._41}),
	SAINT_JULIEN("saint-julien", 385, new int[][] { {101059, 101060}}, new Lines[]{Lines.METRO}),
	CHARLES_DE_GAULLE("charles-de-gaulle", 136, new int[][] { {100363, 100364}}, new Lines[]{Lines.METRO}),
	PROVINCES("provinces", 1399, new int[][] { {101618, 101619}}, new Lines[]{Lines.METRO}),
	JF_KENNEDY("jf-kennedy", 388, new int[][] { {101071, 101072}}, new Lines[]{Lines.METRO}),
	LEON_BLUM("leon-blum", 411, new int[][] { {101132, 101133}}, new Lines[]{Lines.METRO}),
	PAUL_CEZANNE("paul-cezanne", 123, new int[][] { {100332, 100333}}, new Lines[]{Lines.METRO}),
	GEORGES_BRAQUE("georges-braque", 74, new int[][] { {100204, 100205}}, new Lines[]{Lines.METRO});
	//========================================
	
	private String name;
	private int id;
	private int[][] pysicalIds;
	private Lines[] lines;
	
	private Stations(String name, int id, int[][] physicalIds, Lines[] lines) {
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
	public final int getPhysicalIds(int sens, Lines line) { return this.pysicalIds[this.getLines().indexOf(line)][sens-1]; }
	
	/**
	 * Getter for Liness which go to this station.
	 * 
	 * @return The list of Liness available in this station. 
	 */
	public final List<Lines> getLines() { return Arrays.asList(lines); }
	

}
