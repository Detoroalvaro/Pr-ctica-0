package main;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Coche {
	 private double miVelocidad; // Velocidad en pixels/segundo
	 protected double miDireccionActual; // Dirección en la que estoy mirando en grados (de 0 a 360)
	 protected double posX; // Posición en X (horizontal)
	 protected double posY; // Posición en Y (vertical)
	 private String piloto; // Nombre de piloto
	 private CocheJuego cocheJ;
	 
	public Coche() {
		this.miVelocidad = 0;
		this.miDireccionActual = 0;
		this.posX = 0.0;
		this.posY = 0.0;
		this.piloto = "";
	}
	
	public Coche(JFrame ventana) {
		this.miVelocidad = 0;
		this.miDireccionActual = 0;
		this.posX = 0.0;
		this.posY = 0.0;
		this.piloto = "";
		cocheJ = new CocheJuego(ventana);
	}
	
	
	/** Cambia la velocidad actual del coche
	 * @param aceleracion Incremento de la velocidad en pixels/segundo
	 */
	 public void acelera( double aceleracion ) {
		 setMiVelocidad(getMiVelocidad() + aceleracion);
	 }
	 /** Cambia la dirección actual del coche
	 * @param giro Angulo de giro a sumar o restar de la dirección actual, en grados (-180 a +180)
	 */
	 public void gira( double giro ) {
		 setMiDireccionActual(getMiDireccionActual() + giro);
	 }
	 /** Cambia la posición del coche dependiendo de su velocidad y dirección
	 * @param tiempoDeMovimiento Tiempo transcurrido, en segundos
	 */
	 public void mueve( double tiempoDeMovimiento ) {
		 setPosX(getPosX() + miVelocidad * tiempoDeMovimiento * Math.cos(Math.toRadians(miDireccionActual)));
		 setPosY(getPosY() + miVelocidad * tiempoDeMovimiento * Math.cos(Math.toRadians(miDireccionActual)));
		 cocheJ.reajustar((int) getPosX(), (int) getPosY());
	 } 
	
	public static void main(String[] args) {
		//Coche coche = new Coche(0, 0, 150, 100, "Paco");
	}

	public double getMiVelocidad() {
		return miVelocidad;
	}

	public void setMiVelocidad(double miVelocidad) {
		this.miVelocidad = miVelocidad;
	}

	public double getMiDireccionActual() {
		return miDireccionActual;
	}

	public void setMiDireccionActual(double miDireccionActual) {
		this.miDireccionActual = miDireccionActual;
	}

	public double getPosX() {
		return posX;
	}

	public void setPosX(double posX) {
		this.posX = posX;
	}

	public double getPosY() {
		return posY;
	}

	public void setPosY(double posY) {
		this.posY = posY;
	}

	public String getPiloto() {
		return piloto;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}

	@Override
	public String toString() {
		return "Coche [miVelocidad=" + miVelocidad + ", miDireccionActual=" + miDireccionActual + ", posX=" + posX
				+ ", posY=" + posY + ", Piloto=" + piloto + "]";
	}
	 
	 
}
