package de.fernuni.keepCool.client.elements;

public abstract class Player {

	KeepCoolColor color;
	Game game;

	/**
	 * Bitte das Spiel, an dem der Spieler teilnimmt, den Stein t die Anzahl
	 * number Stellen weiterzusetzen. Das Spiel gibt exc. zur�ck falls nicht
	 * m�glich
	 * 
	 * @param d
	 *            = Feld von dem gesetzt werden soll
	 * @param number
	 *            = Anzahl der Schritte
	 */
	protected void moveToken(Dot d, int number) {
		// delegiert an die Klasse game weiter, diese pr�ft und setzt ggf. oder
		// wirft exception zur�ck
		game.performMove(d, number);
	}
}
