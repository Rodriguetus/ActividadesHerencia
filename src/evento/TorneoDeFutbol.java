package Evento_Deportivo;

import java.util.ArrayList;
import java.util.Date;

//Clase Torneo De Futbol
/*
 * Representa el Torneo de futbol que toma lugar en el Evento Deportivo.
 */
public class TorneoDeFutbol extends EventoDeportivo{
private ArrayList<Equipo> equipos=new ArrayList<>();
//Constructor de la Clase TorneoDeFutbol
/*
 * @param super Permite acceder a los atributos(nombre, fecha, lugar, participantes) de la clase Padre EventoDeportivo.
 * @param equipos Equipos que participan en el Torneo de Futbol.
 */
public TorneoDeFutbol(String nombre, Date fecha, String lugar, ArrayList<Participante> participantes, ArrayList<Equipo> equipos) {
	super(nombre, fecha, lugar, participantes);
	this.equipos = equipos;
}

public ArrayList<Equipo> getEquipos() {
	return equipos;
}

public void setEquipos(ArrayList<Equipo> equipos) {
	this.equipos = equipos;
}

//Método para obtener al Equipo ganador del Torneo de Futbol usando un reemplazo de variables.
public Participante obtenerGanador() {
	ArrayList<Equipo> equipos = getEquipos();
	if(equipos.isEmpty()) {
	return null;
	}
	Equipo equipoganador=equipos.get(0);
	for(Equipo e:equipos) {
	if(e.getPuntos()>equipoganador.getPuntos()) {
	equipoganador=e;	
	}
	}
	return equipoganador;
}
}
