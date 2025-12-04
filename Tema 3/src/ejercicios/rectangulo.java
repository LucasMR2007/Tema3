package ejercicios;

public class rectangulo {

	private int base;
	private int altura;

	public rectangulo() {

		this.base = 12;
		this.altura = 3;

	}

	public rectangulo(int base, int altura) {
		if (base < 0) {
			this.base = 12;
		} else {
			this.base = base;
		}
		if (altura < 0) {
			this.altura = 3;
		} else {
			this.altura = altura;
		}

	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		if (base < 0) {
			this.base = 12;
		} else {
			this.base = base;
		}
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		if (altura < 0) {
			this.altura = 3;
		} else {
			this.altura = altura;
		}
	}

	public void definirRectangulo() {
		if (base > altura) {
			System.out.println("Tu rectangulo es horizontal");
		} else if (altura > base) {
			System.out.println("Tu rectangulo es vertical");
		} else {
			System.out.println("No es un rectangulo, es un cuadrado lelo");
		}
	}

	public void baseAsteriscos() {

		int contador = 0;

		while (contador != altura) {

			for (int i = 1; i <= base; i++) {

				System.out.print("*");

				if (i == base) {
					contador++;
					System.out.println("\n");
				}

			}
		}
	}

	public void calcularArea(int area) {
		area = base * altura;
		System.out.println(area);
	}

	public void calcularPerimetro(int perimetro) {
		perimetro = 2 * base + 2 * altura;
		System.out.println(perimetro);
	}

	@Override
	public String toString() {
		return "rectangulo: Tiene de base= " + base + ", altura= " + altura;
	}

}
