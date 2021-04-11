package modelo;

import processing.core.PApplet;

public class circulo extends Figura{

	public circulo(int posX, int posY, int dir, int val, int tam, PApplet app) {
		super(posX, posY, dir, val, tam, app);
	}
	
	public void pintar () {
		
	app.fill ((int)Math.random()*255+1,(int)Math.random()*255+1, (int)Math.random()*255+1 );
	app.ellipse(posX, posY, tam, tam);
	app.text(val, posX/2, posY/2);
	
	}

}