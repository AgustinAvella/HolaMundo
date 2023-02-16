package tareas;

import javax.swing.JOptionPane;

public class DiasDelMesConAniosBisiestos {
	
	public static void main(String[] args) {
		int anios = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un año"));
		int meses = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un mes"));;
		
		switch (meses) {
		case 1:
			System.out.println("Este mes es enero y tiene x dias!");
			break;
		case 2:
			if (anios%4 == 0 && anios%100 != 0 || anios%400 == 0) {
				System.out.println("Este mes es febrero y es bisiesto, tiene 29 dias!");
			} else {
				System.out.println("Este mes es febrero y no es bisiesto, tiene 28 dias!");
			}
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
			break;
		case 11:
			break;
		case 12:
			break;
		}
		
	}

}
