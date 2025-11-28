package ejercicios;

import java.util.Scanner;

public class ejer4tema3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime un número decimal: ");
		int nDecimal = teclado.nextInt();

		String binario = calcularBinario(nDecimal);
		System.out.println("El número binario es: " + binario);

		System.out.println("Dime un número decimal: ");
		int nOctal = teclado.nextInt();

		String octal = calcularOctal(nDecimal);
		System.out.println("El número octal es: " + octal);
	
	}

	public static String calcularBinario(int decimal) {
		String numeroBinario = "";
		while (decimal > 0) {
			int cifra = decimal % 2;
			decimal = decimal / 2;
			numeroBinario = cifra + numeroBinario;
		}

		return numeroBinario;

	}

	public static String calcularOctal(int decimal) {
		String numeroOctal = "";
		while (decimal > 0) {
			int cifra = decimal % 8;
			decimal = decimal / 8;
			numeroOctal = cifra + numeroOctal;
		}
		return numeroOctal;
	}
}
