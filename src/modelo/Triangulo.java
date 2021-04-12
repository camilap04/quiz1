package modelo;

import processing.core.PApplet;

	public class Triangulo extends Figura {

	int r = (int) app.random(255);
	
	int g = (int) app.random (255);
	
	int b = (int) app.random (255);
	
	
	public Triangulo (int posX, int posY, int dir, int val, int tam, PApplet app) {
		super(posX, posY, dir, val, tam, app);
	}
	
	public void pintar () {
		
	app.fill (r, g, b, 255);
	app.triangle (posX, posY-tam, posX-tam, posY+tam, posX+tam, posY+tam);
	app.fill(163,73,164);
	app.textSize(15);
	app.text(val, posX/2, posY/2);
	
	}

}