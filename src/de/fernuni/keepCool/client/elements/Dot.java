package de.fernuni.keepCool.client.elements;

import de.fernuni.keepCool.client.exceptions.MoveNotPossibleException;

/**
 * @author fernuni
 * 
 *         Klasse repräsentiert ein "normales" Feld auf dem Spielbrett. Kann
 *         einen Token aufnehmen.
 */
public class Dot {

	private Token token;

	public Token getToken() {
		return token;
	}

	void setToken(Token token) throws MoveNotPossibleException {
		if (this.token == null) {
			this.token = token;
		} else {
			// Fall dass bereits Token vorhanden sollte schon abgefangen sein
			throw new MoveNotPossibleException(token.dot, this);
		}
	}

}
