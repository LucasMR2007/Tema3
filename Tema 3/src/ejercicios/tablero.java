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

	public void distEuclidea(int x2, int y2) {
		int x1 = p.getX();
		int y1 = p.getY();
		if (x2 < 1) {
			x2 = 1;
		} else if (x2 > 10) {
			x2 = 10;
		}
		if (y2 < 1) {
			y2 = 1;
		} else if (y2 > 10) {
			y2 = 10;
		}

		double despX = x2 - x1;
		despX = Math.pow(despX, 2);
		double despY = y2 - y1;
		despY = Math.pow(despY, 2);
		double suma = despX + despY;
		double raiz = Math.sqrt(suma);
		System.out.println(raiz);

	}

}
