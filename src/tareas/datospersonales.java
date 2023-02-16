package tareas;

import javax.swing.JOptionPane;

public class datospersonales {
	public static void main (String[]args) {
		String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");
		String apellido = JOptionPane.showInputDialog(null, "Ingrese su apellido");
		int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));
		String residencia = JOptionPane.showInputDialog(null, "Ingrese su residencia");
		
		System.out.println(nombre);
		System.out.println(apellido);
		System.out.println(edad);
		System.out.println(residencia);
	}

}
