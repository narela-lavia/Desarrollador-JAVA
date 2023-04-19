package PrimerPaquete; // Indica el paquete donde está alojada la clase

public class PrimeraClase {

	public static void main(String[] args) { // Método main, principal, por donde arranca Java
		
		int variableInicio = 5;
		int variableFin = 14;
		boolean imprimirPares = false;
		
		System.out.println("Ejercicio 1 punto a: ");
		while (variableInicio <= variableFin) {
			System.out.print(variableInicio);
			if (variableInicio < variableFin) {
				System.out.print("-");
			}
			variableInicio++;
				
		};
		
		/*System.out.println();
		System.out.println();
		
		System.out.println("Ejercicio 2 punto b:");
		while(variableInicio <= variableFin) {
			if (variableInicio %2 == 0) {
				System.out.print(variableInicio);
				if(variableInicio < variableFin) {
					System.out.print("-");
				}
			}
			variableInicio++;
			
		};
		
		System.out.println();
		System.out.println();
		
		System.out.println("Ejercicio 1 punto c: ");
		while (variableInicio <= variableFin) {
			if (imprimirPares == true) {
	
				if (variableInicio %2 == 0) {
					System.out.print(variableInicio);
					if (variableInicio < variableFin) {
						System.out.print("-");
					}
				}
			} else {
				if (variableInicio %2 != 0) {
					System.out.print(variableInicio);
					if (variableInicio < variableFin-1) {
						System.out.print("-");
					}
				}
				
			}
			variableInicio++;
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Ejercicio 1 punto d: ");
		
		for(int i=variableFin; i>=variableInicio; i--) {
			if(i %2 == 0) {
				System.out.print(i);
				if (i > variableInicio+1) {
					System.out.print("-");
				}
			}
		}
		
		
		//ejercicio 2
		float ingresos = 299000;
		int vehiculosNuevos = 2;
		int antiguedadVehiculos = 6;
		int inmuebles = 2;
		boolean embarcacion = false;
		
		if ( (ingresos < 177063) || (antiguedadVehiculos > 3) ||
			(inmuebles <= 1) || (embarcacion == false) ) {
			System.out.println("Pertenece a ingresos bajos");
			
			if( (177063 < ingresos && ingresos < 619720) || (vehiculosNuevos <= 1) ||
				(antiguedadVehiculos < 3) || (inmuebles <= 2) || (embarcacion == false) ) {
					System.out.println("Pertenece a ingresos medios");
					}
			
		} else {
			if ( (ingresos > 619720) || (vehiculosNuevos >= 3) || (antiguedadVehiculos < 5)
				|| (inmuebles >= 3) || (embarcacion == true) ) {
				System.out.println("Pertenece a ingresos altos");
		}

	}*/

}
}
