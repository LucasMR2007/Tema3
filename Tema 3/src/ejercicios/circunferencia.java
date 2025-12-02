package ejercicios;

public class circunferencia {
	
	
	private float radio;
	private final float PI= (float) 3.1415;
	
	public circunferencia(float radio) {
		this.radio = radio;
	}
	

	public float getRadio() {
		return radio;
	}


	public void setRadio(float radio) {
		this.radio = radio;
	}


	public float getPI() {
		return PI;
	}
	
	float calcularDiametro() {
		float diametro= radio*2;
		return diametro;
		
	}
	
	float calcularArea() {
		float area= (float) (PI*Math.pow(radio, 2));
		return area;
	}
	
	float calcularLongitud() {
		float longitud= 2*radio*PI;
		return longitud;
		
	}
	
	
	

	@Override
	public String toString() {
		return "circunferencia [radio=" + radio + ", PI=" + PI + "]";
	}



	
	
	
	
	
	
	

}
