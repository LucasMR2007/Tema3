package ejercicios;

import java.util.Scanner;

public class ejer18parte2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner teclado = new Scanner(System.in);
			int num, num2;
			int resultado = 0;
			int opcion;

			
			do {
				opcion = mostrarMenu(teclado);

				switch (opcion) {
				case 1:
					System.out.println("Ingresa un primer numero");
					num = teclado.nextInt();
					System.out.println("Ingresa un segundo número");
					num2 = teclado.nextInt();
					resultado = sumaNumeros(num, num2);
					System.out.println("El resultado es: " + resultado);
					break;
				case 2:
					System.out.println("Ingresa un primer numero");
					num = teclado.nextInt();
					System.out.println("Ingresa un segundo número");
					num2 = teclado.nextInt();
					resultado = restaNumeros(num, num2);
					System.out.println("El resultado es: " + resultado);
					break;
				case 3:
					System.out.println("Ingresa un primer numero");
					num = teclado.nextInt();
					System.out.println("Ingresa un segundo número");
					num2 = teclado.nextInt();
					resultado = multiNumeros(num, num2);
					System.out.println("El resultado es: " + resultado);
					break;
				case 4:
					System.out.println("Ingresa un primer numero");
					num = teclado.nextInt();
					System.out.println("Ingresa un segundo número");
					num2 = teclado.nextInt();

					resultado = divNumeros(num, num2);
					System.out.println("El resultado es: " + resultado);

					break;
				case 5:
					System.out.println("Saliendo del programa.");
					break;

				default:
					System.out.println("Opción no valida, intentalo de nuevo.");
					break;
				}

			} while (opcion < 0 || opcion > 5);

			teclado.close();
		}

		public static int mostrarMenu(Scanner teclado) {
			System.out.println("CALCULADORA");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicación");
			System.out.println("4. División");
			System.out.println("5. Salir del programa");
			System.out.println("Elige la opción");
			int opcion = teclado.nextInt();
			return opcion;
		}

		public static int sumaNumeros(int num, int num2) {
			int suma = num + num2;

			return suma;
		}

		public static int restaNumeros(int num, int num2) {
			int resta = num - num2;

			return resta;
		}

		public static int multiNumeros(int num, int num2) {
			int multi = num * num2;

			return multi;
		}

		public static int divNumeros(int num, int num2) {

			if (num2 == 0) {
				return -1;
			}
			int div = num / num2;

			return div;
		}

}
