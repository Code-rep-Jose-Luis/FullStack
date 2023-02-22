package com.jose.ejercicioBancos;

import java.util.Objects;

public class Oferta {
	int edadMin;
	int edadMax;
	double saldoMin;
	double saldoMax;
	String nombre;
	
	public Oferta() {
		
	}
	
	

	public Oferta(int edadMin, int edadMax, double saldoMin, double saldoMax, String nombre) {
		super();
		this.edadMin = edadMin;
		this.edadMax = edadMax;
		this.saldoMin = saldoMin;
		this.saldoMax = saldoMax;
		this.nombre = nombre;
	}

	public Oferta(Oferta o) {
		super();
		this.edadMin = o.edadMin;
		this.edadMax = o.edadMax;
		this.saldoMin = o.saldoMin;
		this.saldoMax = o.saldoMax;
		this.nombre = o.nombre;
	}



	public int getEdadMin() {
		return edadMin;
	}



	public void setEdadMin(int edadMin) {
		this.edadMin = edadMin;
	}



	public int getEdadMax() {
		return edadMax;
	}



	public void setEdadMax(int edadMax) {
		this.edadMax = edadMax;
	}



	public double getSaldoMin() {
		return saldoMin;
	}



	public void setSaldoMin(double saldoMin) {
		this.saldoMin = saldoMin;
	}



	public double getSaldoMax() {
		return saldoMax;
	}



	public void setSaldoMax(double saldoMax) {
		this.saldoMax = saldoMax;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public String toString() {
		return "Oferta [edadMin=" + edadMin + ", edadMax=" + edadMax + ", saldoMin=" + saldoMin + ", saldoMax="
				+ saldoMax + ", nombre=" + nombre + "]";
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
		Oferta other = (Oferta) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	
	
}
