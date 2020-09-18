package udemy_condicionales;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class numero_mayor_igual {

	public static void main(String[] args) {
		// pedir dos numeros decircuales el mayor o si son dos numeros iguales
		Scanner entrada = new Scanner(System.in);
		
		int numero1,numero2;
		
		numero1 =Integer.parseInt(JOptionPane.showInputDialog("digite primer nuero: "));
		numero2 =Integer.parseInt(JOptionPane.showInputDialog("digite segundo nuero: "));
		
		if(numero1 > numero2) {
			JOptionPane.showMessageDialog(null, "el numero mayor es: "+numero1);
		}
		else if(numero2 > numero1) {
			JOptionPane.showMessageDialog(null, "el numero mayor es: "+numero2);
		}
		else {
			JOptionPane.showMessageDialog(null, "ambos numeros son iguales ");
		}
		
	}

}
