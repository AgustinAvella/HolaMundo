package tareas;

import javax.swing.JOptionPane;

public class NumeroPar {
	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
		if (numero % 2 == 0 ) {
			System.out.println("El numero ingresado es par.");
			
		}
		else {
			
			System.out.println("El numero ingresado es impar.");
		}
	}

}
