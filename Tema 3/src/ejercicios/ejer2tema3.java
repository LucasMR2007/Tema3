package ejercicios;

public class ejer2tema3 {


	public static void main(String[] args) {

		int dias = calcularDiaDelAnio(2004,12,32);
		System.out.println(dias);
	}
	

	
	
	
	public static int calcularDiaDelAnio(int anio, int mes, int dia) {
		int numeroDias = 0;
		
		for(int i = 1; i < mes; i++) {
			numeroDias = numeroDias + numeroDeDiasMes(i,anio);
		}
		
		numeroDias = numeroDias + dia;
		return numeroDias;
	}

	public static int numeroDeDiasMesAnio(int anio, int mes) {
		return 0;
	}
	
	public static int numeroDeDiasMes(int mes, int anio) {
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			return 31;
		case 2:
			if (anio % 4==0) {
				return 29;
			}else {
				return 28;
			}
		case 4, 6, 9, 11:
			return 30;
		default:
			return -1;
		}
	}




}
