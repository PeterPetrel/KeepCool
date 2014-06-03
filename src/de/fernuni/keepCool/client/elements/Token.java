package de.fernuni.keepCool.client.elements;

import de.fernuni.keepCool.client.ui.TokenUI;

/**
 * @author fernuni
 * 
 *         Charakterisiert eine Spielfigur. Hat Color = die Farbe der Figur
 */
public class Token {

	KeepCoolColor color;
	TokenUI tokenUI;
	Dot dot;

	private Token() {
	}

	Token(KeepCoolColor color) {
		this();
		this.color = color;
	}

}
