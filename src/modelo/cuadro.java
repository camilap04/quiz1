package modelo;

import processing.core.PApplet;

public class cuadro extends Figura{

	public cuadro(int posX, int posY, int dir, int val, int tam, PApplet app) {
		super(posX, posY, dir, val, tam, app);
	}
	
	public void pintarCuadro () {
		
	app.fill ((int)Math.random()*255+1,(int)Math.random()*255+1, (int)Math.random()*255+1 );
	app.rect(posX, posY, tam, tam);
	app.text(val, posX/2, posY/2);
	
	}

}
