package de.fernuni.keepCool.client.elements;

public abstract class Player {

	KeepCoolColor color;
	Game game;
	int[] tokens;
	
	public Player(KeepCoolColor color, Game game, int[] tokens) {
		this.color = color;
		this.game = game;
		this.tokens = tokens;
	}

	/**
	 * Bitte das Spiel, an dem der Spieler teilnimmt, den Stein t die Anzahl
	 * number Stellen weiterzusetzen. Das Spiel gibt exc. zurück falls nicht
	 * möglich
	 * 
	 * @param d
	 *            = Feld von dem gesetzt werden soll
	 * @param number
	 *            = Anzahl der Schritte
	 */
	
	protected void moveToken(Dot d, int number) {
		// delegiert an die Klasse game weiter, diese prüft und setzt ggf. oder
		// wirft exception zurück
		game.performMove(d, number);
	}
}
