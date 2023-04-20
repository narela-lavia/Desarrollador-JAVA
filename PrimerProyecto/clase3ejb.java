package PrimerPaquete;

public class clase3ejb {

	public static void main(String[] args) {
		
		/* Dados 3 números, que ordene los mismos y los retorne */
		int numeros[] = {2, 123, 35};
		int aux = 0;
		
		for(int i=0; i < numeros.length; i++) 
		{
			for (int j=0; j < numeros.length -1; j++) {
				if (numeros[j] > numeros [j+1]) {
					aux = numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1] = aux;
				}
			}
		}
		
		int k=0;
		System.out.println("Números ordenados: ");
		while(k < numeros.length) {
			System.out.print(numeros[k] + " ");
			k++;
		}
	}

}
