package ejercicios;

public class tablero {

	punto p;

	public tablero() {

		p = new punto();

	}

	public void imprimirTablero() {

		for (int i = 1; i <= 10; i++) {
			System.out.print("\t" + i);
		}
		System.out.println();

		for (int i = 10; i >= 1; i--) {
			System.out.print(i + "\t");
			for (int j = 1; j <= 10; j++) {

				if (p.getY() == i && p.getX() == j) {
					System.out.print("o");
				}
				System.out.print("\t");
			}
			System.out.println();
		}

	}

	public void moverX(int desplazamiento) {

		int nuevaPosicion = p.getX() + desplazamiento;
		p.setX(nuevaPosicion);
		
		if (nuevaPosicion < 1) {
			p.setX(1);
		} else if (nuevaPosicion > 10) {
			p.setX(10);
		}

	}

	public void moverY(int desplazamiento) {

		int nuevaPosicion = p.getY() + desplazamiento;
		p.setY(nuevaPosicion);
		if (nuevaPosicion < 1) {
			p.setY(1);
		} else if (nuevaPosicion > 10) {
			p.setY(10);
		}

	}
	public void distEuclidea(int distX2, int distY2, int desplazamientoX, int desplazamientoY) {
		int distX1= p.getX();
		int distY1= p.getY();
		
		distX2= p.getX() + desplazamientoX;
		distY2= p.getY() + desplazamientoY;
		
		
		
		
		
	}

}
