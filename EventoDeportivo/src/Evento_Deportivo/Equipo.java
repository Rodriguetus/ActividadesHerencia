package Evento_Deportivo;

import java.util.ArrayList;
//Clase Equipo
/*
 * Representa un equipo del Evento Deportivo.
 */
public class Equipo {
private String nombre;
private ArrayList<Participante> jugadores=new ArrayList<>();
private int puntos;

//Constructor de la Clase Equipo
/*
 * @param nombre Nombre del Equipo.
 * @param jugadores Jugadores que conforman el Equipo.
 * @param puntos Puntos del Equipo.
 */
public Equipo(String nombre, ArrayList<Participante> jugadores, int puntos) {
	super();
	this.nombre = nombre;
	this.jugadores = null;
	this.puntos = 0;
}

public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) throws ParticipanteNoValidoException {
	this.nombre = nombre;
	if (nombre == null) {
        throw new ParticipanteNoValidoException("El nombre no puede ser nulo.");
    }
    this.nombre = nombre;
}


public ArrayList<Participante> getJugadores() {
	return jugadores;
}


public void setJugadores(ArrayList<Participante> jugadores) {
	this.jugadores = jugadores;
}


public int getPuntos() {
	return puntos;
}


public void setPuntos(int puntos) {
	this.puntos = puntos;
}


//Método para añadir Jugadores al Equipo.
public void añadirJugador(Participante jugador) {
this.jugadores.add(jugador);	
}

//Método para eliminar Jugadores del Equipo.
public void eliminarJugador(Participante jugador) throws JugadorNoEncontradoException{
	boolean encontrado=false;
for(Participante p: jugadores) {
if(p.getNombre().equalsIgnoreCase(jugador.getNombre()) && p.getApellido().equalsIgnoreCase(jugador.getApellido())) {
jugadores.remove(p);
encontrado=true;
break;
}
if (!encontrado) {
    throw new JugadorNoEncontradoException("Jugador " + jugador.getNombre() + " " + jugador.getApellido() + " no encontrado en el equipo.");
}
}
	

System.out.println("Este jugador no existe");	
}


@Override
//Método String que muestra toda información del Equipo.
public String toString() {
	return "Equipo [nombre=" + nombre + ", jugadores=" + jugadores + ", puntos=" + puntos + "]";
}
}
