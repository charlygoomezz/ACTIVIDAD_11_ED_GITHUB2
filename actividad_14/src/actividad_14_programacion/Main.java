package actividad_14_programacion;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Creamos los equipos
		Equipo equipo1 = new Equipo();
		Equipo equipo2 = new Equipo();

		// Creamos el array de equipos
		Equipo[] listaJugadores = { equipo1, equipo2 };

		// Invocamos askData para darle datos a los equipos de las posiciones del array
		askData(sc, listaJugadores[0]);
		askData(sc, listaJugadores[1]);

		// Bucle para recorrer teamList para invocar los métodos de los equipos

		for (int i = 0; i < listaJugadores.length; i++) {
			System.out.println(listaJugadores[i]);
			System.out.println("----------------");

			System.out.println("JUGADORES: ");
			listaJugadores[i].mostrarJugadores();
			System.out.println("----------------");

			System.out.print("NÚMERO DE JUGADORES: ");
			System.out.println(listaJugadores[i].cuantosJugadoresHay());
			System.out.println("----------------");

			System.out.println(
					(listaJugadores[i].returnIfPlayable()) ? "El equipo es apto para jugar porque tiene al menos 7 jugadores"
							: "El equipo no es apto para jugar porque no tiene al menos 7 jugadores");
			System.out.println("----------------");

			System.out.print(
					"Introduce el nombre de un jugador para comprobar si está en el equipo " + listaJugadores[i].nombre + ": ");

			String userPlayer = sc.nextLine();
			System.out.println(
					(listaJugadores[i].existeJugador(userPlayer)) ? userPlayer + " existe en " + listaJugadores[i].nombre
							: " no existe en " + listaJugadores[i].nombre);
			System.out.println("----------------");

		}

		System.out.println((listaJugadores[0].returnIfSamePlayers(listaJugadores[1].listaJugadores)
				? listaJugadores[0].nombre + " tiene los mismos jugadores que " + listaJugadores[1].nombre
				: listaJugadores[0].nombre + " no tiene los mismos jugadores que " + listaJugadores[1].nombre));

		System.out.println((listaJugadores[0].returnIfSameTeam(listaJugadores[1])
				? listaJugadores[0].nombre + " es el mismo equipo que " + listaJugadores[1].nombre
				: listaJugadores[0].nombre + " no es el mismo equipo que " + listaJugadores[1].nombre));

	}

	public static void askData(Scanner sc, Equipo equipo) {
		System.out.print("Nombre: ");
		equipo.nombre = sc.nextLine();
		System.out.print("Cuántos jugadores tiene el equipo?");
		int numberOfPlayers = sc.nextInt();
		sc.nextLine();

		equipo.listaJugadores = new String[numberOfPlayers];

		System.out.println("Introduce el nombre de los jugadores: ");

		for (int i = 0; i < numberOfPlayers; i++) {
			System.out.print("Jugador " + (i + 1) + ": ");
			equipo.listaJugadores[i] = sc.nextLine();
		}

	}

}

