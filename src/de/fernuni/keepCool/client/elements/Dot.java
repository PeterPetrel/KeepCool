package de.fernuni.keepCool.client.elements;

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

	void setToken(Token token) {
		this.token = token;
	}

}
