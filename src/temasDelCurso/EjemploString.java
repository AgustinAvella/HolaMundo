package temasDelCurso;

public class EjemploString {
	public static void main(String[] args) {
		
		String stringUno = "Curso Java";
		String stringDos = new String("Curso Java");
		
		
		System.out.println("String stringUno = "+stringUno);
		
		System.out.println("String stringDos = "+stringDos);
		
		// lenght()
		System.out.println("Largo del stringUno: "+stringUno.length());
		
		//boolean
		
		boolean sonIguales = stringUno == stringDos;
		
		System.out.println("Son iguales? == " + sonIguales);
		
		//String metodo equals
		
		boolean sonIgualesEquals = stringUno.equals(stringDos);
		
		System.out.println("Son iguales? == "+ sonIgualesEquals);
		
		char character = stringUno.charAt(3);
		
		System.out.println("Caracter en el indice 3 = "+ character);
		
		String nombre = "Agustin ";
		String apellido = "Avella";
		System.out.println("Nombre completo: " + nombre.concat(apellido));
		
		
		//
		boolean contiene = nombre.contains("gus");
		System.out.println("contiene = nombre.contains(\"gus\")"+ contiene);
		
		nombre.startsWith("A");
		
		nombre.endsWith("n");
		
		String nombreSecundario = null;
		
		if(nombreSecundario != null) {
		System.out.println("Concatenacion de objeto String null = "+ nombreSecundario.concat(stringDos));	
		}else {
			System.out.println("Es null");
		}
		
	}

}
