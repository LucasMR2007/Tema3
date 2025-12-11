package ejercicios;

public class ejer12tema3 {

	public static void main(String[] args) {

		tablero tablero = new tablero();
		tablero.imprimirTablero();
		tablero.moverX(3);
		tablero.moverY(4);
		tablero.distEuclidea(0, 0, 0, 0);
		tablero.imprimirTablero();
		
		tablero.moverX(12);
		tablero.moverY(6);
		tablero.imprimirTablero();
		
	
	}

}
