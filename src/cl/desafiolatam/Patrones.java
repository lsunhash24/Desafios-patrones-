package cl.desafiolatam;
//alumno: Luis Sanhueza Soto

import java.util.Scanner;

public class Patrones {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		int cantidad = 0;											// definición de variable
		boolean error = false;										// variable de control

		// solicitamos el ingreso de datos
		System.out.println("Ingrese cantidad de veces a mostrar *");

		try {														// error controlado
				// capturar dato
			cantidad = leer.nextInt();

		} catch (Exception e) {
			System.out.println("Error de ingreso");
			error = true;
		}
		if (!error) {
																	// validar el dato, no negativo y mayor a cero
			if (cantidad > 0) {

				// dibujo patrón 1

				System.out.println("Patrón 1");
				System.out.println();
				for (int i = 1; i <= cantidad; i++) {
					if (i % 2 != 0) {// diferenciamos si el valor de i es par o impar para mostrar "*" o "."
						System.out.printf("*");
					} else {
						System.out.printf(".");

					}

				}
				System.out.println("\n");

				// dibujo patrón 2
				
				System.out.println("Patrón 2");
				System.out.println();
				for (int i = 1; i <= cantidad; i++) {
					if (i < 5) {									 // muestra desde el 1 al 4
						System.out.printf("%d", i);

					} else {

						int modulo = i % 4;// cuando la canidad es mayor a 5 calculamos el módulo de 4
						if (modulo == 0) {
							System.out.printf("%d", 4);// si el módulo es 0 muestra el 4
						} else {
							System.out.printf("%d", modulo); // si no muestra el módulo
						}

					}

				}
				System.out.println("\n");

				// dibujo patrón 3

				System.out.println("Patrón 3");
				System.out.println();
				for (int i = 1; i <= cantidad; i++) {
					if (i % 2 != 0) {// diferenciamos si el valor de i es par o impar para mostrar "||" o "*"
						System.out.printf("||");
					} else {
						System.out.printf("*");

					}

				}

			} else {
				System.out.println("Sólo numeros positivos mayor a cero");
			}
		}

		leer.close();
	}

}
