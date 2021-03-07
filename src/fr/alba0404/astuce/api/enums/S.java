package fr.alba0404.astuce.api.enums;

import java.util.Arrays;
import java.util.List;

/**
 * All stations of the Astuce transport network.
 * 
 * @author Alba0404
 * @version 1.0
 * @deprecated
 */
public enum S {
	
	//========================================
	//METRO
	BOULINGRIN_TECHNOPOLE(new L[]{L.METRO, L.T4, L.F2, L._22, L._40, L.t53}, 1, 100191, "Technop%C3%B4le+SAINT-ETIENNE-DU-ROUVRAY%22%2C%222%22%3A%22Georges+Braque+GRAND+QUEVILLY"),
	BOULINGRIN_BRAQUE(new L[]{L.METRO, L.T4, L.F2, L._22, L._40, L.t53}, 1, 100191, "Georges+Braque+GRAND+QUEVILLY"), //= technopole
	BOULINGRIN_BOULINGRIN(new L[]{L.METRO, L.T4, L.F2, L._22, L._40, L.t53}, 2, 100191, "Boulingrin+ROUEN"), //Ok
	BEAUVOISINE_TECHNOPOLE(new L[]{L.METRO, L.T4, L.F1, L._6, L._20}, 1, 10124, "Technop%C3%B4le+SAINT-ETIENNE-DU-ROUVRAY"),
	BEAUVOISINE_BRAQUE(new L[]{L.METRO, L.T4, L.F1, L._6, L._20}, 1, 100124, "Georges+Braque+GRAND+QUEVILLY"),
	BEAUVOISINE_BOULINGRIN(new L[]{L.METRO, L.T4, L.F1, L._6, L._20}, 2, 100125, "Boulingrin+ROUEN"), //Ok
	GARE_RUE_VERTE_TECHNOPOLE(new L[]{L.METRO, L.T4, L.F2, L._8, L._11}, 1, 10872, "Technop%C3%B4le+SAINT-ETIENNE-DU-ROUVRAY"),
	GARE_RUE_VERTE_BRAQUE(new L[]{L.METRO, L.T4, L.F2, L._8, L._11}, 1, 100872, "Georges+Braque+GRAND+QUEVILLY"),
	GARE_RUE_VERTE_BOULINGRIN(new L[]{L.METRO, L.T4, L.F2, L._8, L._11}, 2, 100873, "Boulingrin+ROUEN"), //Ok
	PALAIS_DE_JUSTICE_TECHNOPOLE(new L[]{L.METRO}, 1, 101065, "Technop%C3%B4le+SAINT-ETIENNE-DU-ROUVRAY"),
	PALAIS_DE_JUSTICE_BRAQUE(new L[]{L.METRO}, 1, 101065, "Georges+Braque+GRAND+QUEVILLY"),
	PALAIS_DE_JUSTICE_BOULINGRIN(new L[]{L.METRO}, 2, 101066, "Boulingrin+ROUEN"), //Ok
	THEATRE_DES_ARTS_TECHNOPOLE(new L[]{L.METRO, L.T1, L.T2, L.T3, L.F3, L.F5, L._8, L._32, L._33, L._34}, 1, 101987, "Technop%C3%B4le+SAINT-ETIENNE-DU-ROUVRAY"),
	THEATRE_DES_ARTS_BRAQUE(new L[]{L.METRO, L.T1, L.T2, L.T3, L.F3, L.F5, L._8, L._32, L._33, L._34}, 1, 101987, "Georges+Braque+GRAND+QUEVILLY"),
	THEATRE_DES_ARTS_BOULINGRIN(new L[]{L.METRO, L.T1, L.T2, L.T3, L.F3, L.F5, L._8, L._32, L._33, L._34}, 2, 101988, "Boulingrin+ROUEN"), //Ok
	JOFFRE_MUTUALITE_TECHNOPOLE(new L[]{L.METRO}, 1, 101031, "Technop%C3%B4le+SAINT-ETIENNE-DU-ROUVRAY"),
	JOFFRE_MUTUALITE_BRAQUE(new L[]{L.METRO}, 1, 101031, "Georges+Braque+GRAND+QUEVILLY"),
	JOFFRE_MUTUALITE_BOULINGRIN(new L[]{L.METRO}, 2, 101032, "Boulingrin+ROUEN"), //Ok
	SAINT_SEVER_TECHNOPOLE(new L[]{L.METRO}, 1, 101957, "Technop%C3%B4le+SAINT-ETIENNE-DU-ROUVRAY"),
	SAINT_SEVER_BRAQUE(new L[]{L.METRO}, 1, 101957, "Georges+Braque+GRAND+QUEVILLY"),
	SAINT_SEVER_BOULINGRIN(new L[]{L.METRO}, 2, 101958, "Boulingrin+ROUEN"), //Ok
	
