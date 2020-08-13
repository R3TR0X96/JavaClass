package Consultorio;

public class Paciente {

	private String nombre;
	private String apellido;
	private float peso;
	private float estatura;

	public Paciente(String nombre, String apellido, float peso, float estatura) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.peso = peso;
		this.estatura = estatura;
	}
	
	public Paciente(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getEstatura() {
		return estatura;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}
	
	public String traerNombreCompleto() {
		return nombre+", "+apellido;
		
	}
	
	public float getIMC() {
		return (float)(peso / (estatura*estatura));
	}
}
