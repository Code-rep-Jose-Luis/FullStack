package com.jose.ejercicioBancos.entidades;

import java.time.LocalDate;

public class CuentaSabadell extends Cuenta{

	public CuentaSabadell() {
		super();
	}

	public CuentaSabadell(String dni, String nombre, LocalDate fNacimiento, String cPais, double saldo) {
		super(dni,nombre,fNacimiento,cPais, saldo);
	}
}
