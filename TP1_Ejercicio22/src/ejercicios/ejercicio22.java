package ejercicios;
import java.util.Scanner;

public class ejercicio22 {
	// Se define la variable de instancia.
    private int miVariable;

    // Metodo que imprime el valor que se le asigne a la variable.
    public void mostrarVariable() {
        System.out.println("El valor de la variable que asignaste es: " + miVariable);
    }

    public static void main(String[] args) {
    	// Se crea un objeto de la clase "ejercicio22"
    	ejercicio22 objeto = new ejercicio22();

    	// Se le pide al usuario que ingrese el valor de la variable:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar un valor para la variable: ");
        objeto.miVariable = scanner.nextInt();

        // Se lama al método que muestra el valor de la variable.
        objeto.mostrarVariable();

        scanner.close();
    }
}