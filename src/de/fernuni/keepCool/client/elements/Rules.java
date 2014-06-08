package de.fernuni.keepCool.client.elements;

import java.util.Vector;

import de.fernuni.keepCool.client.exceptions.NoPossibleMoveException;

/**
 * @author $M
 * 
 *         erstellt neue Bretter und enthält die Logik regelkonforme Züge
 *         vorzuschlagen
 */
public interface Rules {

	/**
	 * Filtert die eingegebene Liste mit möglichen Zügen durch reguläre Züge
	 * 
	 * @param possibleMoves
	 *            Liste mit technisch möglichen Zügen
	 * @param steps
	 *            geworfene Zahl
	 * @return Liste mit Zügen, um sie im UI anzuzeigen und dem Spieler diese
	 *         zur Wahl zu geben
	 * @throws NoPossibleMoveException
	 *             falls kein Zug möglich ist, Game muss darauf reagieren und
	 *             den nächsten Spieler drannehmen
	 */
	public Vector<Dot> calculateRegularMoves(Vector<Dot> possibleMoves,
			int steps) throws NoPossibleMoveException;

	/**
	 * Erstellt und initialisiert ein Spielbrett nach den gültigen Regeln, die
	 * hierdurch definiert werden
	 * 
	 * @return Spielbrett mit Figuren.
	 */
	public Board createBoard();
}
