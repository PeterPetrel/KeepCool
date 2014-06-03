package de.fernuni.keepCool.client.ui;

import javax.swing.JButton;

public class KeepCoolDot extends JButton {

	private int number;

	public KeepCoolDot(String string) {
		super(string);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
