package poo;

import java.util.Objects;

public class Coche {
	
	// 1. propiedades o atributos
	private int numeroRuedas;
	private String marca;
	private String modelo;
	private String matricula;
	private double precio;
	
	// 2. Declaramos los constructores
	
	// 2.1 Constructor vacio. Permite crear un objeto sin datos
	public Coche(){
		
	}

	
	// 2.2 Constructor con todos los parámetros
	public Coche(int numeroRuedas, String marca, String modelo, String matricula, double precio) {
		super();
		this.setNumeroRuedas(numeroRuedas);
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.setPrecio(precio);
	}
	// 2.2 Constructor de copia
	public Coche(Coche c) {
		super();
		this.numeroRuedas=c.numeroRuedas; // Al estar en la clase se puede llamar directamente a los parametros
		this.marca = c.marca;
		this.modelo = c.modelo;
		this.matricula = c.matricula;
		this.precio = c.precio;
	}

	// getters y setters
	public int getNumeroRuedas() {
		return numeroRuedas;
	}


	public void setNumeroRuedas(int numeroRuedas) {
		
		this.numeroRuedas = (((numeroRuedas<0)?numeroRuedas = numeroRuedas*-1:numeroRuedas)>6)?4:numeroRuedas;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getMatricula() {
		return (matricula==null)?"Sin matricula":matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		
		this.precio = (precio<0)?0:precio;
	}


	// 4. toString te permite decidir como quieres imprimir un objeto
	@Override
	public String toString() {
		return "Coche [numeroRuedas=" + getNumeroRuedas() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", matricula="
				+ getMatricula() + ", precio=" + getPrecio() + "]";
	}


	// 5. HashCode and equals. Define los criterios de igualdad de una clase
	@Override
	public int hashCode() {
		return Objects.hash(marca, matricula, modelo, numeroRuedas);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(matricula, other.matricula)
				&& Objects.equals(modelo, other.modelo) && numeroRuedas == other.numeroRuedas;
	}
	
	
	
}
