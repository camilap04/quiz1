package modelo;

import processing.core.PApplet;

public class cuadro extends Figura{

	public cuadro(int posX, int posY, int dir, int val, int tam, PApplet app) {
		super(posX, posY, dir, val, tam, app);
	}
	
	public void pintar () {
	
	app.rectMode(PApplet. CENTER);
	app.textAlign( CENTER);
	app.fill (255);
	app.rect(posX, posY, tam, tam);
	app.fill(255,0,0);
	app.textSize(15);
	app.text(val, posX, posY );
	
	}

}
