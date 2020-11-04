package fr.alba0404.astuce.api.enums;

/**
 * All lines of the Astuce transport network.
 * @author Alba0404
 *
 */
public enum Line {
	
	METRO(175),
	
	T1(176),
	T2(177),
	T3(178),
	T4(214),
	
	F1(94),
	F2(91),
	F3(97),
	F4(109),
	F5(118),
	
	_5(92),
	_6(93),
	_8(95),
	_9(96),
	_11(106),
	_13(108),
	_20(110),
	_22(124),
	_26(125),
	_27(126),
	_29(127),
	_30(128),
	_32(141),
	_33(144),
	_34(211),
	_37(216),
	_38(164),
	_39(165),
	_40(166),
	_41(168),
	_42(169),
	_43(170),
	_88(174),
	A(111),
	B(112),
	C(113),
	E(114),
	F(115),
	H(107),
	D1(116),
	D2(117),
	
	t35(156),
	t53(171),
	t54(172);
	
	
	private int lineId;

	private Line(int i) {
		this.lineId = i;
	}
	
	public int getId() { return lineId; }
	

}
