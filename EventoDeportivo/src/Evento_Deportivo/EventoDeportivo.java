package Evento_Deportivo;

import java.util.ArrayList;
import java.util.Date;


//Clase abstracta Evento Deportivo
/*
 * Representa el Evento Deportivo mostrando el lugar y los participantes que estarán en este evento.
 */
public abstract class EventoDeportivo implements Ganador{
private String nombre;
private Date fecha;
private String lugar;
private ArrayList<Participante> participantes=new ArrayList<>();

/**
 * Constructor del Evento Deportivo.
 * @param nombre Nombre del Evento Deportivo.
 * @param fecha Fecha del Evento Deportivo.
 * @param lugar Lugar del Evento Deportivo.
 * @param participantes Lista de participantes del Evento Deportivo.
 */
public EventoDeportivo(String nombre, Date fecha, String lugar, ArrayList<Participante> participantes) {
	this.nombre = nombre;
	this.fecha = fecha;
	this.lugar = lugar;
	this.participantes = participantes;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public Date getFecha() {
	return fecha;
}

public void setFecha(Date fecha) {
	this.fecha = fecha;
}

public String getLugar() {
	return lugar;
}

public void setLugar(String lugar) {
	this.lugar = lugar;
}

public ArrayList<Participante> getParticipantes() {
	return participantes;
}

public void setParticipantes(ArrayList<Participante> participantes) {
	this.participantes = participantes;
}



public void inscribirParticipante(Participante participante) {
this.participantes.add(participante);
}

public void inscribirEquipo(Equipo equipo) {
	this.equipo.add(equipo);	
}

@Override
public abstract Participante obtenerGanador();

}
