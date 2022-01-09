package cl.desafiolatam;
//alumno: Luis Sanhueza Soto

import java.util.Scanner;

public class PatronesAnidados {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		int cantidad = 0; // definici�n de variable
		boolean error = false; // variable de control

		// solicitamos el ingreso de datos
		System.out.println("Ingrese cantidad de veces a mostrar *");

		try { // error controlado

			cantidad = leer.nextInt(); // capturar dato

		} catch (Exception e) {
			System.out.println("Error de ingreso");
			error = true;
		}
		if (!error) {
			// validar el dato, no negativo y mayor a cero

			if (cantidad > 0) {

				patron1(cantidad); // dibujo patr�n 1 invocando m�todo

				patron2(cantidad); // dibujo patr�n 2 invocando m�todo

				patron3(cantidad); // dibujo patr�n 3 invocando m�todo

				patron4(cantidad); // dibujo patr�n 4 invocando m�todo

			} else {
				System.out.println("S�lo numeros positivos mayor a cero");
			}
		}

		leer.close();
	}

	public static void patron1(int cantidad) { //m�todo que dibuja patr�n 1

		System.out.println("Patr�n 1");
		System.out.println();

		for (int i = 1; i <= cantidad; i++) {
			if (i == 1 || i == cantidad) {              // dibujo de primera y �ltima fila
				for (int j = 1; j <= cantidad; j++) {
					System.out.printf("*");
				}

			} else {                                    // resto de las filas

				for (int j = 1; j <= cantidad; j++) {

					if (j == 1 || j == cantidad) {      // la primera y �ltima columna se dibujan
						System.out.printf("*");
						
					} else {							// el resto de las columnas en blanco
						System.out.printf(" ");
						
					}
				}
				
			}
			System.out.printf("\n");
		}

		System.out.println();

	}

	public static void patron2(int cantidad) {	//m�todo que dibuja patr�n 2

		System.out.println("Patr�n 2");
		System.out.println();

		for (int i = 1; i <= cantidad; i++) {
			if (i == 1 || i == cantidad) {				// se dibuja primera y �ltima fila con "*"
				for (int j = 1; j <= cantidad; j++) {
					System.out.printf("*");
				}

			} else {									// resto de las filas

				for (int j = 1; j <= cantidad; j++) {
					if (j == cantidad - (i - 1)) {      // s�lo se dibuja la columna (n-1)
						System.out.printf("*");
					} else {
						System.out.printf(" ");
					}
				}

			}

			System.out.printf("\n");
		}

		System.out.println("\n");
	}

	public static void patron3(int cantidad) {	//m�todo que dibuja patr�n 3

		System.out.println("Patr�n 3");
		System.out.println();

		for (int i = 0; i < cantidad; i++) {
			for (int j = 1; j <= cantidad; j++) {
				if (j == i + 1 || j == cantidad - i) {   // aqu� se dibuja s�lo la primera y �ltima columna
					System.out.printf("x");				 // luego se incrementa la primera columna en "i" y se disminuye
				} else {								 // la �ltima columna en "i"
					System.out.printf(" ");
				}
			}
			System.out.printf("\n");
		}

		System.out.println("\n");

	}

	public static void patron4(int cantidad) {	//m�todo que dibuja patr�n 4

		System.out.println("Patr�n 4");
		System.out.println();

		for (int i = 1; i <= cantidad; i++) {

			if (i == 1) {								// dibujo primera fila, la �ltima columna va en blanco
				for (int j = 1; j <= cantidad; j++) {
					if (j == cantidad && cantidad !=1) { // si la cantidad es igual a 1, muestra "*"
						System.out.printf(" ");
						
					} else {
						System.out.printf("*");
					}

				}
			} else if (i == cantidad) {					// dibujo �ltima fila, la primera columna va en blanco
				for (int j = 1; j <= cantidad; j++) {
					if (j == 1) {
						System.out.printf(" ");
					} else {
						System.out.printf("*");
					}
				}
			} else if (i != 1 || i != cantidad) {        // resto de las filas
				for (int j = 1; j <= cantidad - 1; j++) {
					if (j == 1 || j == cantidad) {		// primera y �ltima columna van en blanco
						System.out.printf(" ");
					} else {
						System.out.printf("*");
					}
				}

			}
			System.out.println();
		}

	}

}
