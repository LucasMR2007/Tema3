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

}
