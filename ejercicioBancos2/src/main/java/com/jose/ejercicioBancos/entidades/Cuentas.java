package com.jose.ejercicioBancos.entidades;

import java.util.ArrayList;
import java.util.List;


public class Cuentas {
	List<Cuenta> cuentas;
	
	public Cuentas() {
		this.cuentas=new ArrayList<Cuenta>();
	}

	public Cuentas(List<Cuenta> cuentas) {
		super();
		this.cuentas = cuentas;
	}
	
	public Cuentas(Cuentas cuentas) {
		
		this.cuentas = cuentas.getCuentas();
	}

	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	public void addCuentas(List<Cuenta> cuentas) {	
		this.cuentas.addAll(cuentas);
	}

	
	public void addCuenta(Cuenta cuenta) {
		this.cuentas.add(cuenta);
	}
	/*
	public void addCuenta(CuentaCaixa cuenta) {
		Cuenta c = cuenta;
		this.cuentas.add(c);
	}
	public void addCuenta(CuentaSabadell cuenta) {
		Cuenta c = cuenta;
		this.cuentas.add(c);
	}
	public void addCuenta(CuentaSantander cuenta) {
		Cuenta c = cuenta;
		this.cuentas.add(c);
	}*/

	
	
	@Override
	public String toString() {
		return "Cuentas [cuentas=" + cuentas + "]";
	}



	
	
}
