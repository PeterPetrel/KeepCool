package de.fernuni.keepCool.client.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SwingUI {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingUI window = new SwingUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 451);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null, null, null, null, null, null, null,
						null, null, null, null },
				{ null, null, null, null, null, null, null, null, null, null,
						null, null, null, null },
				{ null, null, null, null, null, null, null, null, null, null,
						null, null, null, null },
				{ null, null, null, null, null, null, null, null, null, null,
						null, null, null, null },
				{ null, null, null, null, null, null, null, null, null, null,
						null, null, null, null },
				{ null, null, null, null, null, null, null, null, null, null,
						null, null, null, null },
				{ null, null, null, null, null, null, null, null, null, null,
						null, null, null, null },
				{ null, null, null, null, null, null, null, null, null, null,
						null, null, null, null },
				{ null, null, null, null, null, null, null, null, null, null,
						null, null, null, null },
				{ null, null, null, null, null, null, null, null, null, null,
						null, null, null, null },
				{ null, null, null, null, null, null, null, null, null, null,
						null, null, null, null },
				{ null, null, null, null, null, null, null, null, null, null,
						null, null, null, null },
				{ null, null, null, null, null, null, null, null, null, null,
						null, null, null, null },
				{ null, null, null, null, null, null, null, null, null, null,
						null, null, null, null }, }, new String[] {
				"New column", "New column", "New column", "New column",
				"New column", "New column", "New column", "New column",
				"New column", "New column", "New column", "New column",
				"New column", "New column" }) {
			Class[] columnTypes = new Class[] { String.class, Object.class,
					Object.class, Object.class, Object.class, Object.class,
					Object.class, Object.class, Object.class, Object.class,
					Object.class, Object.class, Object.class, Object.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		for (int i = 0; i < table.getColumnCount(); i++) {
			table.getColumnModel().getColumn(i).setResizable(false);
			table.getColumnModel().getColumn(i).setPreferredWidth(20);
			table.getColumnModel().getColumn(i).setMinWidth(20);
			table.getColumnModel().getColumn(i).setMaxWidth(20);
		}

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout());

		JButton btnNewButton_2 = new JButton("New button");
		panel.add(btnNewButton_2);

		JButton btnNewButton_1 = new JButton("New button");
		panel.add(btnNewButton_1);

		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		frame.getContentPane().add(table, BorderLayout.CENTER);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnGame = new JMenu("Game");
		menuBar.add(mnGame);

		JMenuItem mntmQuit = new JMenuItem("Quit");
		mnGame.add(mntmQuit);
	}

}
