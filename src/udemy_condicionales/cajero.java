package udemy_condicionales;

import javax.swing.JOptionPane;

public class cajero {

	public static void main(String[] args) {
		// hacer un programa que simule un cajero automatico con un saldo inicial de 1000
		//con el siguiente menu de opciones
		//1 ingresar dinero a lacuenta
		//2retirar dinero dee la cuenta
		//salir
		
		final int saldo_inicial = 1000;
		int opcion;
		float ingreso,saldo_actual,retiro;
		
		opcion = Integer.parseInt(JOptionPane.showInputDialog("digite el primer numero: " 
				+"a. ingresa dinero ala cuenta: \n"
				+"b. retira dinero de la cuenta: \n"
				+"c. salir\n"));
		
		switch(opcion) {
		case 'a': ingreso = Float.parseFloat(JOptionPane.showInputDialog("digite la cantidad a ingresar: "));
			saldo_actual = saldo_inicial + ingreso;
			JOptionPane.showMessageDialog(null, "la suma es: "+saldo_actual);
			break;
		case 'b': retiro = Float.parseFloat(JOptionPane.showInputDialog("digite la cantidad de retiro: "));
			if(retiro>saldo_inicial) {
				JOptionPane.showMessageDialog(null, "no cuenta con el saldo suficiente: ");	
			}
			else {
				saldo_actual = saldo_inicial - retiro;
				JOptionPane.showMessageDialog(null, "dinero en cuenta: "+saldo_actual);
			}
			break;
			
			
		case 'c': break;
		
		default : 	JOptionPane.showMessageDialog(null, "la operacion no existe: ");
			
			
		}
		
				
	}

}
