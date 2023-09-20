package Coche;


public class Juego extends Coche{
	
	protected LabelCoche foto;
	
	public Juego() {
		super();
		foto = new LabelCoche();
		
	}
	
	public void setPosX(double posX) {
		this.posX = posX;
		foto.setBounds((int) posX, (int) this.posY, 100, 100);
		
	}
	
	public void setPosY(double posY) {
		this.posY = posY;
		foto.setBounds((int) this.posX, (int) posY, 100, 100);
		
	}

	public void reload() {
		foto.setBounds((int) this.posX, (int) this.posY, 100, 100);
	}
	
	public void setMiDireccionActual(double miDireccionActual) {
		this.miDireccionActual = miDireccionActual;
		foto.angulo(miDireccionActual);
	}


	
	
}
