package herencia.ejercicio03;

import java.util.Objects;

public class Persona {

	private String dni;
	private String nombre;
	private int edad;
	
	public Persona() {
		
	}

	public Persona(String dni, String nombre, int edad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}
	public Persona(Persona p) {
		super();
		this.dni = p.dni;
		this.nombre = p.nombre;
		this.edad = p.edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni);
	}
	
	
	
}
