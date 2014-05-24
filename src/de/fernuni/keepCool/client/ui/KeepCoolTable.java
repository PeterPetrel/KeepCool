package de.fernuni.keepCool.client.ui;

import javax.swing.JTable;
import javax.swing.table.TableModel;

public class KeepCoolTable extends JTable {
	/**
	 * ID
	 */
	private static final long serialVersionUID = -6049922228172221849L;

	public KeepCoolTable(int numRows, int numColumns) {
		super(numRows, numColumns);

	}

	public KeepCoolTable(TableModel dm) {
		super(dm);
		// TODO Auto-generated constructor stub
	}

}
