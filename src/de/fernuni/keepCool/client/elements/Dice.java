package de.fernuni.keepCool.client.elements;

import de.fernuni.keepCool.client.ui.DiceUI;

/**
 * @author fernuni
 * 
 *         Klasse repräsentiert den Spielwürfel. hat einen Wert, der per Zufall
 *         generiert wird zwischen 1 und 6
 */
public class Dice {
	double value;
	DiceUI diceUI;

	Dice() {
		throwDice();
	}

	double throwDice() {
		return value = Math.random() % 6 + 1;
	}
}
