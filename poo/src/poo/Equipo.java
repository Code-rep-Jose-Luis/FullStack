package poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equipo {

	private String nombre;
	private Estadio estadio;
	private List<Jugador> jugadores;
	private double presupuesto;
	
	public Equipo() {
		estadio=new Estadio();
		this.jugadores=new ArrayList<Jugador>();
	}

	public Equipo(String nombre, Estadio estadio, List<Jugador> jugadores, double presupuesto) {
		super();
		this.nombre = nombre;
		this.estadio = estadio;
		this.jugadores = jugadores;
		this.presupuesto = presupuesto;
	}
	public Equipo(Equipo e) {
		super();
		this.nombre = e.nombre;
		this.estadio = new Estadio(e.estadio);
/*		this.jugadores=new ArrayList<Jugador>();
		copyJugadores3(e.jugadores);
*/		this.jugadores=copyJugadores(e.jugadores);
		this.presupuesto = e.presupuesto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estadio getEstadio() {
		return estadio;
	}

	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	public void copyJugadores2(List<Jugador> jugadores) {
		jugadores.forEach(e->this.jugadores.add(new Jugador(e)));
	}
	
	public List<Jugador> copyJugadores(List<Jugador> jugadores) {
		List<Jugador> lista = new ArrayList<Jugador>();
		jugadores.forEach(e->lista.add(new Jugador(e)));
		return lista;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + "\nestadio=" + estadio + "\njugadores=" + jugadores + "\npresupuesto="
				+ presupuesto + "\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	public boolean addJugador(Jugador jugador) {
		try {
			jugadores.add(jugador);	
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Jugador getJugador(int posicion) {
		try {
			return jugadores.get(posicion);
		} catch (Exception e) {
			return null;
		}
	}
		
	public int getNumJugadores() {
		return jugadores.size();
	}
	
	public boolean deleteJugador(int posicion) {
		try {
			jugadores.remove(posicion);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public double totalSueldos() {
		double sueldoTotal=0;
		for(Jugador jugador:jugadores) {
			sueldoTotal+=jugador.getEdad();
		}
		return sueldoTotal;
	}
	public double totalSueldos2() {
		
		double[] sueldoTotal=new double[1];
		jugadores.forEach(e->sueldoTotal[0]+=e.getSueldo());
		return sueldoTotal[0];
	}
	public double totalSueldos3() {
		return jugadores.stream().mapToDouble(e->e.getSueldo()).sum();
	}

	
		
	
}
