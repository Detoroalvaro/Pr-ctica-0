package main;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class JLabelCoche extends JLabel {
	
	private String imagen = "/pr00/coche.png";
	
	public JLabelCoche (int x, int y) {
		int ancho = 100;
		int alto = 100;
		
		ImageIcon cocheIm = new ImageIcon(getClass().getResource(imagen));
		ImageIcon cocheBien = new ImageIcon(cocheIm.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));
		setPreferredSize(new Dimension(100, 100));
		setLocation((int) x, (int) y);
		setIcon(cocheBien);
	}
}
