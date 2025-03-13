package Evento_Deportivo;

import java.util.ArrayList;
import java.util.Date;

//Clase Carrera
/*
 * Representa la carrera que toma lugar dentro del Evento Deportivo
 */
public class Carrera extends EventoDeportivo{

private double distancia;
/*
 * Constructor de la clase Carrera.
 * @param super Permite acceder a los atributos(nombre, fecha, lugar, participantes) de la clase Padre EventoDeportivo.
 * @param distancia Distancia, en kilómetros de la Carrera.
 */

public Carrera(String nombre, Date fecha, String lugar, ArrayList<Participante> participantes, double distancia) {
	super(nombre, fecha, lugar, participantes);
	this.distancia = distancia;
}

@Override
	public Participante obtenerGanador() {
	ArrayList<Participante> participantes = getParticipantes();
	if(participantes.isEmpty()) {
	return null;	
	}

	Participante ganador=participantes.get(0);
	for(Participante p: participantes) {
		if (p.getTiempoRegistrado() < ganador.getTiempoRegistrado()) {
            ganador = p; // Encontró uno con menor tiempo
        }	
	}
	return ganador;	
}
}
