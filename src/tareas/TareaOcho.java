package tareas;
import java.util.Arrays;
public class TareaOcho {
	
	public static void main(String[] args) {
		  int[] array = new int [10]; //Array long 10
	        int contador = 1;
	        int aux = 0;
	        int aux2 = 0;
	        
	        for (int i = 0; i < 10; i++) {
	            array[i]=(int) (Math.random()*10);
	        }

	        Arrays.sort(array);//Método de java.util.arrays ordena la lista



	        for (int i = 0; i<array.length-1; i++) {
	            if (array[i]==array[i+1]){
	            contador+=1;
	            }
	            else{
	            if(contador>=aux){
	            aux=contador;
	            aux2=array[i];
	            contador = 1;
	            }
	            }
	        }
	        System.out.println(Arrays.toString(array));//Imp
	        System.out.println("El número más repetido es el "+aux2+" que se repitió "+aux+ " veces ");
	    }
	}
