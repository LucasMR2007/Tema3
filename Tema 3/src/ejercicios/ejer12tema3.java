package ejercicios;

public class ejer12tema3 {

	public static void main(String[] args) {

		tablero tablero = new tablero();
		tablero.imprimirTablero();
		tablero.moverX(3);
		tablero.moverY(4);
	
		tablero.imprimirTablero();
		
		tablero.moverX(12);
		tablero.moverY(6);
		tablero.imprimirTablero();
		
		System.out.println("La distancia euclídea entre puntos es: ");
		tablero.distEuclidea(7, 5);
	
	}

}
