package de.fernuni.keepCool.client.ui;

import java.awt.*;

import javax.swing.*;

public class QuasselUI extends JFrame{
	
	private static final long serialVersionUID = 1737843765026864896L;
	private JMenuBar mnuBar;
	private JMenu mnuGame;
	private JMenuItem mnuGameExit;
	
	private JPanel pnlLeft, pnlRight, pnlBottom, 
	pnlCenter, pnlCenterMiddle, pnlTopMiddle, pnlBottomMiddle,
	pnlStart1, pnlStart2, pnlStart3, pnlStart4;
	
	private Box boxCenterTop, boxCenter, boxCenterBottom;
	
	// private JTable table;
	private JButton[][] btnsCenterMiddle, btnsTopMiddle,btnsBottomMiddle,
	btnsStart1, btnsStart2,btnsStart3, btnsStart4;
	
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
		getContentPane().add(pnlCenter, BorderLayout.CENTER);
		
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
		
		// add board components divided in top, middle & bottom
		pnlCenter.add(boxCenterTop);
		pnlCenter.add(boxCenter);
		pnlCenter.add(boxCenterBottom);
		
		// middle of board
		boxCenter.add(pnlCenterMiddle);
		addFieldElems(pnlCenterMiddle, btnsCenterMiddle);
		btnsCenterMiddle[1][5].setVisible(false);
		
		// top of board & startbox 1, 2
		
		boxCenterTop.add(pnlStart1);
		boxCenterTop.add(Box.createHorizontalGlue());
		boxCenterTop.add(pnlTopMiddle);
		boxCenterTop.add(Box.createHorizontalGlue());
		boxCenterTop.add(pnlStart2);
		
		addFieldElems(pnlStart1, btnsStart1);
		addFieldElems(pnlTopMiddle, btnsTopMiddle);
		addFieldElems(pnlStart2, btnsStart2);
		
		// bottom of board & startbox 3,4
		
		boxCenterBottom.add(pnlStart3);
		boxCenterBottom.add(Box.createHorizontalGlue());
		boxCenterBottom.add(pnlBottomMiddle);
		boxCenterBottom.add(Box.createHorizontalGlue());
		boxCenterBottom.add(pnlStart4);
		
		addFieldElems(pnlStart3, btnsStart3);
		addFieldElems(pnlBottomMiddle, btnsBottomMiddle);
		addFieldElems(pnlStart4, btnsStart4);
		
		// max size
		pnlStart1.setMaximumSize(pnlStart1.getPreferredSize());
		pnlStart2.setMaximumSize(pnlStart2.getPreferredSize());
		pnlStart3.setMaximumSize(pnlStart3.getPreferredSize());
		pnlStart4.setMaximumSize(pnlStart4.getPreferredSize());
		pnlBottomMiddle.setMaximumSize(pnlBottomMiddle.getPreferredSize());
		pnlTopMiddle.setMaximumSize(pnlTopMiddle.getPreferredSize());
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
		
		
		// center - field of game
		pnlCenter = new JPanel();
		pnlCenter.setLayout(new BoxLayout(pnlCenter, BoxLayout.Y_AXIS));
		boxCenter = Box.createHorizontalBox();
		boxCenterTop = Box.createHorizontalBox();
		boxCenterBottom = Box.createHorizontalBox();
		
		// dots & start boxes
		pnlCenterMiddle = new JPanel(new GridLayout(3, 11));
		pnlTopMiddle = new JPanel(new GridLayout(4,3));
		pnlBottomMiddle = new JPanel(new GridLayout(4,3));
		pnlStart1 = new JPanel(new GridLayout(2, 2));
		pnlStart2 = new JPanel(new GridLayout(2, 2));
		pnlStart3 = new JPanel(new GridLayout(2, 2));
		pnlStart4 = new JPanel(new GridLayout(2, 2));
		
		btnsCenterMiddle = fillField(3, 11, 50, 50);
		btnsTopMiddle = fillField(4, 3, 50, 50);
		btnsBottomMiddle = fillField(4, 3, 50, 50);
		btnsStart1 = fillField(2, 2, 50, 50);
		btnsStart2 = fillField(2, 2, 50, 50);
		btnsStart3 = fillField(2, 2, 50, 50);
		btnsStart4 = fillField(2, 2, 50, 50);
		
		// buttons
		btnFirst = new JButton("Erster Button");
		btnSecond = new JButton("Zweiter Button");
		btnThird = new JButton("Dritter Button");
		
		btnPlayer1 = new JButton("Erster Spieler");
		btnPlayer2 = new JButton("Zweiter Spieler");
		btnPlayer3 = new JButton("Dritter Spieler");
		btnPlayer4 = new JButton("Vierter Spieler");
		
	}
	
	public JButton[][] fillField (int row, int col, int width, int height) {
		JButton[][] elems = new JButton[row][col];
		for (int i = 0; i < elems.length; i++) {
			for (int j = 0; j < elems[i].length; j++) {
				elems[i][j] = new JButton("x");	
				// matrix[i][j].setMinimumSize(new Dimension(minWidth, minHeight));
				elems[i][j].setPreferredSize(new Dimension(width, height));
				// matrix[i][j].setMaximumSize(new Dimension(maxWidth, maxHeight));
				elems[i][j].setHorizontalAlignment(JTextField.CENTER);
			}
		}
		return elems;
	}

	public void addFieldElems (JPanel panel, JButton[][] elems) {
		for (int i = 0; i < elems.length; i++) {
			for (int j = 0; j < elems[i].length; j++) {
				panel.add(elems[i][j]);
			}
		}
	}

	public static void main(String[] args) {
		QuasselUI test = new QuasselUI();
	}

}
