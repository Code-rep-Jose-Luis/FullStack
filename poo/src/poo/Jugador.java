package poo;

import java.util.Objects;

public class Jugador {
	private String nombre;
	private int edad;
	private double sueldo;
	
	/**
	 * Contructor de la clase Jugador vacio
	 */
	public Jugador() {
		
	}
	
	/**
	 * Contructor de la clase Jugador con todos los parametros
	 * @param nombre
	 * @param edad si es negativa, se pasa a positivo
	 * @param sueldo si es negativo, se pasa a positivo
	 */
	public Jugador(String nombre, int edad, int sueldo) {
		super();
		this.nombre = nombre;
		this.setEdad(edad);
		this.setSueldo(sueldo);
	}
	
	public Jugador(Jugador j) {
		super();
		this.nombre = j.nombre;
		this.setEdad(j.edad);
		this.setSueldo(j.sueldo);
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
		this.edad = Math.abs(edad);
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = Math.abs(sueldo);
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre, sueldo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre) && sueldo == other.sueldo;
	}
	
	
	
}
