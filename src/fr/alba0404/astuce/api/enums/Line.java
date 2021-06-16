package fr.alba0404.astuce.api.enums;

/**
 * Lines of the Astuce transport network.
 * 
 * @author Alba0404
 * @version 2.0
 */
public enum Line {
	/**
	 * Ligne de métro (Boulingrin <> Technopôle / Georges Braque)
	 */
	METRO("Métro", 175, new String[]{"Technop%C3%B4le+SAINT-ETIENNE-DU-ROUVRAY%22%2C%222%22%3A%22Georges+Braque+GRAND+QUEVILLY", "Boulingrin+ROUEN"}),
	
	/**
	 * Ligne TEOR T1 (Mont aux Malades <> CHU Charles Nicolle)
	 */
	T1("T1", 176, new String[]{"CHU+Charles+Nicolle+ROUEN", "Mont+aux+Malades+MONT-SAINT-AIGNAN"}),
	/**
	 * Ligne TEOR T2 (Mairie - V. Schoelcher <> Tamarelle)
	 */
	T2("T2", 177, new String[]{"Tamarelle+BIHOREL", "Mairie-V.+Schoelcher+N.-D.-DE-BONDEVILLE"}),
	/**
	 * Ligne TEOR T3 (Monet <> Durécu-Lavoisier)
	 */
	T3("T3", 178, new String[]{"Dur%C3%A9cu-Lavoisier+DARN%C3%89TAL", "Monet+CANTELEU"}),
	/**
	 * Ligne TEOR T4 (Boulingrin <> Zénith-Parc Expo)
	 */
	T4("T4", 214, new String[]{"Z%C3%A9nith+-+Parc+Expo+GRAND+QUEVILLY", "Boulingrin+ROUEN"}),
	
	/**
	 * Ligne FAST F1 (Plaine de la Ronce <> Stade Diochon)
	 */
	F1("F1", 94, new String[]{"Stade+Diochon+PETIT-QUEVILLY", "Plaine+de+la+Ronce+ISNEAUVILLE"}),
	/**
	 * Ligne FAST F2 (La Vatine / Parc de la Vatine <> Tamarelle)
	 */
	F2("F2", 91, new String[]{"Tamarelle+BIHOREL", "La+Vatine+-+Centre+Commercial+MT-ST-AIGNAN%22%2C%222%22%3A%22Parc+de+la+Vatine+MT-ST-AIGNAN"}),
	/**
	 * Ligne FAST F3 (Théâtre des Arts <> Pôle Multimodal d'Oissel)
	 */
	F3("F3", 97, new String[]{"P%C3%B4le+Multimodal+OISSEL", "Th%C3%A9%C3%A2tre+des+Arts+ROUEN"}),
	/**
	 * Ligne FAST F4 (Hameau de Frévaux <> Mont-Riboudet Kindarena)
	 */
	F4("F4", 109, new String[]{"Mont-Riboudet+Kindarena+ROUEN", "Hameau+de+Fr%C3%A9vaux+MALAUNAY"}),
	/**
	 * Ligne FAST F5 (Théâtre des Arts <> Lycée Galilée)
	 */
	F5("F5", 118, new String[]{"Lyc%C3%A9e+Galil%C3%A9e+FRANQUEVILLE-SAINT-PIERRE", "Th%C3%A9%C3%A2tre+des+Arts+ROUEN"}),
	
