package Coche;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VentanaJuego extends JFrame{	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected JPanel papel;
	protected JPanel panelBot;
	protected JButton botonAcelera;
	protected JButton botonFrena;
	protected JButton GiraIzq;
	protected JButton GiraDrcha;	
	protected Juego coche;
	
	public VentanaJuego() {
		this.setLayout(new BorderLayout());
		this.setSize(700,500);
		papel = new JPanel();
		panelBot = new JPanel();
		botonAcelera = new JButton("Acelera");
		botonFrena = new JButton("Frena");
		GiraIzq = new JButton("Gira IZQ.");
		GiraDrcha = new JButton("Gira DER.");
		
		panelBot.add(botonAcelera);
		panelBot.add(botonFrena);
		panelBot.add(GiraDrcha);
		panelBot.add(GiraIzq);	
		//Crear coche
		coche = new Juego();
		
		coche.setPosX(150);
		coche.setPosY(100);
		
		System.out.println(coche.toString());
		
		
		papel.add(coche.foto);
		
		this.add(papel,BorderLayout.NORTH);
		this.add(panelBot,BorderLayout.SOUTH);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
		
		botonAcelera.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				coche.acelera(-5);
			}
		});
		
		botonFrena.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				coche.acelera(-5);
				System.out.println(coche.toString());
			}
		});
		GiraIzq.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				coche.gira(10);
				System.out.println(coche.toString());
			}
		});
		GiraDrcha.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				coche.gira(-10);
				System.out.println(coche.toString());			
			}
		});
	}
	
	public static void main(String[] args) {
		VentanaJuego ventana = new VentanaJuego();
		ventana.setVisible(true);
		Coche coche = new Coche(5,5,5,5,"ElNano");
		System.out.println(coche);
		
	}
}
