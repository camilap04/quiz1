package modelo;

import processing.core.PApplet;

public class cuadro extends Figura{

	public cuadro(int posX, int posY, int dir, int val, int tam, PApplet app) {
		super(posX, posY, dir, val, tam, app);
	}
	
	public void pintar () {
		
	app.fill (255);
	app.rect(posX, posY, tam, tam);
	app.fill(255,0,0);
	app.text(val, posX+10, posY + 20);
	
	}

}
