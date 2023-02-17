package tareas;

import javax.swing.JOptionPane;

public class DiasDelMesConAniosBisiestos {
	
	public static void main(String[] args) {
		int anios = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un año"));
		int meses = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un mes"));;
		
		switch (meses) {
		case 1:
			System.out.println("Este mes es enero y tiene 31 dias!");
			break;
		case 2:
			if (anios%4 == 0 && anios%100 != 0 || anios%400 == 0) {
				System.out.println("Este mes es febrero y es bisiesto, tiene 29 dias!");
			} else {
				System.out.println("Este mes es febrero y no es bisiesto, tiene 28 dias!");
			}
			break;
		case 3:
			System.out.println("Este mes es marzo y tiene 31 dias!");
			break;
		case 4:
			System.out.println("Este mes es abril y tiene 30 dias!");
			break;
		case 5:
			System.out.println("Este mes es mayo y tiene 31 dias!");
			break;
		case 6:
			System.out.println("Este mes es junio y tiene 30 dias!");
			break;
		case 7:
			System.out.println("Este mes es julio y tiene 31 dias!");
			break;
		case 8:
			System.out.println("Este mes es agosto y tiene 31 dias!");
			break;
		case 9:
			System.out.println("Este mes es septiembre y tiene 30 dias!");
			break;
		case 10:
			System.out.println("Este mes es octubre y tiene 31 dias!");
			break;
		case 11:
			System.out.println("Este mes es noviembre y tiene 30 dias!");
			break;
		case 12:
			System.out.println("Este mes es diciembre y tiene 31 dias!");
			break;
		}
		
	}

}
