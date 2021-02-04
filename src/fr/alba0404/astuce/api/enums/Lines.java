package fr.alba0404.astuce.api.enums;

/**
 * Lines of the Astuce transport network.
 * 
 * @author Alba0404
 * @version 2.0
 */
public enum Lines {
	
	METRO(175, new String[]{"Technop%C3%B4le+SAINT-ETIENNE-DU-ROUVRAY%22%2C%222%22%3A%22Georges+Braque+GRAND+QUEVILLY", "Boulingrin+ROUEN"}),
	
	T1(176, new String[]{"CHU+Charles+Nicolle+ROUEN", "Mont+aux+Malades+MONT-SAINT-AIGNAN"}),
	T2(177, new String[]{"Tamarelle+BIHOREL", "Mairie-V.+Schoelcher+N.-D.-DE-BONDEVILLE"}),
	T3(178, new String[]{"Dur%C3%A9cu-Lavoisier+DARN%C3%89TAL", "Monet+CANTELEU"}),
	T4(214, new String[]{"Z%C3%A9nith+-+Parc+Expo+GRAND+QUEVILLY", "Boulingrin+ROUEN"}),
	
	F1(94, new String[]{"Stade+Diochon+PETIT-QUEVILLY", "Plaine+de+la+Ronce+ISNEAUVILLE"}),
	F2(91, new String[]{"Tamarelle+BIHOREL", "La+Vatine+-+Centre+Commercial+MT-ST-AIGNAN%22%2C%222%22%3A%22Parc+de+la+Vatine+MT-ST-AIGNAN"}),
	F3(97, new String[]{"P%C3%B4le+Multimodal+OISSEL", "Th%C3%A9%C3%A2tre+des+Arts+ROUEN"}),
	F4(109, new String[]{"", ""}),
	F5(118, new String[]{"Lyc%C3%A9e+Galil%C3%A9e+FRANQUEVILLE-SAINT-PIERRE", "Th%C3%A9%C3%A2tre+des+Arts+ROUEN"}),
	
	_5(92, new String[]{"", ""}),
	_6(93, new String[]{"Les+Boutti%C3%A8res+GRAND-COURONNE", "Beauvoisine+ROUEN"}),
	_8(95, new String[]{"Ile+Lacroix+ROUEN", "Longs+Vallons+NOTRE-DAME-DE-BONDEVILLE%22%2C%222%22%3A%22Ecole+Moulin+NOTRE-DAME-DE-BONDEVILLE%22%2C%223%22%3A%22Th%C3%A9%C3%A2tre+des+Arts+ROUEN"}),
	_9(96, new String[]{"", ""}),
	_11(106, new String[]{"Grand+Val+AMFREVILLE-LA-MIVOIE", "Coll%C3%A8ge+L.+de+Vinci+BOIS-GUILLAUME"}),
	_13(108, new String[]{"Mairie+BELBEUF%22%2C%222%22%3A%22%C3%89cole+de+Musique+BOOS", "H%C3%B4tel+de+Ville+ROUEN"}),
	_20(110, new String[]{"Rue+de+l'%C3%89glise+SAINT-L%C3%89GER-DU-BOURG-DENIS%22%2C%222%22%3A%22Mairie+SAINT-AUBIN-%C3%89PINAY%22%2C%223%22%3A%22H%C3%B4tel+de+Ville+ROUEN", "Le+Chapitre+BIHOREL"}),
	_22(124, new String[]{"Bois+Tison+SAINT-JACQUES-SUR-DARN%C3%89TAL", "Boulingrin+ROUEN"}),
	_26(125, new String[]{"", ""}),
	_27(126, new String[]{"Gare+de+Saint-Etienne+SAINT-%C3%89TIENNE-DU-ROUVRAY", "Bel+Air+PETIT-COURONNE%22%2C%222%22%3A%22Lyc%C3%A9e+Val+de+Seine+GRAND+QUEVILLY"}),
	_29(127, new String[]{"", ""}),
	_30(128, new String[]{"", ""}),
	_32(141, new String[]{"Champ+de+Foire+ELBEUF", "Th%C3%A9%C3%A2tre+des+Arts+ROUEN"}),
	_33(144, new String[]{"Pont+de+la+Chapelle+ST-ETIENNE-DU-ROUVRAY", "Th%C3%A9%C3%A2tre+des+Arts+ROUEN"}),
	_34(211, new String[]{"Vesta+PETIT-QUEVILLY", "Th%C3%A9%C3%A2tre+des+Arts+ROUEN"}),
	_37(216, new String[]{"", ""}),
	_38(164, new String[]{"", ""}),
	_39(165, new String[]{"Rue+du+Coq+LA+BOUILLE", "Lyc%C3%A9e+Fernand+L%C3%A9ger+GRAND-COURONNE"}),
	_40(166, new String[]{"Boulingrin+ROUEN", "La+Varenne+MONT-SAINT-AIGNAN"}),
	_41(168, new String[]{"La+Bastille+SOTTEVILLE-LES-ROUEN", "Ancienne+Mare+PETIT-QUEVILLY"}),
	_42(169, new String[]{"La+Houssi%C3%A8re+SAINT-ETIENNE-DU-ROUVRAY", "Centre+Routier+GRAND+QUEVILLY"}),
	_43(170, new String[]{"", ""}),
	_88(174, new String[]{"", ""}),
	A(111, new String[]{"", ""}),
	B(112, new String[]{"", ""}),
	C(113, new String[]{"", ""}),
	E(114, new String[]{"", ""}),
	F(115, new String[]{"", ""}),
	H(107, new String[]{"", ""}),
	D1(116, new String[]{"", ""}),
	D2(117, new String[]{"", ""}),
	
	t35(156, new String[]{"", ""}),
	t53(171, new String[]{"Coteaux+du+Larmont+ROUEN", "Boulingrin+ROUEN"}),
	t54(172, new String[]{"Pont+d'Eauplet+SOTTEVILLE-LES-ROUEN%22%2C%222%22%3A%22H%C3%B4tel+de+Ville+SOTTEVILLE-LES-ROUEN", "Dieppedalle+Rive+Gauche+GRAND+QUEVILLY"});
	
	
	private int lineId;
	private String[] terminus;

	private Lines(int i, String[] terminus) {
		this.lineId = i;
		this.terminus = terminus;
	}
	
	
	/**
	 * Get the id of the station.
	 * 
	 * @return The id of the station.
	 */
	public int getId() { return this.lineId; }
	
	/**
	 * Get terminus of the line. The format is the link one.
	 * 
	 * @param sens The direction you want (1/2).
	 * @return The terminus of this direction.
	 */
	public String getTerminus(int sens) { return this.terminus[sens-1]; }

}
