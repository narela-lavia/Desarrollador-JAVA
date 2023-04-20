package PrimerPaquete;


public class clase3ej2 {

	public static void main(String[] args) {
		
		String lista = "Carlos,Estela,Narela,Lucía,Federico,Lucio,Nayeli,Camila,Sofía,Daiana";
		String[] listaNueva = lista.split(",");
		
		for (String elemento : listaNueva) {
			System.out.println(elemento);
		}
	}

}
