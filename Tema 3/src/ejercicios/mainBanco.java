package ejercicios;

import java.util.Scanner;

public class mainBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Intrduce tu nombre:");
		String nombre= teclado.nextLine();
		
		System.out.println("Introduce el DNI:");
		int DNI= teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("Introduce el domicilio:");
		String domicilio= teclado.nextLine();
		
		System.out.println("Introduce la letra del DNI:");
		String letraDNI= teclado.nextLine();
		
		System.out.println("Introduce la suma de dinero con la que cuentas:");
		float dinero= teclado.nextFloat();
		
		
		
		banco b1= new banco(nombre, DNI, domicilio, letraDNI, dinero);
		
		System.out.println(b1);
		b1.ingresarDinero(100);
		System.out.println(b1);
		b1.sacarDinero(30);
		System.out.println(b1);
		
		b1.domicilioNuevo("Avila");
		System.out.println(b1);
		
		
		
	
		
		
	}

}
