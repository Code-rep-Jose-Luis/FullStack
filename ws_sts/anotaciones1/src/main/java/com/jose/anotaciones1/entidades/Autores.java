package com.jose.anotaciones1.entidades;
// Generated 16 mar 2023 9:55:43 by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * Autores generated by hbm2java
 */
@Entity
@Table(name = "autores")
public class Autores implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cod;
	private String nombre;
	private Set<Libros> libroses = new HashSet<Libros>(0);

	public Autores() {
	}

	public Autores(String cod) {
		this.cod = cod;
	}

	public Autores(String cod, String nombre, Set<Libros> libroses) {
		this.cod = cod;
		this.nombre = nombre;
		this.libroses = libroses;
	}

	@Id

	@Column(name = "cod", unique = true, nullable = false, length = 5)
	public String getCod() {
		return this.cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	@Column(name = "nombre", length = 60)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "autores")
	public Set<Libros> getLibroses() {
		return this.libroses;
	}

	public void setLibroses(Set<Libros> libroses) {
		this.libroses = libroses;
	}

}
