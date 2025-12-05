package ejercicios;

import java.util.Scanner;

public class mainJugador {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el numero del jugador 1");
		jugador jugador1 = new jugador(teclado.nextLine());
		System.out.println("Introduce el numero del jugador 2");
		jugador jugador2 = new jugador(teclado.nextLine());

		do {

			System.out.println(jugador1.getNombre() + ", introduce un numero");
			int numero1 = teclado.nextInt();
			System.out.println(jugador2.getNombre() + ", introduce un numero");
			int numero2 = teclado.nextInt();
			int random = (int) (Math.random() * 100 + 1);
			System.out.println("El numero aleatorio es : " + random);

			int distanciaJugador1 = numero1;
			int distanciaJugador2 = numero2;
			int diferencia1;
			int diferencia2;

			if (distanciaJugador1 < random) {
				diferencia1 = random - numero1;

			} else if (distanciaJugador2 > random) {
				diferencia2 = numero2-random;
			}
			

		} while (jugador1.getVida() <= 0 || jugador2.getVida() <= 0);

	}

}
