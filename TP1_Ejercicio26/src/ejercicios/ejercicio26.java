package ejercicios;

public class ejercicio26 {
	private final String variable;
	
	// Constructor de la clase.
	public ejercicio26(String valor) {
		this.variable = valor;
	}
	
	// Metodo para mostrar el valor que contiene la variable.
	public void mostrarVariable() {
		System.out.println("El valor que contiene la variable es: "+ variable);
	}
	
	public static void main(String[] args) {
		// Se crea un objeto de la clase ejercicio26
		ejercicio26 objeto = new ejercicio26("Luciano Balot el mejor :)");
		
		// Se llama al metodo para que devuelva el valor.
		objeto.mostrarVariable();
	}

}
