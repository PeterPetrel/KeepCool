package de.fernuni.keepCool.client.elements;

import java.awt.Button;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import de.fernuni.keepCool.client.exceptions.NoPossibleMoveException;
import de.fernuni.keepCool.client.helper.Messages;
import de.fernuni.keepCool.client.ui.QuasselUIv2;

public class Standard4PlayerRules implements Rules {

	String leveltext = Messages.getString("Standard4PlayerRules.FieldString"); //$NON-NLS-1$
	Vector<KeepCoolColor> colors;
	// Map, die als Key der Spielernummer (0,1,2,3) seine jeweilige Startposition zuordnet
	Map <Integer,Integer> startPosition = new HashMap <Integer,Integer>();

	@SuppressWarnings("unused")
	private Standard4PlayerRules() {
	}

	public Standard4PlayerRules(Vector<KeepCoolColor> colors) {
		this.colors = colors;
	}

	@Override
	public Vector<Dot> calculateRegularMoves(Vector<Dot> possibleMoves,
			int steps) throws NoPossibleMoveException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Board createBoard() {
		QuasselUIv2 ui = new QuasselUIv2();
		String aktDot;
		Button[][] btns;
		for (int x = 0; x < 11; x++) {
			System.out.println("");
			for (int y = 0; y < 11; y++) {
				aktDot = leveltext
						.substring(22 * x + 2 * y, 22 * x + 2 * y + 2);
				System.out.print(aktDot);
				if (aktDot.equals("  ")) {
					ui.modifyButton(x, y, "  ");
				} else if (aktDot.substring(0, 1).equals("a")) {
					ui.modifyButton(x, y, colors.get(0).value);
				} else if (aktDot.substring(0, 1).equals("b")) {
					ui.modifyButton(x, y, colors.get(1).value);
				} else if (aktDot.substring(0, 1).equals("c")) {
					ui.modifyButton(x, y, colors.get(2).value);
				} else if (aktDot.substring(0, 1).equals("d")) {
					ui.modifyButton(x, y, colors.get(3).value);
				} else {
					// hier nur noch nummerfelder
					try {
						
						@SuppressWarnings("unused")
						//setze Startpositionen und färbe Felder ein
						int num = Integer.parseInt(aktDot);
						if (num == 0){
							ui.modifyButton(x, y,colors.get(1).value );
							startPosition.put(1, 0);
						}
						if (num == 10){
							ui.modifyButton(x, y,colors.get(2).value );
							startPosition.put(2, 10);
						}
						if (num == 20){
							ui.modifyButton(x, y,colors.get(3).value );
							startPosition.put(3, 20);
						}
						if (num == 30){
							ui.modifyButton(x, y,colors.get(0).value );
							startPosition.put(0, 30);
						}
						ui.modifyButton(x, y, aktDot);
					} catch (NumberFormatException e) {
						// sollte nicht mehr auftreten
						e.printStackTrace();
					}

				}

			}
		}

		return null;
	}
}
