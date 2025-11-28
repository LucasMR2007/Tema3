package ejercicios;

import java.util.Scanner;

public class ejer1tema3 {

	public static void main(String[] args) {

		int resulSuma = sumaNumeros(15, 8);
		System.out.println(resulSuma);

		int resulResta = restaNumeros(5, 8);
		System.out.println(resulResta);

		int resulMult = multNumeros(3, 9);
		System.out.println(resulMult);

		int resulDiv = divNumeros(10, 5);
		System.out.println(resulDiv);

		int resulFacto = numeroFactorial(5);
		System.out.println(resulFacto);

		boolean resulPrimo = numeroPrimo(7);
		System.out.println(resulPrimo);
		
		boolean  resulNarci= esNarcisista(7);
		System.out.println(resulNarci);
	}

	public static int sumaNumeros(int num1, int num2) {

		int suma = num1 + num2;
		return suma;
	}

	public static int restaNumeros(int num1, int num2) {
		int resta = num1 - num2;
		return resta;
	}

	public static int multNumeros(int num1, int num2) {
		int mult = num1 * num2;
		return mult;
	}

	public static int divNumeros(int num1, int num2) {
		if (num2 == 0) {
			return -1;

		} else {
			int div = num1 / num2;

			return div;
		}

	}

	public static int numeroFactorial(int num1) {
		int temp = 1;

		if (num1 < 0) {
			return -1;

		} else if (num1 == 0) {
			return -2;
		}
		for (int i = num1; i >= 1; i--) {

			temp = temp * i;

		}
		return temp;

	}

	public static boolean numeroPrimo(int num1) {
		boolean primo = true;
		for (int i = 2; i < num1; i++) {
			if (num1 % i == 0) {
				primo = false;
			}

		}
		if (primo) {
			return true;

		} else {
			return false;
		}
	}

	public static int contarCifras(int num1) {
		int cifras = 0;
		;

		while (num1 > 0) {
			num1 = num1 / 10;
			cifras++;
		}
		return cifras;

	}

	public static boolean esNarcisista(int num1) {
		int aux = num1;
		int narc=0;
		int cifras= contarCifras(num1);
		while (num1 > 0) {
			int c = num1 % 10;
			num1 = num1 / 10;
			narc= (int) (narc+ Math.pow(c, cifras));
			
		}
		if(narc==aux) {
			return true;
		} else {
			return false;
		}
	}
}
