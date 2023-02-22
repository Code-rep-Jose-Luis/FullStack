package com.jose.colecciones.entidades;

import java.util.Objects;

public class Persona {
	
	private String nombre;
	private double salario;
	
	public Persona() {
		
	}

	public Persona(String nombre, double salario) {
		super();
		this.nombre = nombre;
		this.salario = salario;
	}
	public Persona(Persona p) {
		super();
		this.nombre = p.nombre;
		this.salario = p.salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", salario=" + salario + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
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
		return Objects.equals(nombre, other.nombre);
	}
	
	
}
