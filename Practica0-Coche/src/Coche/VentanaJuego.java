package Coche;

import java.awt.BorderLayout;
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
		
		this.add(papel,BorderLayout.NORTH);
		this.add(panelBot,BorderLayout.SOUTH);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		

	}
	
	public static void main(String[] args) {
		VentanaJuego ventana = new VentanaJuego();
		ventana.setVisible(true);
		Coche coche = new Coche(10,10,5,5,"Poronga");
		System.out.println(coche);
		
		
		
	}
	
	
}
