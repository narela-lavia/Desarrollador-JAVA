package PrimerPaquete;

public class clase3ejA {
	
	public static void main(String[] args) {
		/* Dado un string y una letra, que cuente la cantidad de apariciones
		 * de la letra en el string */
		
		String frase = "hola a todos, estoy aprendiendo Java";
		char a = 'a';
		int contador = 0;
		
		for (int i=0; i < frase.length(); i++) {
			if (frase.charAt(i) == a) {
				contador++;
			}
		}
		System.out.print("La letra 'a' se repite " + contador + " veces en la frase.");
	}
}
