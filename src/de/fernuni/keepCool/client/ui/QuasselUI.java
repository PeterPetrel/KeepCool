package de.fernuni.keepCool.client.ui;

import java.awt.*;
import javax.swing.*;

public class QuasselUI extends JFrame{
	
	private static final long serialVersionUID = 1737843765026864896L;
	private JMenuBar mnuBar;
	private JMenu mnuGame;
	private JMenuItem mnuGameExit;
	
	private JPanel pnlLeft, pnlRight, pnlBottom;
	
	private JTable table;
	
	private JButton btnFirst, btnSecond, btnThird, 
				btnPlayer1, btnPlayer2, btnPlayer3, btnPlayer4;
	
	public QuasselUI() {
		
		setTitle("Quasselgroup's Keep Cool UI Demo");
		
		setLayout(new BorderLayout());
		
		createWidgets();
		addWidgets();
		
		getContentPane().add(mnuBar, BorderLayout.NORTH);
		getContentPane().add(pnlLeft, BorderLayout.WEST);
		getContentPane().add(pnlRight, BorderLayout.EAST);
		getContentPane().add(pnlBottom, BorderLayout.SOUTH);
		getContentPane().add(table, BorderLayout.CENTER);
		
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
		
		pnlLeft.add(btnPlayer1);
		pnlLeft.add(btnPlayer2);
		pnlLeft.add(btnPlayer3);
		pnlLeft.add(btnPlayer4);
		
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
		
		// game - center table
		table = new JTable(10, 10);
		
		// buttons
		btnFirst = new JButton("Erster Button");
		btnSecond = new JButton("Zweiter Button");
		btnThird = new JButton("Dritter Button");
		
		btnPlayer1 = new JButton("Erster Spieler");
		btnPlayer2 = new JButton("Zweiter Spieler");
		btnPlayer3 = new JButton("Dritter Spieler");
		btnPlayer4 = new JButton("Vierter Spieler");
		
	}

	public static void main(String[] args) {
		QuasselUI test = new QuasselUI();
	}

}
