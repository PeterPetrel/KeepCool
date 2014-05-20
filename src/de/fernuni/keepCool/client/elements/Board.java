package de.fernuni.keepCool.client.elements;

import java.util.Vector;

import de.fernuni.keepCool.client.exceptions.MoveNotPossibleException;
import de.fernuni.keepCool.client.ui.FieldUI;

/**
 * @author fernuni
 * 
 *         Repräsentiert ein Spielbrett. Alle Elemente des Spiels sind in dieser
 *         Klasse gesammelt. DIese Klasse wird von "Game" genutzt. Alle Logik
 *         liegt dort. Hier wird nur ausgeführt.
 */
public class Board {

	Vector<Dot> dots;
	Vector<Token> inGameTokens;// die Spielsteine im Spiel
	Vector<Token> outGameTokens;// ... die Steine im Aus
	Vector<Token> finishGameToken; // ... und die schon fertig sind (Position
									// wichtig!)
									// TODO: Muss geändert werden,
									// damit man darin setzen kann.
	GameMode mode;
	FieldUI fieldUI;

	Board(GameMode mode, Vector tokens, FieldUI fieldUI) {
		// Spiel wird frisch gestartet, alles was drauf ist, wird von den Rules
		// erstellt, die am Game hängen und dem Game übergeben.
		this.mode = mode;
		// alle Steine werden ins Aus gestellt zum Start
		this.outGameTokens = tokens;
	}

	/**
	 * setze Spielstein von Feld from nach Feld to. Schlagen und in Sicherheit
	 * setzen geht anders
	 * 
	 * @throws MoveNotPossibleException
	 */
	void setInGame(Dot from, Dot to) throws MoveNotPossibleException {

		if (from.getToken() == null) {
			throw new MoveNotPossibleException(from, to);
		}
		Token actor = from.getToken();
		from.setToken(null);
		if (to.getToken() != null) {
			// wir müssten zunächst schlagen, der Zug ist so nicht möglich
			throw new MoveNotPossibleException(from, to);
		}
		to.setToken(actor);
	}

	/**
	 * bewegt Figur von from nach to schlagend, d,h, am Zielfeld wird
	 * geschmissen dann normal gesetzt
	 * 
	 * @param from
	 * @param to
	 * @throws MoveNotPossibleException
	 */
	void beat(Dot from, Dot to) throws MoveNotPossibleException {
		if (to.getToken() == null) {
			throw new MoveNotPossibleException(from, to);
		}
		outGameTokens.add(to.getToken());
		inGameTokens.remove(to.getToken());
		to.setToken(null);
		setInGame(from, to);
	}

}
