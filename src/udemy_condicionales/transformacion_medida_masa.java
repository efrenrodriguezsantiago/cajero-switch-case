package udemy_condicionales;

import javax.swing.JOptionPane;

public class transformacion_medida_masa {

	public static void main(String[] args) {
		// hacer un programa que pase de kg a otra unidad de masa mostrar en pantalla con menu de opciones
		float medida;
		int opcion;
		
		medida = Float.parseFloat(JOptionPane.showInputDialog("digite la cantidad en kg: "));
		
		opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu: " 
				+"1. hectogramo: \n"
				+"2. decagramos: \n"
				+"3. gramos\n"
				+"4. decigramos: \n"
				+"5. centigramos: \n"
				+"6. miligramos\n"));
		
		
		switch(opcion) {
		case 1: medida *= 10;
			JOptionPane.showMessageDialog(null, "la conversion de hectogramos es: "+medida);
			break;
		case 2: medida *= 100;
				JOptionPane.showMessageDialog(null, "la conversion de decagramos es: "+medida);	
			break;
			
		case 3:  medida *= 1000;
		JOptionPane.showMessageDialog(null, "la conversion de gramos es: "+medida);
			break;
			
		case 4:  medida *= 10000;
		JOptionPane.showMessageDialog(null, "la conversion de decigramos es: "+medida);
			break;
			
		case 5:  medida *= 100000;
		JOptionPane.showMessageDialog(null, "la conversion de centigramos es: "+medida);
			break;
			
		case 6:  medida *= 1000000;
		JOptionPane.showMessageDialog(null, "la conversion de mililigramos es: "+medida);
			break;
		
		default : 	JOptionPane.showMessageDialog(null, "error en la operacion: ");
			
		}
	}

}
