package de.fernuni.keepCool.client.elements;

/**
 * @author fernuni
 * 
 *         Enum repraesentiert die Spielfarben fuer 6 Spieler  ;-) ... 
 *         mit Farben die auch Joerg gucken kann      
 * 
 */
public enum Color {
	BLACK("0x000000"), BLUE("0x0000FF"), RED("0xFF0000"), YELLOW("0xFFFF00"), 
	TURQUOISE("0x39C3DF"), GREY("0xACACAC");

	String value;

	private Color(String value) {
		this.value = value;
	}

}
