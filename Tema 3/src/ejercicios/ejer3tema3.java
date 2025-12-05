package ejercicios;

public class ejer3tema3 {

	public static void calendario(int mes, int anio) {
		int diaInicio = diaComienzoMes(mes, anio);
		int diasMes = diasEnMes(mes, anio);

		System.out.println("\n   Calendario de " + mes + " / " + anio);
		System.out.println("Lun Mar Mie Jue Vie Sab Dom");

		int indiceInicio = (diaInicio + 6) % 7;

		for (int i = 0; i < indiceInicio; i++) {
			System.out.print("    ");
		}

		int dia = 1;
		while (dia <= diasMes) {
			System.out.printf("%3d ", dia);
			if ((indiceInicio + dia) % 7 == 0)
				System.out.println();
			dia++;
		}
		System.out.println();
	}
	

	public static boolean esBisiesto(int anio) {
		return (anio % 4 == 0);
	}

	public static int diasEnMes(int mes, int anio) {
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			return 31;
		case 4, 6, 9, 11:
			return 30;
		case 2:
			return esBisiesto(anio) ? 29 : 28;
		}
		return 0;
	}

	public static int diaComienzoMes(int mes, int anio) {
		int res;

		if (mes == 1 || mes == 2) {
			res = (anio + 31 * (mes - 1) + (anio - 1) / 4 - (3 * ((anio + 99) / 100)) / 4) % 7;
		} else {
			res = (anio + 31 * (mes - 1) - (4 * mes + 23) / 10 + anio / 4 - (3 * (anio / 100 + 1)) / 4) % 7;
		}

		if (res < 0)
			res += 7;
		return res;
	}

	public static void main(String[] args) {
		calendario(3, 2020);
	}
}
