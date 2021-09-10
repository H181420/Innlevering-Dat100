package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
public class Fakultet {

	public static void main(String[] args) {
		
		
		String tall = showInputDialog ("tast inn heltall ");
	    int n = Integer.parseInt(tall);
		 
		int fakultet= 1, i;
		for (i=2; i <=n; i++)
		{
		fakultet = fakultet * i; 
		}
		System.out.print(fakultet);


		
	}
}