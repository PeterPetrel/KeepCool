package de.fernuni.keepCool.client.elements;

/**
 * @author fernuni
 * 
 *         Klasse reprasentiert ein "normales" Feld auf dem Spielbrett. Kann
 *         einen Token aufnehmen.
 */
public class Dot {

	private Token token;

	public Token getToken() {
		return token;
	}

	void setToken(Token token) {
		if (this.token == null) {
			this.token = token;
		}
		else {
			if (this.token.color != token.color) {
				// setze vorhandenes Token auf Start
			}
			else {
				// Move not possible exception
			}
		}
	}

}
