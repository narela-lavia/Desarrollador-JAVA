package PrimerPaquete;

public class clase3ejc {

	public static void main(String[] args) {
		
		/* Dado un vector de números, y un número X, que sume todos los números > x
		 * y retorne el resultado */
		int vectorA[] = {12,23,45,56,78,15,85,2};
		int x = 45, suma = 0;
		
		for (int i=0; i < vectorA.length; i++) {
			if (x < vectorA[i]) {
				suma = suma + vectorA[i];
			}
			
		}
		System.out.print("El resultado de la suma es: " + suma);

	}

}
