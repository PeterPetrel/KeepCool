package de.fernuni.keepCool.client.elements;

import de.fernuni.keepCool.client.ui.DiceUI;

/**
 * @author fernuni
 * 
 *         Klasse repr�sentiert den Spielw�rfel. hat einen Wert, der per Zufall
 *         generiert wird zwischen 1 und 6
 */
public class Dice {
	int value;
	DiceUI diceUI;

	Dice() {
		throwDice();
	}

	int throwDice() {
		return value = (int)(Math.random() * 6 + 1);

	}
}
