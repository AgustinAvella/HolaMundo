package holaMundo;

import javax.swing.JOptionPane;

public class HolaMundo {
	
	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");
		String apellido = JOptionPane.showInputDialog(null, "Ingrese su apellido");
		int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));
		String Residencia = JOptionPane.showInputDialog(null, "Ingrese su lugar de residencia");
		
		JOptionPane.showMessageDialog(null, nombre + " " + apellido);
		
		System.out.println(nombre);
		System.out.println(apellido);
		System.out.println(edad);
		System.out.println(Residencia);
		
	}

}
