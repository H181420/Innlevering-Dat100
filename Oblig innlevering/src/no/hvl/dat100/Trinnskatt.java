package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
public class Trinnskatt {


	public static void main (String []args ) {
	
	String bruttolonn = showInputDialog("Din bruttolønn?: "); 
	int lonn = Integer.parseInt(bruttolonn); 
		
		double Trinn1 = 0; 
		double Trinn2 = 0.093;
		double Trinn3 = 0.241;
		double Trinn4 = 0.1152; 
		double Trinn5 = 0.1452; {
		
		if (lonn > 0 && lonn < 164100) {
			showMessageDialog (null, "Du er på skattetrinn 0. " +" " + "skatt= " + lonn * Trinn1);
		}
		else if (lonn > 164101 && lonn < 230950) {
			showMessageDialog (null, "Du er på skattetrinn 1." + " " + "skatt= " + lonn * Trinn2);
		}
		else if (lonn > 230951 && lonn < 580650) {
			showMessageDialog (null, "Du er på skattetrinn 2." + " " + "Skatt= " + lonn * Trinn3);
		}
		else if (lonn > 580651 && lonn < 934050) {
			showMessageDialog (null, "Du er på skattetrinn 3." + " " + "Skatt= " + lonn * Trinn4);
		}
		else {
			showMessageDialog (null, "Du er på skattetrinn 4." + " " + "Skatt=" + lonn * Trinn5);
		}

		}
	}
}
