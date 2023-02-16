package tareas;

import java.util.Scanner;


public class OrdenarNombres {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nombre1 = "";
		System.out.println("Ingrese primer nombre: ");
		nombre1 = scanner.nextLine();
		
		
		String nombre2;
		System.out.println("Ingrese segundo nombre: ");
		nombre2 = scanner.nextLine();
		
		String nombre3;
		System.out.println("Ingrese tercer nombre: ");
		nombre3 = scanner.nextLine();
		
		if ((nombre1.length() > nombre2.length()) && (nombre2.length()>nombre3.length())) {
			System.out.println("Orden: "+nombre1+"-"+nombre2+"-"+nombre3);
		}
		else if ((nombre1.length()>nombre3.length()) && (nombre3.length()>nombre2.length())) {
			System.out.println("Orden: "+nombre1+"-"+nombre3+"-"+nombre2);
			
		}
		else if ((nombre2.length()>nombre1.length()) && (nombre1.length()>nombre3.length())) {
			System.out.println("Orden: "+nombre2+"-"+nombre1+"-"+nombre3);
			
		}
		else if ((nombre2.length()>nombre3.length()) && (nombre3.length()>nombre1.length())) {
			System.out.println("Orden: "+nombre2+"-"+nombre3+"-"+nombre1);
			
		}
		else if ((nombre3.length()>nombre1.length()) && (nombre1.length()>nombre2.length())) {
			System.out.println("Orden: "+nombre3+"-"+nombre1+"-"+nombre2);
			
		}
		else {
			System.out.println("Orden: "+nombre3+"-"+nombre2+"-"+nombre1);
		}
		
	}

}
