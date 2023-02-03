package temasDelCurso;

import java.util.Scanner;

public class IngresoDeDatosConScanner {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String nombre = "";
		System.out.println("Ingrese el nombre: ");
		nombre = scanner.nextLine();
		System.out.println("Nombre ingresado: " + nombre);
		
		String apellido = "";
		System.out.println("Ingrese el apellido: ");
		apellido = scanner.nextLine();
		System.out.println("Apellido ingresado: " + apellido);
		
		int edad = 0;
		System.out.println("Ingrese la edad: ");
		edad = Integer.parseInt(scanner.nextLine());
		System.out.println("Edad ingresada: " + edad);
		
		String residencia = "";
		System.out.println("Ingrese la residencia: ");
		residencia = scanner.nextLine();
		System.out.println("Residencia ingresada: " + residencia);
		
	}
}
