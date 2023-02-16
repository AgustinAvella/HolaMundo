package temasDelCurso;

import javax.swing.JOptionPane;

public class EstructuraDeControlFOR {
	public static void main(String[] args) {
		
		//inicializacion; condicion; incremento/decremento
		
		String[] nombres = {"Agustín", "Francisco", "Ana", "Lautaro", "Julian"};
		
		//longitud del array
		int count = nombres.length;
		System.out.println("Count: " + count);
		
		String nombreABuscar = JOptionPane.showInputDialog("Ingrese el nombre a buscar: puede ser Agustín, Francisco, Ana, Lautaro, Julian");
		
		for(int i = 0; (i<count); i++) {
			if(nombres[i].equalsIgnoreCase("Agustín")) {
				System.out.println("Nombre: "+ nombres[i].toString());
			}
		}
	}
}