	EUROPE_TECHNOPOLE(new L[]{L.METRO}, 1, 100769,"Technop%C3%B4le+SAINT-ETIENNE-DU-ROUVRAY"),
	EUROPE_BOULINGRIN(new L[]{L.METRO}, 2, 100770, "Boulingrin+ROUEN"),
	HONORE_DE_BALZAC_TECHNOPOLE(new L[]{L.METRO}, 1, 100089, "Technop%C3%B4le+SAINT-ETIENNE-DU-ROUVRAY"),
	HONORE_DE_BALZAC_BOULINGRIN(new L[]{L.METRO}, 2, 100090, "Boulingrin+ROUEN"),
	VOLTAIRE_TECHNOPOLE(new L[]{L.METRO}, 1, 102154, "Technop%C3%B4le+SAINT-ETIENNE-DU-ROUVRAY"),
	VOLTAIRE_BOULINGRIN(new L[]{L.METRO}, 2, 102155, "Boulingrin+ROUEN"),
	GARIBALDI_TECHNOPOLE(new L[]{L.METRO}, 1, 100874, "Technop%C3%B4le+SAINT-ETIENNE-DU-ROUVRAY"),
	GARIBALDI_BOULINGRIN(new L[]{L.METRO}, 2, 100875, "Boulingrin+ROUEN"),
	HDV_SOTTEVILLE_TECHNOPOLE(new L[]{L.METRO}, 1, 101921, "Technop%C3%B4le+SAINT-ETIENNE-DU-ROUVRAY"),
	HDV_SOTTEVILLE_BOULINGRIN(new L[]{L.METRO}, 2, 101922, "Boulingrin+ROUEN"),
	_14_JUILLET_TECHNOPOLE(new L[]{L.METRO}, 1, 101051, "Technop%C3%B4le+SAINT-ETIENNE-DU-ROUVRAY"),
	_14_JUILLET_BOULINGRIN(new L[]{L.METRO}, 2, 101052, "Boulingrin+ROUEN"),
	JEAN_ZAY_TECHNOPOLE(new L[]{L.METRO}, 1, 101020, "Technop%C3%B4le+SAINT-ETIENNE-DU-ROUVRAY"),
	JEAN_ZAY_BOULINGRIN(new L[]{L.METRO}, 2, 101021, "Boulingrin+ROUEN"),
	TOIT_FAMILIAL_TECHNOPOLE(new L[]{L.METRO}, 1, 100783, "Technop%C3%B4le+SAINT-ETIENNE-DU-ROUVRAY"),
	TOIT_FAMILIAL_BOULINGRIN(new L[]{L.METRO}, 2, 100784, "Boulingrin+ROUEN"),
	CHAMP_DE_COURSE_TECHNOPOLE(new L[]{L.METRO}, 1, 100525, "Technop%C3%B4le+SAINT-ETIENNE-DU-ROUVRAY"),
	CHAMP_DE_COURSE_BOULINGRIN(new L[]{L.METRO}, 2, 100526, "Boulingrin+ROUEN"),
	ERNEST_RENAN_TECHNOPOLE(new L[]{L.METRO}, 1, 101684, "Technop%C3%B4le+SAINT-ETIENNE-DU-ROUVRAY"),
	ERNEST_RENAN_BOULINGRIN(new L[]{L.METRO}, 2, 101685, "Boulingrin+ROUEN"),
	LE_PARC_TECHNOPOLE(new L[]{L.METRO}, 1, 101480, "Technop%C3%B4le+SAINT-ETIENNE-DU-ROUVRAY"),
	LE_PARC_BOULINGRIN(new L[]{L.METRO}, 2, 101481, "Boulingrin+ROUEN"),
	MARYSE_BASTIE_TECHNOPOLE(new L[]{L.METRO}, 1, 100106, "Technop%C3%B4le+SAINT-ETIENNE-DU-ROUVRAY"),
	MARYSE_BASTIE_BOULINGRIN(new L[]{L.METRO}, 2, 100107, "Boulingrin+ROUEN"),
	TECHNOPOLE_TECHNOPOLE(new L[]{L.METRO}, 1, 102092, "Technop%C3%B4le+SAINT-ETIENNE-DU-ROUVRAY"),
	TECHNOPOLE_BOULINGRIN(new L[]{L.METRO}, 2, 102093, "Boulingrin+ROUEN"),
	
