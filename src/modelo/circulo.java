package modelo;

import processing.core.PApplet;

public class circulo extends Figura{
	
	int r = (int) app.random(255);
	int g = (int) app.random (255);
	int b = (int) app.random(255);
	

	public circulo(int posX, int posY, int dir, int val, int tam, PApplet app) {
		super(posX, posY, dir, val, tam, app);
	}
	
	public void pintar () {
		
	app.fill (r, g, b,90);
	app.ellipse(posX, posY, tam, tam);
	app.text(val, posX/2, posY/2);
	
	}

}