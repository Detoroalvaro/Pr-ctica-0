package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class  VentanaJuego extends JFrame  {
	private static VentanaJuego ventana;
	private JPanel panelGrafico;
	public static boolean cerrada;
	
	public  VentanaJuego(String nombre) {
		setSize(800,700);
		setLocation(500, 100);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	public void inicio(Coche coche, JFrame vent) {
		JButton aceleraBut = new JButton("Acelerar");
		JButton frenaBut = new JButton("Frena");
		JButton izqBut = new JButton("Gira Izq.");
		JButton derBut = new JButton("Gira Der.");
		aceleraBut.addActionListener( new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				coche.acelera(5);
				System.out.println(coche);
				vent.repaint();
			}
		});
		frenaBut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				coche.acelera(-5);
				vent.repaint();
			}
		});
		izqBut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				coche.gira(-10);
				vent.repaint();
			}
		});
		derBut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				coche.gira(10);		
				vent.repaint();
			}
		});
		
		JPanel pBotones = new JPanel();
		pBotones.add(aceleraBut);
		pBotones.add(frenaBut);
		pBotones.add(derBut);
		pBotones.add(izqBut);
		vent.add(pBotones, BorderLayout.SOUTH);
		vent.revalidate();
	}
	public static void main(String[] args) {	
		VentanaJuego ventana = new VentanaJuego("Pruebá");
		ventana.setVisible(true);
		Coche coche = new Coche(ventana);
		ventana.inicio(coche, ventana);
		MiHilo hilo = new MiHilo();
		hilo.empieza();
	}
		
	}
