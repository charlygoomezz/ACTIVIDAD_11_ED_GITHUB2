package actividad_14_programacion;

import java.util.Arrays;

public class Equipo {
	String nombre;
	String[] listaJugadores;

	// Contructores
	public Equipo() {
		super();
	}

	public Equipo(String nombre, String[] listaJugadores) {
		super();
		this.nombre = nombre;
		this.listaJugadores = listaJugadores;
	}

	// Métodos

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", listaJugadores=" + Arrays.toString(listaJugadores) + "]";
	}

	public void mostrarJugadores() {
		for (int i = 0; i < this.listaJugadores.length; i++) {
			System.out.println(this.listaJugadores[i]);
		}
	}

	public boolean existeJugador(String jugador) {
		boolean existeJugador = false;
		for (int i = 0; i < this.listaJugadores.length; i++) {
			if (this.listaJugadores[i].equalsIgnoreCase(jugador)) {
				existeJugador = true;
			}
		}
		return existeJugador;
	}

	public int cuantosJugadoresHay() {
		int contador =0;
		for (String j : listaJugadores) {
			if(j!=null) {
				contador++;
			}
		}
		return contador;
	}
	
	public boolean returnIfPlayable() {
		return (this.listaJugadores.length >= 7) ? true : false;
	}

	// -> Los objetos tendrán la opción de devolver si una lista de jugadores pasada
	// por parámetro es exactamente igual a su lista de jugadores

	public boolean returnIfSamePlayers(String[] playerList) {

		boolean result = false;

		if (playerList.length == this.listaJugadores.length) {
			for (int i = 0; i < playerList.length; i++) {
				if (!(playerList[i].equals(this.listaJugadores[i]))) {
					result = false;
					break;
				} else {
					result = true;
				}
			}
		}

		return result;
	}

	// -> Los objetos tendrán la opción de devolver si un equipo pasado por
	// parámetro
	// es exactamente igual al mismo. Un equipo es exactamente igual si tiene el
	// mismo nombre y la misma lista de jugadores con los mismos nombres.

	public boolean returnIfSameTeam(Equipo equipo) {

		boolean result = false;

		if (equipo.nombre.equals(this.nombre) && this.returnIfSamePlayers(equipo.listaJugadores)) {
			result = true;
		}

		return result;

	}
	

}
