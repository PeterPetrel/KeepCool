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
	 * Filtert die eingegebene Liste mit m�glichen Z�gen durch regul�re Z�ge
	 * 
	 * @param possibleMoves
	 *            Liste mit technisch m�glichen Z�gen
	 * @param steps
	 *            geworfene Zahl
	 * @return Liste mit Z�gen, um sie im UI anzuzeigen und dem Spieler diese
	 *         zur Wahl zu geben
	 * @throws NoPossibleMoveException
	 *             falls kein Zug m�glich ist, Game muss darauf reagieren und
	 *             den n�chsten Spieler drannehmen
	 */
	public Vector<Dot> calculateRegularMoves(Vector<Dot> possibleMoves,
			int steps) throws NoPossibleMoveException;

	/**
	 * Erstellt und initialisiert ein Spielbrett nach den g�ltigen Regeln, die
	 * hierdurch definiert werden
	 * 
	 * @return Spielbrett mit Figuren.
	 */
	public Board createBoard();
}
