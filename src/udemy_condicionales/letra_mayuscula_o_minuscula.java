package udemy_condicionales;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class letra_mayuscula_o_minuscula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		char letra;
		
		letra = JOptionPane.showInputDialog("digite una letra: ").charAt(0);
		
		if(Character.isUpperCase(letra)) {
			JOptionPane.showMessageDialog(null, "es una letra mayuscula ");
			
		}
		else {
			JOptionPane.showMessageDialog(null, "es una letra minuscula ");
			
		}
		
		
	}

}
