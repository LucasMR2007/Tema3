package ejercicios;

import java.util.Scanner;

public class mainJugador {

	public static void main(String[] args) {

		Scanner teclado= new  Scanner(System.in);
		System.out.println("Introduce tu nombre jugador 1");
		jugador j1 = new jugador(teclado.nextLine());
		System.out.println("Introduce tu nombre jugador 2");
		jugador j2 = new jugador(teclado.nextLine());
 
		int turno= 1;
		
		do {
			int random=	(int) (Math.random()*100+1);
			System.out.println("----EN PARTIDA----");
			System.out.println("TURNO: " + turno);
			
			
			System.out.println(j1.getNombre() + " introduce un numero");
			int num = teclado.nextInt();
			
			System.out.println(j2.getNombre() + " introduce un numero");
			int num2= teclado.nextInt();
			
			System.out.println("El numero aleatorio era: " + random );
			
 
			int diferencia1;
			int diferencia2;
 
			if(num <random) {
				 diferencia1 = random - num;
			}else if(num > random) {
				diferencia1= num - random;
			}else {
				diferencia1 = 0;
			}
			
			if(num2 <random) {
				 diferencia2 = random - num2;
			}else if(num2 > random) {
				diferencia2= num2 - random;
			}else {
				diferencia2 = 0;
			}
			
			if(diferencia1 < diferencia2) {
				System.out.println(j2.getNombre() + ", pierdes 10 putos de vida"); 
				j2.reducirVida();
			}
			else if(diferencia1> diferencia2) {
				System.out.println(j1.getNombre() + ", pierdes 10 putos de vida");
				j1.reducirVida();
			} else {
				System.out.println("Misma distancia, nadie pierde vida");
			}
			System.out.println(j1);
			System.out.println(j2);
			
			
			turno++;
			
			
		}while(j1.getVida() >0 && j2.getVida() >0);
		teclado.close();
		
		if (j1.haPerdido()) {
			System.out.println(j2.getNombre() + ", has ganado");
			System.out.println(j1.getNombre() + ", has perdido");
		} else {
			System.out.println(j1.getNombre() + ", has ganado");
			System.out.println(j2.getNombre() + ", has perdido");
		}

		
			
		
 
 

	}

}
