package ejercicios;

import java.util.Scanner;

public class mainRectangulo {

	public static void main(String[] args) {

		rectangulo r1 = new rectangulo(20, 12);
		Scanner teclado = new Scanner(System.in);
		int opcion;

		do {
			
			System.out.println("----MENU----");
			System.out.println("0) SALIR DL PROGRAMA");
			System.out.println("1) INFO RECTANGULO");
			System.out.println("2) DEFINICION DE RECTANGULO");
			System.out.println("3) DEFINIR AREA");
			System.out.println("4) DEFINIR ALTURA");
			System.out.println("5) REPRESENTAR MEDIANTE ASTERISCOS");
			System.out.println("6) MOSTRAR TODO");
			opcion = teclado.nextInt();
			switch (opcion) {
			
			case 0:
				System.out.println("bye bye");
				break;
			
			case 1:
			System.out.println(r1);
				break;
			case 2:
				r1.definirRectangulo();
				break;
			case 3:
				r1.calcularArea(0);
				break;
			case 4:
				r1.calcularPerimetro(0);
				break;
			case 5:
				r1.baseAsteriscos();
				break;
			case 6:
				System.out.println(r1);
				r1.definirRectangulo();
				r1.calcularArea(0);
				r1.calcularPerimetro(0);
				r1.baseAsteriscos();
				break;
		
			default: 
				System.out.println("Opcion no valida");
				break;
			}

		} while (opcion != 0);
		teclado.close();
		
		
		
		
		
		

	}

}
