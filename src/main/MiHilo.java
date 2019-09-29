package main;

public class MiHilo implements Runnable{

	private Coche coche;
	private boolean sigue;
	private Thread juego;
	
	@Override
	public void run() {
		while (sigue) {
			mueve();
			System.out.println("Mira, funciono");
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void mueve() {
		coche.mueve(0.4);
		if (VentanaJuego.cerrada) {
			sigue = false;
		}
	}
	
	public void empieza() {
		sigue = true;
		juego = new Thread(this, "juego");
		juego.run();
	}

}
