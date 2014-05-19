package de.fernuni.keepCool.client.exceptions;

import de.fernuni.keepCool.client.elements.Dot;

/**
 * @author fernuni
 * 
 *         tritt bei der Ausführung eines Zuges auf, wenn Zug nicht möglich ist.
 *         Das spricht für einen Fehler in der Logik
 * 
 */
public class MoveNotPossibleException extends Exception {

	public MoveNotPossibleException(Dot from, Dot to) {
		System.out.println("Move was not possible:");
		System.out.println("From: "
				+ from.toString()
				+ " occupied with "
				+ ((from.getToken() == null) ? "nothing" : from.getToken()
						.toString()));
		System.out.println("To: "
				+ to.toString()
				+ " occupied with "
				+ ((from.getToken() == null) ? "nothing" : from.getToken()
						.toString()));
	}

	/**
	 * ID
	 */
	private static final long serialVersionUID = -5516150042465586982L;

}
