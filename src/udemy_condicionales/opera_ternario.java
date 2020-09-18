package udemy_condicionales;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class opera_ternario {

	public static void main(String[] args) {
		// Par e impar
		Scanner entrada = new Scanner(System.in);
		int numero;
		String mensaje;
		
		numero =Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
		
		mensaje = (numero%2==0)? "es par" : "es impar";
		
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
