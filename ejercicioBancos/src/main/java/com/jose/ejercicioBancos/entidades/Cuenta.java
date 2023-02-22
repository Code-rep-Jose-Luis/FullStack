package com.jose.ejercicioBancos.entidades;

import java.time.LocalDate;
import java.util.Objects;

public class Cuenta {
	String dni;
	String nombre;
	LocalDate fechaNacimiento;
	String codigoPais;
	double saldo;
	
	public Cuenta() {
		
	}

	public Cuenta(String dni, String nombre, LocalDate fNacimiento, String cPais, double saldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fNacimiento;
		this.codigoPais = cPais;
		this.saldo = saldo;
	}
	public Cuenta(Cuenta c) {
		super();
		this.dni = c.dni;
		this.nombre = c.nombre;
		this.fechaNacimiento = c.fechaNacimiento;
		this.codigoPais = c.codigoPais;
		this.saldo = c.saldo;
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

	public LocalDate getfechaNacimiento() {
		return fechaNacimiento;
	}

	public void setfechaNacimiento(LocalDate fNacimiento) {
		this.fechaNacimiento = fNacimiento;
	}

	public String getcodigoPais() {
		return codigoPais;
	}

	public void setcodigoPais(String cPais) {
		this.codigoPais = cPais;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [dni=" + dni + ", nombre=" + nombre + ", fNacimiento=" + fechaNacimiento + ", cPais=" + codigoPais
				+ ", saldo=" + saldo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaNacimiento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Cuenta other = (Cuenta) obj;
		return Objects.equals(fechaNacimiento, other.fechaNacimiento);
	}

	
	/*
	 
	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		return Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre);
	}
	
	*/
	
	
	
	
}
