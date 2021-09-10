package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
public class Karakter {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10;i++) {
		String poengtxt = showInputDialog ("Hvor mange poeng fikk du ?; ");
    int poeng = Integer.parseInt(poengtxt);
 
    
    if (poeng > 89 && poeng < 101) {
    	showMessageDialog (null,"karakter A");
    }
    else if (poeng > 80 && poeng < 89) {
     showMessageDialog(null, "Karakter B");
    }
    else if (poeng > 60 && poeng < 79) {
    	showMessageDialog(null, "Karakter C"); 
    }
    else if (poeng > 50 && poeng < 59) {
    	showMessageDialog(null, "Karakter C"); 
    }
    else if (poeng > 40 && poeng < 49) {
    	showMessageDialog(null, "Karakter D"); 
    }
    else if (poeng > 0 && poeng < 39) {
    	showMessageDialog(null, "karakter F"); 
    }
    else if (poeng < 0 || poeng >=101)
    	showMessageDialog(null, "ERROR");
    showInputDialog("Prøv igjen");
    Integer.parseInt(poengtxt);
    
    
    }
    
    		
}
}