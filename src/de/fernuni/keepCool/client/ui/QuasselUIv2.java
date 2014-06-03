package de.fernuni.keepCool.client.ui;

import java.awt.*;

import javax.swing.*;

public class QuasselUIv2 extends JFrame {

	private static final long serialVersionUID = 1737843765026864896L;
	private JMenuBar mnuBar;
	private JMenu mnuGame;
	private JMenuItem mnuGameExit;

	private JPanel pnlLeft, pnlRight, pnlBottom,pnlCenterMiddle;

	// private JTable table;
	private JButton[][] btns;

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

	public JButton[][] fillField(int row, int col, int width, int height) {
		JButton[][] elems = new JButton[row][col];
		for (int i = 0; i < elems.length; i++) {
			for (int j = 0; j < elems[i].length; j++) {
				elems[i][j] = new JButton("x");
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
