package Coche;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class LabelCoche extends JLabel {
    private static final long serialVersionUID = 1L;
    protected Graphics2D graphics2d;


    public LabelCoche() {
    	try {   		
    		this.setIcon(new ImageIcon(LabelCoche.class.getResource("coche.png").toURI().toURL()));
    		
		} catch (Exception e) {
			System.out.print(e.getMessage());
			// TODO: handle exception
		}
        this.setBounds(0, 0, 10, 10);
    }



    protected void anadirFoto(Graphics graphics) {
        Image foto = ((ImageIcon) this.getIcon()).getImage();
        graphics2d = (Graphics2D) graphics;
        graphics2d.drawImage(foto, 0, 0, 10, 10, null); 

    }

	public void angulo(double miDireccionActual) {
		
		double angulo = Math.toRadians(miDireccionActual);
		graphics2d.rotate(angulo, 0, 0);
	}
    
  
}
