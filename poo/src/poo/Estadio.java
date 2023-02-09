package poo;

import java.util.Objects;

public class Estadio {

	private String nombre;
	private int capacidad;
	
	public Estadio(){
		
	}

	public Estadio(String nombre, int capacidad) {
		super();
		this.nombre = nombre;
		this.capacidad = capacidad;
	}
	public Estadio(Estadio e) {
		super();
		this.nombre = e.nombre;
		this.capacidad = e.capacidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", capacidad=" + capacidad + "";
	}

	@Override
	public int hashCode() {
		return Objects.hash(capacidad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estadio other = (Estadio) obj;
		return capacidad == other.capacidad && Objects.equals(nombre, other.nombre);
	}
	
	
	
}
