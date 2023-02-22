package com.jose.ejercicioBancos.entidades;

import java.time.LocalDate;

public final class CuentaCaixa extends Cuenta{
	private String nivelCatalan;
	
	public CuentaCaixa() {
		super();
	}
	public CuentaCaixa(String dni, String nombre, LocalDate fNacimiento, String cPais, double saldo) {
		super(dni,nombre,fNacimiento,cPais, saldo);
	}
	public CuentaCaixa(String dni, String nombre, LocalDate fNacimiento, String cPais, double saldo,String nivelCatalan) {
		super(dni,nombre,fNacimiento,cPais, saldo);
		this.nivelCatalan = nivelCatalan;
	}
	
	
	public CuentaCaixa(CuentaCaixa c) {
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
