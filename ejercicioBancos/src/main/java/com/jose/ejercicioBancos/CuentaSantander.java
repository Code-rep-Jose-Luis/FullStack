package com.jose.ejercicioBancos;

import java.time.LocalDate;

public class CuentaSantander extends Cuenta{
	public CuentaSantander() {
		
	}

	public CuentaSantander(String dni, String nombre, LocalDate fNacimiento, String cPais, double saldo) {
		super(dni,nombre,fNacimiento,cPais, saldo);
	}
}
