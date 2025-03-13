package Evento_Deportivo;
//Clase Participante
/*
 * Representa la información de un Participante del Evento Deportivo.
 */
public class Participante {
private String nombre;
private String apellido;
private int edad;
private double tiempoRegistrado;

public Participante(String nombre, String apellido, int edad, double tiempoRegistrado) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
	this.tiempoRegistrado=tiempoRegistrado;
	
	//Constructor de Participante
	/*
	 * @param nombre Nombre del Participante.
	 * @param apellido Apellidos del Participante.
	 * @param edad Edad del Participante.
	 */
}

//Getters Y Setters
/*
 * Aquí usamos los modificadores getter y setter para poder manipular u obtener los datos que 
 * queramos de estos atributos(nombre, apellido, edad y tiempo registrado).
 */

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) throws ParticipanteNoValidoException {
	this.edad = edad;
	if(edad<14) {
	throw new ParticipanteNoValidoException("La edad mínima para poder participar es 14 años.");	
	}
	this.edad=edad;
}
public double getTiempoRegistrado() {
	return tiempoRegistrado;
}

public void setTiempoRegistrado(double tiempoRegistrado) {
	this.tiempoRegistrado = tiempoRegistrado;
}

@Override
//Método toString
/*
 * Muestra todos los datos sobre el Participante.
 */
public String toString() {
	return "Participante [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
}
}
