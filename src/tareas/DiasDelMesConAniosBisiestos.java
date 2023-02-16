package tareas;

import javax.swing.JOptionPane;

public class DiasDelMesConAniosBisiestos {
	
	public static void main(String[] args) {
		int anios =  Integer.parseInt(JOptionPane.showInputDialog("Introduzca un año"));
		int meses = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un mes"));;
		
		switch (meses) {
		case 1:
			System.out.println();
			break;
		case 2:
			if (anios/4 == 0 && anios/100 != 0) {
				System.out.println("Este mes es febrero y es bisiesto, tiene 29 dias!");
			} else {
				System.out.println("Este mes es febrero y no es bisiesto, tiene 28 dias!");
			}
			break;
		}
		
	}

}
