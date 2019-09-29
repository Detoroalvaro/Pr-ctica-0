package main;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CocheJuego extends Coche {
	
	private JLabelCoche coche;
	private JPanel panel;

	public CocheJuego(JFrame ventana) {
		coche = new JLabelCoche((int)getPosX(), (int)getPosY());
		panel = new JPanel();
		panel.add(coche);
		ventana.add(panel, BorderLayout.CENTER);
		ventana.revalidate();		
	}
	
	public void reajustar(int x, int y) {
		coche.setLocation(x, y);	
	}

}
