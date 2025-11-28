package ejercicios;

public class ejer3tema33 {

	public static void main(String[] args) {

		imprimirCalendario(2025, 11);
		
	}

	public static void imprimirCalendario(int anno, int mes) {
		int dias = ejer2tema3.numeroDeDiasMes(mes, anno);
		String nombre = decirNombreMes(mes);
		System.out.println(nombre + " , " + anno);

		System.out.println("L\tM\tX\tJ\tV\tS\tD");
		for (int i = 1; i <= dias; i++) {
			
			if (i==7) {
				System.out.println("\n");
			} else {
			
			
			

			
		}

	}

	public static String decirNombreMes(int mes) {
		switch (mes) {
		case 1:
			return "Enero";
		case 2:
			return "Febrero";
		case 3:
			return "Marzo";
		case 4:
			return "Abril";
		case 5:
			return "Mayo";
		case 6:
			return "Junio";
		case 7:
			return "Julio";
		case 8:
			return "Agosto";
		case 9:
			return "Septiembre";
		case 10:
			return "Octubre";
		case 11:
			return "Noviembre";
		case 12:
			return "Diciembre";

		default:
			return "error";
		}

	}

	public static int diaEnMEs(int dia, int mes, int anno) {
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			return 31;
		case 4, 6, 9, 11:
			return 30;
		case 2:
			if (anno % 4 == 0) {
				return 29;
			} else {
				return 28;
			}
		default:
			return -1;

		}
		

	}
	public static void diasTab(int dia) {
	
			
			
		
	}

}
