package de.fernuni.keepCool.client.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class QuasselUIv2 extends JFrame {

	private static final long serialVersionUID = 1737843765026864896L;
	private JMenuBar mnuBar;
	private JMenu mnuGame;
	private JMenuItem mnuGameExit;

	private JPanel pnlLeft, pnlRight, pnlBottom, pnlCenterMiddle;

	// private JTable table;
	private KeepCoolDot[][] btns;

	public KeepCoolDot[][] getBtns() {
		return btns;
	}

	public void setBtns(KeepCoolDot[][] btns) {
		this.btns = btns;
	}

	public void modifyButton(int x, int y, String mod) {
		switch (mod) {
		case "  ":
			btns[x][y].setVisible(false);
			break;
		case "empty":
			btns[x][y].setBackground(Color.WHITE);
			break;
		default:
			if (mod.startsWith("0x")) {
				btns[x][y].setBackground(Color.decode(mod));
			} else {
				// hier bleiben nur noch die Felder mit Zahlen übrig (sollten!!)
				try {
					int num = Integer.parseInt(mod);
					btns[x][y].setNumber(num);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			break;
		}
	}

	private JButton btnFirst, btnSecond, btnThird, btnPlayer1, btnPlayer2,
			btnPlayer3, btnPlayer4;

	public QuasselUIv2() {

		setTitle("Quasselgroup's Keep Cool UI Demo");

		setLayout(new BorderLayout());

		createWidgets();
		addWidgets();

		getContentPane().add(mnuBar, BorderLayout.NORTH);
		getContentPane().add(pnlLeft, BorderLayout.WEST);
		getContentPane().add(pnlRight, BorderLayout.EAST);
		getContentPane().add(pnlBottom, BorderLayout.SOUTH);
		getContentPane().add(pnlCenterMiddle, BorderLayout.CENTER);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	private void addWidgets() {
		// menu bar
		mnuBar.add(mnuGame);
		mnuGame.add(mnuGameExit);

		// bottom buttons
		pnlBottom.add(btnFirst);
		pnlBottom.add(btnSecond);
		pnlBottom.add(btnThird);

		// player buttons
		pnlLeft.add(btnPlayer1);
		pnlLeft.add(btnPlayer2);
		pnlLeft.add(btnPlayer3);
		pnlLeft.add(btnPlayer4);

		// middle of board

		addFieldElems(pnlCenterMiddle, btns);

		// max size
		pnlCenterMiddle.setMaximumSize(pnlCenterMiddle.getPreferredSize());
	}

	private void createWidgets() {
		// main menu & items
		mnuBar = new JMenuBar();
		mnuGame = new JMenu();
		mnuGameExit = new JMenuItem();

		// main window - panels & layouts
		pnlLeft = new JPanel();
		pnlLeft.setLayout(new BoxLayout(pnlLeft, BoxLayout.Y_AXIS));
		pnlRight = new JPanel();
		pnlRight.setLayout(new BoxLayout(pnlRight, BoxLayout.Y_AXIS));
		pnlBottom = new JPanel(new FlowLayout());

		// dots & start boxes
		pnlCenterMiddle = new JPanel(new GridLayout(11, 11));

		btns = fillField(11, 11, 50, 50);

		// buttons
		btnFirst = new JButton("Erster Button");
		btnSecond = new JButton("Zweiter Button");
		btnThird = new JButton("Dritter Button");

		btnPlayer1 = new JButton("Erster Spieler");
		btnPlayer2 = new JButton("Zweiter Spieler");
		btnPlayer3 = new JButton("Dritter Spieler");
		btnPlayer4 = new JButton("Vierter Spieler");

	}

	public KeepCoolDot[][] fillField(int row, int col, int width, int height) {
		KeepCoolDot[][] elems = new KeepCoolDot[row][col];
		for (int i = 0; i < elems.length; i++) {
			for (int j = 0; j < elems[i].length; j++) {
				elems[i][j] = new KeepCoolDot("x");
				// matrix[i][j].setMinimumSize(new Dimension(minWidth,
				// minHeight));
				elems[i][j].setPreferredSize(new Dimension(width, height));
				// matrix[i][j].setMaximumSize(new Dimension(maxWidth,
				// maxHeight));
				elems[i][j].setHorizontalAlignment(JTextField.CENTER);
			}
		}
		return elems;
	}

	public void addFieldElems(JPanel panel, JButton[][] elems) {
		for (int i = 0; i < elems.length; i++) {
			for (int j = 0; j < elems[i].length; j++) {
				panel.add(elems[i][j]);
			}
		}
	}

	public static void main(String[] args) {
		QuasselUIv2 test = new QuasselUIv2();
	}

}
