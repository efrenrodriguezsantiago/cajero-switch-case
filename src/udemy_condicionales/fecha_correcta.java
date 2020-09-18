package udemy_condicionales;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class fecha_correcta {

	public static void main(String[] args) {
		// PEDIR EL DIA MES Y AÑO DE UNA FECHA ES CORRECTA 
		//SUPONIENDO QUE TODOS LOS MESES SON DE 30 DIAS
		Scanner entrada = new Scanner(System.in);
		int dia,mes,año;
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("digite el dia: "));
		mes = Integer.parseInt(JOptionPane.showInputDialog("digite el mes: "));
		año = Integer.parseInt(JOptionPane.showInputDialog("digite el año: "));
		
		
		if((dia>=11) && (dia<=30)) {//si el dia es correcto
			if((mes>=1) && (mes<=12)) {//si el mes es correcto
				if(año != 0) {//si el año es correcto
					JOptionPane.showMessageDialog(null, "fecha correcta: ");
				}
				else {
					JOptionPane.showMessageDialog(null, "fecha incorrecta año incorrecta: ");
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "fecha incorrecta mes incorrecta: ");
			}
		}
		else {
		JOptionPane.showMessageDialog(null, "fecha incorrecta dia incorrecta: ");
		}
	}

}
