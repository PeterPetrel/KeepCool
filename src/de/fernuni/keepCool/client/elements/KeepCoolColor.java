package de.fernuni.keepCool.client.elements;

import java.awt.Color;

/**
 * @author fernuni
 * 
 *         Enum repraesentiert die Spielfarben fuer 6 Spieler ;-) ... mit Farben
 *         die auch Joerg gucken kann
 * 
 */
public enum KeepCoolColor {
	BLACK("0x000000"), BLUE("0x0000FF"), RED("0xFF0000"), YELLOW("0xFFFF00"), TURQUOISE(
			"0x39C3DF"), GREY("0xACACAC");

	String value;

	private KeepCoolColor(String value) {
		this.value = value;
	}

	public Color getAWTColor(KeepCoolColor color) {

		return Color.decode(color.value);
	}

}
