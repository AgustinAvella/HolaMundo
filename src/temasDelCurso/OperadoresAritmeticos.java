package temasDelCurso;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//suma
		
		int i, j, suma;
		
		i=2;
		j=5;
		
		suma=i+j;
		
		System.out.println("Suma = " + suma); System.out.println("Suma = "+ (i+j)); //Metodos de hacer suma
		
		//resto
		
		int resto = j % i;
		System.out.println("Resto= "+ resto);
		
		//division
		double div = (double)j/ (double)i;
		
		System.out.println("Division= "+ div);
		
		//incremento
		
		System.out.println("Incremento i en 1 = " + (++i));
		
		//decremento
		
		System.out.println("Decremento i en 1 = "+ (--i));
		
		//Formas de poner un contador
		
		//i += 1;
		//i=i+1;
		
		
		// -- Operador aritmetico y "-=" Operador combinado
		
		i -= 55;
		System.out.println("I con += "+ (i));
		
		i = i * 55;
		System.out.println("I multiplicado *= 55 = "+(i));
		

	}

}