	/**
	 * Ligne de bus régulière 5 (Collège Jules Verne <> Martainville)
	 */
	_5("5", 92, new String[]{"Martainville+ROUEN", "Coll%C3%A8ge+Jules+Verne+DEVILLE-LES-ROUEN"}),
	/**
	 * Ligne de bus régulière 6 (Beauvoisine <> Les Bouttières)
	 */
	_6("6", 93, new String[]{"Les+Boutti%C3%A8res+GRAND-COURONNE", "Beauvoisine+ROUEN"}),
	/**
	 * Ligne de bus régulière 8 (Longs Vallons / Ecole Moulin <> Ile Lacroix)
	 */
	_8("8", 95, new String[]{"Ile+Lacroix+ROUEN", "Longs+Vallons+NOTRE-DAME-DE-BONDEVILLE%22%2C%222%22%3A%22Ecole+Moulin+NOTRE-DAME-DE-BONDEVILLE%22%2C%223%22%3A%22Th%C3%A9%C3%A2tre+des+Arts+ROUEN"}),
	/**
	 * Ligne de bus régulière 9 (E. Lacroix <> Chapelle Saint-Siméon)
	 */
	_9("9", 96, new String[]{"E.+Lacroix+SAINT-PIERRE-DE-MANNEVILLE", "Chapelle+Saint-Sim%C3%A9on+D%C3%89VILLE-L%C3%88S-ROUEN"}),
	/**
	 * Ligne de bus régulière 11 (Collège L. de Vinci <> Grand Val)
	 */
	_11("11", 106, new String[]{"Grand+Val+AMFREVILLE-LA-MIVOIE", "Coll%C3%A8ge+L.+de+Vinci+BOIS-GUILLAUME"}),
	/**
	 * Ligne de bus régulière 13 (Hôtel de Ville de Rouen <> Mairie de Belbeuf / Ecole de Musique)
	 */
	_13("13", 108, new String[]{"Mairie+BELBEUF%22%2C%222%22%3A%22%C3%89cole+de+Musique+BOOS", "H%C3%B4tel+de+Ville+ROUEN"}),
	/**
	 * Ligne de bus régulière 20 (Le Chapitre <> Mairie de Saint-Aubin-Epinay)
	 */
	_20("20", 110, new String[]{"Rue+de+l'%C3%89glise+SAINT-L%C3%89GER-DU-BOURG-DENIS%22%2C%222%22%3A%22Mairie+SAINT-AUBIN-%C3%89PINAY%22%2C%223%22%3A%22H%C3%B4tel+de+Ville+ROUEN", "Le+Chapitre+BIHOREL"}),
	/**
	 * Ligne de bus régulière 22 (Boulingrin <> Bois Tison)
	 */
	_22("22", 124, new String[]{"Bois+Tison+SAINT-JACQUES-SUR-DARN%C3%89TAL", "Boulingrin+ROUEN"}),
	/**
	 * Ligne de bus régulière 26 (Salle des Fêtes de Saint-Pierre-de-Varengeville <> Mont-Riboudet Kindarena)
	 */
	_26("26", 125, new String[]{"", "Mont-Riboudet+Kindarena+ROUEN"}),
	/**
	 * Ligne de bus régulière 27 (Bel Air <> Georges Braque / Gare de Saint-Etienne)
	 */
	_27("29", 126, new String[]{"Gare+de+Saint-Etienne+SAINT-%C3%89TIENNE-DU-ROUVRAY", "Bel+Air+PETIT-COURONNE%22%2C%222%22%3A%22Lyc%C3%A9e+Val+de+Seine+GRAND+QUEVILLY"}),
	/**
	 * Ligne de bus régulière 29 (Route de Montville <> Gare Routière de Rouen)
	 */
	_29("29", 127, new String[]{"Route+de+Montville+MALAUNAY", "Gare+Routi%C3%A8re+ROUEN"}),
	/**
	 * Ligne de bus régulière 30 (Caudebec Quai <> Gare Routière de Rouen)
	 */
	_30("30", 128, new String[]{"", "Gare+Routi%C3%A8re+ROUEN"}),
	/**
	 * Ligne de bus régulière 32 (Champ de Foire <> Théâtre des Arts)
	 */
	_32("32", 141, new String[]{"Champ+de+Foire+ELBEUF", "Th%C3%A9%C3%A2tre+des+Arts+ROUEN"}),
	/**
	 * Ligne de bus régulière 33 (Pont de la Chapelle <> Théâtre des Arts)
	 */
	_33("33", 144, new String[]{"Pont+de+la+Chapelle+ST-ETIENNE-DU-ROUVRAY", "Th%C3%A9%C3%A2tre+des+Arts+ROUEN"}),
	/**
	 * Ligne de bus régulière 34 (Théâtre des Arts <> Vesta)
	 */
	_34("34", 211, new String[]{"Vesta+PETIT-QUEVILLY", "Th%C3%A9%C3%A2tre+des+Arts+ROUEN"}),
	/**
	 * Ligne de bus régulière 37 (Plaine de la Ronce <> Les Bosquets ou Hauts Poiriers)
	 */
	_37("37", 216, new String[]{"", ""}),
	/**
	 * Ligne de bus régulière 38 (Mont Pilon <> Mairie de Montmain)
	 */
	_38("38", 164, new String[]{"", ""}),
	/**
	 * Ligne de bus régulière 39 (Rue du Coq <> Lycée Fernand Léger)
	 */
	_39("39", 165, new String[]{"Rue+du+Coq+LA+BOUILLE", "Lyc%C3%A9e+Fernand+L%C3%A9ger+GRAND-COURONNE"}),
	/**
	 * Ligne de bus régulière 40 (La Varenne <> Boulingrin)
	 */
	_40("40", 166, new String[]{"Boulingrin+ROUEN", "La+Varenne+MONT-SAINT-AIGNAN"}),
	/**
	 * Ligne de bus régulière 41 (Ancienne Mare <> La Bastille)
	 */
	_41("41", 168, new String[]{"La+Bastille+SOTTEVILLE-LES-ROUEN", "Ancienne+Mare+PETIT-QUEVILLY"}),
	/**
	 * Ligne de bus régulière 42 (Centre Routier <> La Houssière)
	 */
	_42("42", 169, new String[]{"La+Houssi%C3%A8re+SAINT-ETIENNE-DU-ROUVRAY", "Centre+Routier+GRAND+QUEVILLY"}),
	/**
	 * Ligne de bus régulière 43 (Place du Vivier <> Bois des Dames)
	 */
	_43("43", 170, new String[]{"", ""}),
	/**
	 * Ligne de bus régulière 88 (Centre Coiffier <> Lycée Fernand Léger)
	 */
	_88("88", 174, new String[]{"", ""}),
	/**
	 * Ligne de bus régulière A (Mairie de Saint-Pierre-Les-Elbeuf <> Mairie de Cléon)
	 */
	A("A", 111, new String[]{"Mairie+SAINT-PIERRE-LES-ELBEUF", "Mairie+CL%C3%89ON"}),
	/**
	 * Ligne de bus régulière B (Parc Saint-Cyr <> Ecole de La Londe)
	 */
	B("B", 112, new String[]{"Parc+Saint-Cyr+ELBEUF", "Ecole+de+La+Londe+LA+LONDE"}),
	/**
	 * Ligne de bus régulière C (Bosc Tard <> Les Arches)
	 */
	C("C", 113, new String[]{"Bosc+Tard+SAINT-PIERRE-L%C3%88S-ELBEUF%22%2C%222%22%3A%22Li%C3%A9rout+SAINT-PIERRE-L%C3%88S-ELBEUF", "Les+Arches+ELBEUF"}),
	/**
	 * Ligne de bus régulière E (Mairie de Cléon <> Moulin Saint-Etienne)
	 */
	E("E", 114, new String[]{"Mairie+CL%C3%89ON", "Moulin+Saint-Etienne+ELBEUF"}),
	/**
	 * Ligne de bus régulière F (Z.I. L'Oison <> Pôle Multimodal d'Oissel)
	 */
	F("F", 115, new String[]{"Z.I.+L'Oison+SAINT-PIERRE-L%C3%88S-ELBEUF", "P%C3%B4le+Multimodal+OISSEL"}),
	/**
	 * Ligne de bus régulière H (Hôpital de Louviers <> Hôpital Intercommunal d'Elbeuf)
	 */
	H("H", 107, new String[]{"H%C3%B4pital+LOUVIERS", "H%C3%B4pital+Intercommunal+d'Elbeuf+SAINT-AUBIN-L%C3%88S-ELBEUF"}),
	/**
	 * Ligne de bus régulière D1 (Parc Saint-Cyr <> Mairie de Cléon)
	 */
	D1("D1", 116, new String[]{"", ""}),
	/**
	 * Ligne de bus régulière D2 (Mairie de Saint-Pierre-Lès-Elbeuf <> Pôle Multimodal d'Oissel)
	 */
	D2("D2", 117, new String[]{"", ""}),
	
