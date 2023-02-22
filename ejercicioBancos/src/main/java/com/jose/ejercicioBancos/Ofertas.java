package com.jose.ejercicioBancos;

import java.util.ArrayList;
import java.util.List;


public class Ofertas {
	List<Oferta> ofertas;
	
	public Ofertas() {
		this.ofertas=new ArrayList<Oferta>();
	}

	public Ofertas(List<Oferta> ofertas) {
		super();
		this.ofertas = ofertas;
	}

	public List<Oferta> getOfertas() {
		return ofertas;
	}

	public void setOfertas(List<Oferta> ofertas) {
		this.ofertas = ofertas;
	}

	@Override
	public String toString() {
		return "Ofertas [ofertas=" + ofertas + "]";
	}


	public void setOferta(Oferta oferta) {
		try {
			this.ofertas.add(oferta);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Oferta> getOferta(int edad, double saldo){
		return ofertas.stream()
				.filter(e->edad>=e.getEdadMin() && edad<=e.getEdadMax())
				.filter(e->saldo>=e.getSaldoMin() && saldo<=e.getSaldoMax())
				.toList();
		
	}
	
}
