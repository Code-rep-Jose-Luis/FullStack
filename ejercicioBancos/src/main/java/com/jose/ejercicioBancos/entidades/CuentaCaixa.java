package com.jose.ejercicioBancos.entidades;

import java.time.LocalDate;

public class CuentaCaixa extends Cuenta{

	public CuentaCaixa() {
		super();
	}
	public CuentaCaixa(String dni, String nombre, LocalDate fNacimiento, String cPais, double saldo) {
		super(dni,nombre,fNacimiento,cPais, saldo);
	}
	
}
