package feu1618_5;
import java.awt.*;
import java.awt.event.*;

public class Rechner extends Frame {
	private BorderLayout borderLayout1 = new BorderLayout();
	private FlowLayout flowLayoutNumberField = new FlowLayout();
	private FlowLayout flowLayoutOperatorField = new FlowLayout();
	private TextField tfEingabe;
	private Button btnMinus;
	private Button btnPlus;
	private Button btnMult;
	private Button btnDiv;
	private Button btnEquals;
	private Button[] btnNum;

	/*
	 * AWT-Komponenten fuer Eingabetextfeld, Zifferntasten, Operatortasten sowie
	 * Ziffernpanel und Operatorpanel deklarieren und soweit moeglich bereits
	 * zugehoerige Objekte erzeugen
	 */
	public Rechner() {
/* Ggf. lokale Variablen deklarieren */
/* Layout fuer Frame festlegen */
this.setLayout(borderLayout1);
this.setSize(150, 200);
this.setLocation(100, 100);
this.setBackground(Color.gray);
/* FlowLayout fuer Ziffern- und Operatorpanel setzen */
/* Zifferntasten ggf. erzeugen und in Ziffernpanel einfuegen */
/* Operatortasten ggf. erzeugen und in Operatorpanel einfuegen */
/* Objekte in Frame plazieren */

//Nummerfelder erzeugen und dem flowLayout hinzufügen
for (int i=0; i< )
this.flowLayoutNumberField
this.add(flowLayoutNumberField);
this.add(flowLayoutOperatorField);

this.add(...);
/* ... */
}

	/* ... */
	public static void main(String argv[]) {
		Rechner rechner = new Rechner();
		rechner.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		rechner.setVisible(true);
	}
}