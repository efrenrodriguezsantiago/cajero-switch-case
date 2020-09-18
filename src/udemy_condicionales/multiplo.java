package udemy_condicionales;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class multiplo {

	public static void main(String[] args) {
		// hacer un programa que lea un numero si es multiplo de 10
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		numero =Integer.parseInt(JOptionPane.showInputDialog("digite un nuero: "));
		
		if(numero%10 == 0) {
			JOptionPane.showMessageDialog(null, "el numero es multiplo de 10: ");
		}
		else {
			JOptionPane.showMessageDialog(null, "el numero no es multiplo de 10: ");
		}
		
	}

}
