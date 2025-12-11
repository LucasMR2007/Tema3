package ejercicios;

public class jugador {

	private int vida;
	private String nombre;

	public jugador(String nombre) {

		this.vida = 100;
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void reducirVida() {
		vida = vida - 10;
		
	}
	public boolean haPerdido() {
		if (vida==0) {
			return true;
		}
		return false;
	}
	
			
		
	

	@Override
	public String toString() {
		return "Vida de " + nombre +" es " + vida;
	}
	

}
