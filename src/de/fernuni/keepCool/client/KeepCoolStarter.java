package de.fernuni.keepCool.client;

import java.util.Arrays;
import java.util.Vector;

import de.fernuni.keepCool.client.elements.KeepCoolColor;
import de.fernuni.keepCool.client.elements.Rules;
import de.fernuni.keepCool.client.elements.Standard4PlayerRules;

public class KeepCoolStarter {

	public static void main(String[] args) {
		// Einstiegspunkt der ClientApplikation.
		Rules rule = new Standard4PlayerRules(new Vector(
				Arrays.asList(new KeepCoolColor[] { KeepCoolColor.BLACK,
						KeepCoolColor.BLUE, KeepCoolColor.GREY,
						KeepCoolColor.YELLOW })));

		rule.createBoard();
	}

}
