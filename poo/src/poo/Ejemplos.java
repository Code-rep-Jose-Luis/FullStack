package poo;

import java.util.ArrayList;
import java.util.List;

public class Ejemplos {

	public static void ejemplosCoches() {
		Coche coche=new Coche(); // Coche sin datos
		coche.setNumeroRuedas(4);
		coche.setMarca("Seat");
		coche.setModelo("Altea");
		coche.setPrecio(2000);
		System.out.println(coche);
		Coche coche2=new Coche(-6,"Honda","3","023-MAH",5000);
		System.out.println(coche2);
		
		System.out.println("Mi coche es un "+coche.getMarca()+ " "+ coche.getModelo());
	
	}
	
	public static void ejercicio1() {
		Jugador jugador1=new Jugador();
		jugador1.setNombre("Luis");
		jugador1.setEdad(16);
		jugador1.setSueldo(2000);
		
		
		Jugador jugador2=new Jugador("Pepe",-18,-1000);
		
		System.out.println(jugador1);
		System.out.println(jugador2);
	}
	
public static void ejemploListaJugadores() {
		
		// Creo una lista vacía para almacenar los jugadores
		List<Jugador> jugadores = new ArrayList<Jugador>();
		
		Jugador fran = new Jugador("Fran", 45, 50000);
		Jugador david = new Jugador("David", 20, 60000);
		Jugador barbara = new Jugador("Bárbara", 23, 70000);
		Jugador camila = new Jugador("Camila", 22, 80000);
		Jugador joseLuis = new Jugador("José Luis", 18, 60000);
		Jugador enrique = new Jugador("Enrique", 15, 50000);
		Jugador atenea = new Jugador("Atenea", 20, 40000);
		Jugador angel = new Jugador("Ángel", 22, 1000000);
		Jugador nestor = new Jugador();
		nestor.setNombre("Néstor");
		nestor.setEdad(-20);
		nestor.setSueldo(-50000);
		Jugador francisco = new Jugador(fran);
		
		// Meter jugadores en la lista
		jugadores.add(fran);
		jugadores.add(david);
		jugadores.add(barbara);
		jugadores.add(camila);
		jugadores.add(joseLuis);
		jugadores.add(enrique);
		jugadores.add(atenea);
		jugadores.add(angel);
		jugadores.add(nestor);		
		jugadores.add(francisco);
		jugadores.add(new Jugador("Naomi",20,80000));
		
		// Imprmir todos los jugadores
		jugadores.forEach(e->System.out.println(e));
		// Filtra e imprime:
		System.out.println("Jugadores que ganan más de 60000 euros");
		jugadores.stream()
			.filter(e->e.getSueldo()>60000)
			.forEach(e->System.out.println(e));
		// Filtra e imprime:
		System.out.println("Jugadores que ganan entre 50000 y 70000 euros y su nombre tenga más de 5 letras");
		jugadores.stream()
			.filter(e->e.getSueldo()>=50000 && e.getSueldo()<=70000)
			.filter(e->e.getNombre().length()>5)
			.forEach(e->System.out.println(e));
		// Filtra e imprime:
		System.out.println("Jugadores que tengan una 'N' en su nombre");
		jugadores.stream()
			.filter(e->e.getNombre().toLowerCase().contains("n"))
			.forEach(e->System.out.println(e));
		
		
	}

	public static void ejemploEquipo() {
		Equipo barsa = new Equipo(); // Creo el equipo
		barsa.setNombre("F.C. Barcelona");
		barsa.setPresupuesto(400000000);
		Estadio campNou=new Estadio();
		campNou.setNombre("Spotify Camp Nou"); // Creo el estadio
		campNou.setCapacidad(100000);
		barsa.setEstadio(campNou);
		List<Jugador> jugadoresBarsa=new ArrayList<Jugador>(); // Creo la lista de jugadores
		jugadoresBarsa.add(new Jugador("Fran",45,100000));
		jugadoresBarsa.add(new Jugador("Paco",70,200000));
		jugadoresBarsa.add(new Jugador("Dani",42,300000));
		jugadoresBarsa.add(new Jugador("Consu",39,400000));
		barsa.setJugadores(jugadoresBarsa);
		System.out.println("Mostrar equipo:");
		System.out.println(barsa);
		
		Equipo madrid=new Equipo(barsa);
		System.out.println("Mostrar equipos:");
		madrid.getEstadio().setNombre("Nuevo estadio");
		barsa.getJugadores().get(0).setNombre("Pedro");
		System.out.println(barsa);
		System.out.println(madrid);
		
		
	}
	
	public static void ejercicio4() {
		Equipo equipo = new Equipo();
		equipo.addJugador(new Jugador("Fran",20,30000));
		equipo.addJugador(new Jugador("Pepe",30,20000));
		equipo.addJugador(new Jugador("Alberto",25,60000));
		equipo.addJugador(new Jugador("Juan",32,80000));
		equipo.deleteJugador(0);
		//equipo.getJugadores().forEach(e->System.out.println(e));
		for(int i=0;i<equipo.getNumJugadores();i++) {
			System.out.println(equipo.getJugador(i));
		}
		System.out.println(equipo.totalSueldos3());
	}
	
	public static void herenciaEjercicio01(){
		Tienda t =new Tienda();
		t.bienvenida();
		TiendaLicores tl=new TiendaLicores();
		tl.bienvenida();
		
	}
	
	public static void main(String[] args) {
		//ejemplosCoches();
		//ejercicio1();
		//ejemploListaJugadores();
		//ejemploEquipo();
		//ejercicio4();
		herenciaEjercicio01();
	}

}
