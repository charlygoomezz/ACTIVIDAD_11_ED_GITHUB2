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
}
