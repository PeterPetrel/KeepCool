package de.fernuni.keepCool.client.elements;

/**
 * @author fernuni Definiert GrundParameter des Spiels, Anzahl der Spieler,
 *         Anzahl der Felder, Anzahl der Figuren eines Spielers
 */
public enum GameMode {
	Classic4(4, 40, 4, "Classic Four"), Classic6(6, 48, 4, "Classic Six");
	int players, dots, tokensPerPlayer;
	String name;

	private GameMode(int players, int dots, int tokensPerPlayer, String name) {

		this.players = players;
		this.dots = dots;
		this.tokensPerPlayer = tokensPerPlayer;
		this.name = name;
	}
}
