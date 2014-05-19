package de.fernuni.keepCool.client.elements;

/**
 * @author fernuni
 * 
 *         Enum repr�sentiert die Spielfarben, sollte f�r 6 Spieler erweitert
 *         werden ;-) ... mit Farben die auch ich gucken kann - J�rg
 */
public enum Color {
	BLACK("0x000000"), BLUE("0x0000FF"), RED("0xFF0000"), YELLOW("0xFFFF00");

	String value;

	private Color(String value) {
		this.value = value;
	}

}