	/**
	 * Ligne taxis t35 (Sente d'Houdeville <> Bérat)
	 */
	t35("t35", 156, new String[]{"Sente+d'Houdeville+CANTELEU%22%2C%222%22%3A%22Mont-Riboudet+Kindarena+ROUEN", "B%C3%A9rat+MAROMME-LA+MAINE"}),
	/**
	 * Ligne taxis t53 (Coteaux du Larmont <> Boulingrin)
	 */
	t53("t53", 171, new String[]{"Coteaux+du+Larmont+ROUEN", "Boulingrin+ROUEN"}),
	/**
	 * Ligne taxis t54 (Pont d'Eauplet <> Dieppedalle Rive Gauche)
	 */
	t54("t54", 172, new String[]{"Pont+d'Eauplet+SOTTEVILLE-LES-ROUEN%22%2C%222%22%3A%22H%C3%B4tel+de+Ville+SOTTEVILLE-LES-ROUEN", "Dieppedalle+Rive+Gauche+GRAND+QUEVILLY"}),
	
	/**
	 * Ligne AlloBus Orival (Champ de Foire <> Hôpital d'Oissel)
	 */
	ORIVAL("Orival", 119, new String[] {"Champ+de+Foire+ELBEUF", "H%C3%B4pital+OISSEL"}),
	/**
	 * Ligne AlloBus Bédanne (Champ de Foire <> Pôle Multimodal d'Oissel / Casanova)
	 */
	BEDANNE("Bédanne", 120, new String[] {"Champ+de+Foire+ELBEUF", "P%C3%B4le+Multimodal+OISSEL%22%2C%222%22%3A%22P%C3%B4le+Multimodal+OISSEL+%2F+Casanova+TOURVILLE-LA-RIVI%C3%88RE"}),
	/**
	 * Ligne AlloBus Freneuse (Champ de Foire <> Pôle Multimodal d'Oissel / Casanova)
	 */
	FRENEUSE("Freneuse", 121, new String[] {"Champ+de+Foire+ELBEUF", "P%C3%B4le+Multimodal+OISSEL+%2F+Casanova+TOURVILLE-LA-RIVI%C3%88RE"}),
	/**
	 * Ligne AlloBus La Londe (Champ de Foire <> Écameaux Le Moulin)
	 */
	LA_LONDE("La Londe", 122, new String[] {"Les+Ecameaux+ELBEUF", "Champ+de+Foire+ELBEUF"}),
	/**
	 * Ligne AlloBus Saint-Pierre (Ecole Camus <> Z.I. L'Oison)
	 */
	ST_PIERRE("St-Pierre", 123, new String[] {"J.E.+Blanche+SAINT-PIERRE-L%C3%88S-ELBEUF%22%2C%222%22%3A%22%C3%89cole+Camus+SAINT-PIERRE-L%C3%88S-ELBEUF", "Z.I.+L'Oison+SAINT-PIERRE-L%C3%88S-ELBEUF%22%2C%222%22%3A%22Z.I.+L'Oison+%2F+Bouteille+de+Bois+SAINT-PIERRE-L%C3%88S-ELBEUF"});
	
