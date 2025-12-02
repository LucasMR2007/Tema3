package ejercicios;



public class banco {

	private String nombre;
	private int DNI;
	private String domicilio;
	private String letraDNI;
	private float dinero;
	public banco(String nombre, int dNI, String domicilio, String letraDNI, float dinero) {
		super();
		this.nombre = nombre;
		DNI = dNI;
		this.domicilio = domicilio;
		this.letraDNI = letraDNI;
		this.dinero = dinero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getLetraDNI() {
		return letraDNI;
	}
	public void setLetraDNI(String letraDNI) {
		this.letraDNI = letraDNI;
	}
	public float getDinero() {
		return dinero;
	}
	public void setDinero(float dinero) {
		this.dinero = dinero;
	}
	
	public void ingresarDinero(int ingresoDinero) {
		if (ingresoDinero < 0) {
			System.out.println("ERROR" );
		} else {
			dinero = dinero + ingresoDinero;
		}
	}
	public void sacarDinero(int cantidadDinero) {
		if (cantidadDinero < 0) {
			System.out.println("ERROR" );
		} else if (cantidadDinero<0) {
			System.out.println("Tu cuenta esta pelada");
		}else{
			dinero = dinero - cantidadDinero;
		}
		
		}
	
	
	public void domicilioNuevo (String nuevoDomicilio) {
		domicilio=nuevoDomicilio;
	}
	
	
	@Override
	public String toString() {
		return "Sesion iniciada:" + "\nNombre = " + nombre + "\nDNI = " + DNI + "\nDomicilio = " + domicilio + "\nLetra del DNI = " + letraDNI
				+ "\nDinero = " + dinero;
	}
	
	
	
	
	
	
	
	}


