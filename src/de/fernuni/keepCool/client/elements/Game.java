package de.fernuni.keepCool.client.elements;

import java.util.Vector;

/**
 * @author fernuni
 * 
 *         Zentrale Klasse für ein Spiel. Hier sind die Spieler, das Spielbrett
 *         und die Spiellogik vereint. Diese Klasse vermittelt also zwischen
 *         diesen. Ebenfalls läuft hier der Spielablauf ab.
 * 
 */
public class Game {

	private Board board;
	private Rules rules;
	private Vector<Player> players;
	private Dice dice;

	private Game() {
	}

	public Game(Rules rules, Vector<Player> players) {
		this();
		this.dice = new Dice();
		this.rules = rules;
		this.players = players;
		this.board = rules.createBoard();
		// TODO prüfen, ob farben eindeutig dem Brett zugeordnet werden kann
	}

	public void performMove(Dot d, int number) {
		// TODO implementieren

	}

	// TODO Klasse zuende schreiben
}
