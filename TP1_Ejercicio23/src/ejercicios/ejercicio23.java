package ejercicios;

public class ejercicio23 {
	// Se define la clase:
	private double numero1;
	private double numero2;
	
	// Constructor de la clase con los dos parametros:
	public ejercicio23(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	// Metodo que suma los dos numeros.
	public double sumadorNumeros() {
		return this.numero1 + this.numero2;
	}
	
	public static void main(String[] args) {
		// Se crea un objeto y se le pasan los valores de numero1 y numero2
		ejercicio23 objeto = new ejercicio23(18.5, 76.2);
		
		// Se llama al meotodo para que haga la suma
		double suma = objeto.sumadorNumeros();
		
		System.out.println("La suma de los dos numeros es: "+ suma);
	}

}
