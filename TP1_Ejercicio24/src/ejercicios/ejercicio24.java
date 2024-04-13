package ejercicios;

public class ejercicio24 {
	// Se define la variable privada.
	private int variable;
	
	// Metodo publico para asignr el valor a la variable.
	public void asignarVariable(int valor) {
		variable = valor;
	}
	
	// Metodo publico para obtener el valor obtener el valor de la variable.
	public int obtenerVariable() {
		return variable;
	}
	
	public static void main(String[] args) {
		// Se crea un objeto de la clase "ejercicio24".
		ejercicio24 objeto = new ejercicio24();
		
		// Se le asigna el valor a la variable.
		objeto.asignarVariable(85);
		
		// Se uimprime el valor de la variable.
		System.out.println("El valor de la variable es: "+ objeto.obtenerVariable());
		
	}

}
