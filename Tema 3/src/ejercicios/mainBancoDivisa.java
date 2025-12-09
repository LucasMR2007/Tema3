package ejercicios;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner9;

public class mainBancoDivisa {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el nombre del usuario");
		String nombre = teclado.next();
		System.out.println("Introduce el saldo que tienes en la cuenta");
		double dinero = teclado.nextDouble();

		bancoDivisa b1 = new bancoDivisa(dinero, nombre);

		int opcion;

		do {
			System.out.println("----MENU----");
			System.out.println("0) SALIR");
			System.out.println("1) CONVERTIR SALDO A LIBRAS");
			System.out.println("2) CONVERTIR SALDO A DOLARES");
			System.out.println("3) CONVERTIR A EUROS");
			System.out.println("4) VER SALDO");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 0:
				System.out.println("SALIENDO DEL BANCO...");
				break;
			case 1:
				if (b1.getDivisa()=='L') {
					System.out.println(b1);
				} else if (b1.getDivisa()!='L')
				b1.cambioLibra(teclado);
				System.out.println(b1);
				break;
			case 2:
				if (b1.getDivisa()=='$') {
					System.out.println(b1);
				} else if (b1.getDivisa()!='$')
				b1.cambioDollar(teclado);
				System.out.println(b1);

				break;
			case 3:
				if (b1.getDivisa()=='€') {
					System.out.println(b1);
				} else if (b1.getDivisa()!='€')
				b1.cambioEuro(teclado);
				System.out.println(b1);
				break;
			case 4:
				System.out.println(b1);

				break;

			default:
				System.out.println("Opcion no valida");
				break;
			}

		} while (opcion != 0);

	}

}
