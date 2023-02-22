package com.jose.ejercicioBancos.entidades;

import java.time.LocalDate;

public class CuentaSantander extends Cuenta{
	private boolean residente;
	private static int cuentasCreadas;
	public CuentaSantander() {
		residente=false;
		cuentasCreadas++;
	}

	public CuentaSantander(String dni, String nombre, LocalDate fNacimiento, String cPais, double saldo) {
		super(dni,nombre,fNacimiento,cPais, saldo);
		cuentasCreadas++;
	}
	
	public CuentaSantander(String dni, String nombre, LocalDate fNacimiento, String cPais, double saldo,boolean residente) {
		super(dni,nombre,fNacimiento,cPais, saldo);
		this.residente=residente;
		cuentasCreadas++;
	}
	
	public CuentaSantander(CuentaSantander c) {
		super(c);
		this.residente = c.residente;
	}

	public boolean isResidente() {
		return residente;
	}

	public void setResidente(boolean residente) {
		this.residente = residente;
	}

	public static int getCuentasCreadas() {
		return cuentasCreadas;
	}

	public static void setCuentasCreadas(int cuentasCreadas) {
		CuentaSantander.cuentasCreadas = cuentasCreadas;
	}

	@Override
	public String toString() {
		return "Cuenta [dni=" + dni + ", nombre=" + nombre + ", fNacimiento=" + fechaNacimiento + ", cPais=" + codigoPais
				+ ", saldo=" + saldo + ", residente=" + residente + "]";
	}
	
}
