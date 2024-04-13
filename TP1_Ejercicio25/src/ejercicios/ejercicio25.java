// Realizo este ejercicio teniendo en cuenta el ejercicio 23.
// Adapto el codigo a la nueva consigna.
package ejercicios;

public class ejercicio25 {
	private double numero1;
	private double numero2;
	
	// Constructor de la clase con ls dos parametros.
	public ejercicio25(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	// Metodo estatico que suma los dos numeros.
	public static double sumadorNumeros(double numero1, double numero2) {
		return numero1 + numero2;
	}
	
	public static void main(String[] args) {
		// Llama al metodo estatico para que haga la suma.
		double suma = sumadorNumeros(18.5, 76.2);
		
		// Se imprime el resultado de la suma.
		System.out.println("La suma de los dos numeros es: "+ suma);
	}

}