	AVENUE_DE_CAEN_BRAQUE(new L[]{L.METRO}, 1, 100078, "Georges+Braque+GRAND+QUEVILLY"),
	AVENUE_DE_CAEN_BOULINGRIN(new L[]{L.METRO}, 2, 100079, "Boulingrin+ROUEN"),
	JEAN_JAURES_BRAQUE(new L[]{L.METRO}, 1, 101009, "Georges+Braque+GRAND+QUEVILLY"),
	JEAN_JAURES_BOULINGRIN(new L[]{L.METRO}, 2, 101010, "Boulingrin+ROUEN"),
	FRANCOIS_TRUFFAUT_BRAQUE(new L[]{L.METRO}, 1, 102086, "Georges+Braque+GRAND+QUEVILLY"),
	FRANCOIS_TRUFFAUT_BOULINGRIN(new L[]{L.METRO}, 2, 102087, "Boulingrin+ROUEN"),
	PLACE_DU_8_MAI_BRAQUE(new L[]{L.METRO}, 1, 100000, "Georges+Braque+GRAND+QUEVILLY"),
	PLACE_DU_8_MAI_BOULINGRIN(new L[]{L.METRO}, 2, 100001, "Boulingrin+ROUEN"),
	SAINT_JULIEN_BRAQUE(new L[]{L.METRO}, 1, 101059, "Georges+Braque+GRAND+QUEVILLY"),
	SAINT_JULIEN_BOULINGRIN(new L[]{L.METRO}, 2, 101060, "Boulingrin+ROUEN"),
	CHARLES_DE_GAULLE_BRAQUE(new L[]{L.METRO}, 1, 100363, "Georges+Braque+GRAND+QUEVILLY"),
	CHARLES_DE_GAULLE_BOULINGRIN(new L[]{L.METRO}, 2, 100364, "Boulingrin+ROUEN"),
	PROVINCES_BRAQUE(new L[]{L.METRO}, 1, 101618, "Georges+Braque+GRAND+QUEVILLY"),
	PROVINCES_BOULINGRIN(new L[]{L.METRO}, 2, 101619, "Boulingrin+ROUEN"),
	JF_KENNEDY_BRAQUE(new L[]{L.METRO}, 1, 101071, "Georges+Braque+GRAND+QUEVILLY"),
	JF_KENNEDY_BOULINGRIN(new L[]{L.METRO}, 2, 101072, "Boulingrin+ROUEN"),
	LEON_BLUM_BRAQUE(new L[]{L.METRO}, 1, 101132, "Georges+Braque+GRAND+QUEVILLY"),
	LEON_BLUM_BOULINGRIN(new L[]{L.METRO}, 2, 101133, "Boulingrin+ROUEN"),
	PAUL_CEZANNE_BRAQUE(new L[]{L.METRO}, 1, 100332, "Georges+Braque+GRAND+QUEVILLY"),
	PAUL_CEZANNE_BOULINGRIN(new L[]{L.METRO}, 2, 100333, "Boulingrin+ROUEN"),	
	GEORGES_BRAQUE_BRAQUE(new L[]{L.METRO}, 1, 100204, "Georges+Braque+GRAND+QUEVILLY"),
	GEORGES_BRAQUE_BOULINGRIN(new L[]{L.METRO}, 2, 100205, "Boulingrin+ROUEN");
	//========================================
	
	
	private L[] line;
	private int sens;
	private int id;
	private String destination;
	
	private S(L[] l, int s, int i, String d) {
		this.line = l;
		this.sens = s;
		this.id = i;
		this.destination = d;
	}
	
	
	
	/**
	 * Getter for lines that pass through this station
	 * 
	 * @return A list of stations that pass through the station.
	 */
	public List<L> getLines() { return Arrays.asList(line); }
	
	
	
	/**
	 * Get the direction of the station on the line.
	 *  
	 * @return The direction (1 or 2)
	 */
	public int getSens() { return sens; }
	
	
	
	/**
	 * Get the station's id.
	 * 
	 * @return The id of the station.
	 */
	public int getId() { return id; }
	
	
	
	/**
	 * Get the destination/terminus of the main line of the station.
	 * 
	 * @return The destination.
	 */
	public String getDestination() { return destination; }

}
