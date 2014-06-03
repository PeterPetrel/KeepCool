package de.fernuni.keepCool.client.elements;

import java.awt.Button;
import java.util.Vector;

import de.fernuni.keepCool.client.exceptions.NoPossibleMoveException;
import de.fernuni.keepCool.client.helper.Messages;
import de.fernuni.keepCool.client.ui.QuasselUIv2;

public class Standard4PlayerRules implements Rules {

	String leveltext = Messages.getString("Standard4PlayerRules.FieldString"); //$NON-NLS-1$
	Vector<KeepCoolColor> colors;

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
						int num = Integer.parseInt(aktDot);
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