	private String name;
	private int lineId;
	private String[] terminus;

	private Line(String name, int i, String[] terminus) {
		this.name = name;
		this.lineId = i;
		this.terminus = terminus;
	}
	
	
	/**
	 * Get the line's name.
	 * 
	 * @return The name of the line.
	 */
	public final String getName() { return this.name; }
	
	/**
	 * Get the id of the line.
	 * 
	 * @return The id of the line.
	 */
	public final int getId() { return this.lineId; }
	
	/**
	 * Get terminus of the line. The format is the link one.
	 * 
	 * @param sens	The direction you want (1/2).
	 * @return 		The terminus of this direction.
	 */
	public final String getTerminus(int sens) {
		if(sens > 2) sens = 2;
		if(sens < 1) sens = 1;
		return this.terminus[sens-1];
	}
	
	/**
	 * Get the terminus of the line in a readable format.
	 * 
	 * @param sens	The direction you want (1/2).
	 * @return		The terminus of this direction (readable).
	 */
	public final String getDisplayTerminus(int sens) {
		if(sens > 2) sens = 2;
		if(sens < 1) sens = 1;
		String t = convertString(this.terminus[sens-1]);
		return t;
	}
	
	/**
	 * Get all terminus of the line.
	 * 
	 * @return The terminus table.
	 */
	public final String[] getTerminus() { return this.terminus; }
	
	/**
	 * Get all terminus of the line in a readable table.
	 * 
	 * @return	Terminus of the line readable.
	 */
	public final String[] getDisplayTerminus() {
		String[] t = new String[2];
		t[0] = convertString(this.terminus[0]);
		t[1] = convertString(this.terminus[1]);
		return t;
	}
	
	/**
	 * Get the line using its id.
	 * 
	 * @param id	The id of the station you want.
	 * @return		The line with the given id or null;
	 */
	public static final Line getLineById(int id) {
		for(Line line : Line.values()) {
			if(line.getId() == id) return line;
		}
		return null;
	}
	
	/**
	 * Get the line using its name.
	 * 
	 * @param name	The name of the station you want.
	 * @return		The line with the given name or null.
	 */
	public static final Line getLineByName(String name) {
		for(Line line : Line.values()) {
			if(line.getName().equals(name)) return line;
		}
		return null;
	}
	
	@Override
	public String toString() { return this.name; }
	
	/**
	 * Replace %char in the given String into UTF char.
	 * 
	 * @param s	The String to convert.
	 * @return	The converted String.
	 */
	private static final String convertString(String s) {
		s = s.replace("%22%2C%222%22%3A%22", " / ");
		s = s.replace("+", " ");
		s = s.replace("%C3%88", "È");
		s = s.replace("%C3%89", "É");
		s = s.replace("%C3%A2", "â");
		s = s.replace("%C3%A8", "è");
		s = s.replace("%C3%A9", "é");
		s = s.replace("%C3%B4", "ô");
		return s;
	}
	
}
