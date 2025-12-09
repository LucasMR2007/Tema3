package ejercicios;

import java.util.Scanner;

public class bancoDivisa {

	private double dinero;
	private String nombre;
	private char divisa;

	public bancoDivisa(double dinero, String nombre) {
		super();
		this.dinero = dinero;
		this.nombre = nombre;
		this.divisa = '€';
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getDivisa() {
		return divisa;
	}

	public void setDivisa(char divisa) {
		this.divisa = divisa;
	}

	public void cambioLibra(Scanner teclado) {

		double dineroAux = dinero;
		double dineroQuitado;
		if (divisa == '€') {
			dineroAux = dinero * 0.995;
			dineroQuitado = dinero - dineroAux;
			System.out.println("Te han quitado: " + dineroQuitado + " de la divisa inicial");
			dineroAux = dinero * 0.87;
			

		} else if (divisa == '$') {
			dineroAux = dinero * 0.995;
			dineroQuitado = dinero - dineroAux;
			System.out.println("Te han quitado: " + dineroQuitado + " de la divisa inicial");
			dineroAux = dinero * 0.75;
			
		} else if (divisa == 'L') {
			System.out.println("YA ESTAS EN ESA DIVISA");
		}
		System.out.println("Deseas aceptar la transicion \n1--> si \n0-->no");
		int num = teclado.nextInt();
		if (num == 1) {
			dinero = dineroAux;
			divisa = 'L';

		} else if (num == 0) {
			dinero = dinero;
			divisa = divisa;

		} else if (num > 1) {
			System.out.println("Opcion no valida");
		}
	}

	public void cambioDollar(Scanner teclado) {

		double dineroAux = dinero;
		double dineroQuitado;

		if (divisa == '€') {
			dineroAux = dinero * 0.995;
			dineroQuitado = dinero - dineroAux;
			System.out.println("Te han quitado: " + dineroQuitado + " de la divisa inicial");
			dineroAux = dinero * 1.16;
			

		} else if (divisa == '$') {
			System.out.println("YA ESTAS EN ESA DIVISA");

			divisa = '$';
		} else if (divisa == 'L') {
			dineroAux = dinero * 0.995;
			dineroQuitado = dinero - dineroAux;
			System.out.println("Te han quitado: " + dineroQuitado + " de la divisa inicial");
			dineroAux = dinero * 1.33;
			
		}
		System.out.println("Deseas aceptar la transicion \n1--> si \n0-->no");
		int num = teclado.nextInt();
		if (num == 1) {
			dinero = dineroAux;
			divisa = '$';

		} else if (num == 0) {
			dinero = dinero;
			divisa = divisa;

		} else if (num > 1) {
			System.out.println("Opcion no valida");
		}
	}

	public void cambioEuro(Scanner teclado) {
		double dineroAux = dinero;
		double dineroQuitado;

		if (divisa == '€') {
			System.out.println("YA ESTAS EN ESA DIVISA");

		} else if (divisa == '$') {
			dineroAux = dinero * 0.995;
			dineroQuitado = dinero - dineroAux;
			System.out.println("Te han quitado: " + dineroQuitado + " de la divisa inicial");
			dineroAux = dinero * 0.86;

		} else if (divisa == 'L') {
			dineroAux = dinero - (dinero * 0.005);
			dineroQuitado = dinero - dineroAux;
			System.out.println("Te han quitado: " + dineroQuitado + " de la divisa inicial");
			dineroAux = dinero * 1.33;

		}
		System.out.println("Deseas aceptar la transicion \n1--> si \n0-->no");
		int num = teclado.nextInt();
		if (num == 1) {
			dinero = dineroAux;
			divisa = '€';

		} else if (num == 0) {
			dinero = dinero;
			divisa = divisa;

		} else if (num > 1) {
			System.out.println("Opcion no valida");
		}
	}

	@Override
	public String toString() {
		return "Saldo=" + dinero + "\nNombre=" + nombre + "\nDivisa=" + divisa;
	}

}
