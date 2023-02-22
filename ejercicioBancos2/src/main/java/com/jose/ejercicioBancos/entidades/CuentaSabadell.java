package com.jose.ejercicioBancos.entidades;

import java.time.LocalDate;

public final class CuentaSabadell extends Cuenta{
	private String nivelCatalan;
	public CuentaSabadell() {
		super();
	}

	public CuentaSabadell(String dni, String nombre, LocalDate fNacimiento, String cPais, double saldo) {
		super(dni,nombre,fNacimiento,cPais, saldo);
	}
	
	public CuentaSabadell(String dni, String nombre, LocalDate fNacimiento, String cPais, double saldo,String nivelCatalan) {
		super(dni,nombre,fNacimiento,cPais, saldo);
		this.nivelCatalan = nivelCatalan;
	}
	
	public CuentaSabadell(CuentaSabadell c) {
		super(c);
		this.nivelCatalan = c.nivelCatalan;
	}
	
	public String getNivelCatalan() {
		return nivelCatalan;
	}

	public void setNivelCatalan(String nivelCatalan) {
		this.nivelCatalan = nivelCatalan;
	}

	@Override
	public String toString() {
		return "Cuenta [dni=" + dni + ", nombre=" + nombre + ", fNacimiento=" + fechaNacimiento + ", cPais=" + codigoPais
				+ ", saldo=" + saldo + ", nivelCatalan=" + nivelCatalan + " ]";
	}
	
	
}
