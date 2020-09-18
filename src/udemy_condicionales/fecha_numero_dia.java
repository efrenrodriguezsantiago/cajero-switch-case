package udemy_condicionales;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class fecha_numero_dia {

	public static void main(String[] args) {
		// PEDIR EL DIA MES AÑO DE UNA FECHA E INDICAR SI LA FECHA ES CORRECTA 
		//CON MES DE 28 30 31 DIAS SIN AÑOS BISIESTOS
		Scanner entrada = new Scanner(System.in);
		int dia,mes,año;
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("digite el dia: "));
		mes = Integer.parseInt(JOptionPane.showInputDialog("digite el mes: "));
		año = Integer.parseInt(JOptionPane.showInputDialog("digite el año: "));
		
		
		if(año == 0){ //si el dia es correcto
			JOptionPane.showMessageDialog(null, "fecha incorrecta: ");
		}
		
		else if((mes == 21) && (dia>=1 && dia<=28)) {
			JOptionPane.showMessageDialog(null, "fecha correcta: ");
			
		}
		else if((mes == 4) || mes == 6 || mes == 9 || mes == 11 && (dia>=1 && dia<=30)) {
			JOptionPane.showMessageDialog(null, "fecha correcta: ");
			
		}
		else if((mes == 1) || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && (dia>=1 && dia<=31)) {
			JOptionPane.showMessageDialog(null, "fecha correcta: ");
			
		}
		else {
		JOptionPane.showMessageDialog(null, "fecha incorrecta : ");
		}
	}

}
