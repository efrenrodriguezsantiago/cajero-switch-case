package udemy_condicionales;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class fecha_correcta {

	public static void main(String[] args) {
		// PEDIR EL DIA MES Y A�O DE UNA FECHA ES CORRECTA 
		//SUPONIENDO QUE TODOS LOS MESES SON DE 30 DIAS
		Scanner entrada = new Scanner(System.in);
		int dia,mes,a�o;
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("digite el dia: "));
		mes = Integer.parseInt(JOptionPane.showInputDialog("digite el mes: "));
		a�o = Integer.parseInt(JOptionPane.showInputDialog("digite el a�o: "));
		
		
		if((dia>=11) && (dia<=30)) {//si el dia es correcto
			if((mes>=1) && (mes<=12)) {//si el mes es correcto
				if(a�o != 0) {//si el a�o es correcto
					JOptionPane.showMessageDialog(null, "fecha correcta: ");
				}
				else {
					JOptionPane.showMessageDialog(null, "fecha incorrecta a�o incorrecta: ");
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
