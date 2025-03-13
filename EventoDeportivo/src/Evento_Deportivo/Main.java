package Evento_Deportivo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//Clase Main
/*
 * Representa el sistema de gestión para los eventos deportivos permitiéndonos
 * almacenar y gestionar la información de las clases anteriormente creadas.
 */
public class Main {
	public static void main(String[] args) throws ParseException {
        try {
        	// Crear la fecha específica
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        	Date fechaCarrera=formato.parse("15/03/2025");
            // Crear eventos
            Carrera carrera = new Carrera(null, fechaCarrera, null, null, 0);
            TorneoDeFutbol torneo = new TorneoDeFutbol("Torneo Intercolegial", fechaCarrera, null, null, null);

            // Crear participantes válidos
            Participante p1 = new Participante("Lucía", "Fernández", 18, 103);
            Participante p2 = new Participante("Mateo", "García", 16, 104);
            Participante p3 = new Participante("Elena", "Suárez", 19, 174);

            // Añadir participantes a la carrera
            carrera.inscribirParticipante(p1);
            carrera.inscribirParticipante(p2);
            carrera.inscribirParticipante(p3);

            // Crear equipos
            Equipo equipoA = new Equipo("Águilas", null, 0);
            Equipo equipoB = new Equipo("Leones", null, 0);

            // Añadir jugadores a equipos
            Participante jugador1 = new Participante("Carlos", "Méndez", 20, 0);
            Participante jugador2 = new Participante("Sofía", "Torres", 17, 0);
            Participante jugador3 = new Participante("Diego", "Ramírez", 22, 0);

            equipoA.añadirJugador(jugador1);
            equipoA.añadirJugador(jugador2);

            equipoB.añadirJugador(jugador3);

            // Asignar puntos a los equipos (simulación de partidos)
            equipoA.setPuntos(10);
            equipoB.setPuntos(15);

            // Inscribir equipos en torneo
            torneo.inscribirEquipo(equipoA);
            torneo.inscribirEquipo(equipoB);

            // Mostrar equipos y jugadores
            System.out.println(equipoA);
            equipoA.getJugadores();

            System.out.println(equipoB);
            equipoB.getJugadores();

            // Eliminar un jugador (existente y no existente)
            try {
                equipoA.eliminarJugador(new Participante("Carlos", "Méndez", 20, 0));
                equipoA.eliminarJugador(new Participante("Pedro", "Lopez", 21, 0)); // Este no existe
            } catch (JugadorNoEncontradoException e) {
                System.out.println("Excepción: " + e.getMessage());
            }

            // Mostrar información de eventos
            System.out.println("\nInformación de la Carrera:");
            System.out.println(carrera);
            System.out.println("\nInformación del Torneo de Fútbol:");
            System.out.println(torneo);

            // Mostrar ganadores
            System.out.println("\nGanador de la carrera:");
            System.out.println(carrera.obtenerGanador());

            System.out.println("\nGanador del torneo de fútbol:");
            System.out.println(torneo.obtenerGanador());

        } catch (ParticipanteNoValidoException e) {
            System.out.println("Error al crear participante: " + e.getMessage());
        }
    }
}
