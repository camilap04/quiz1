package modelo;

import processing.core.PApplet;

public abstract class Figura extends PApplet{

	protected int posX, posY, dir, val, tam;
		protected PApplet app;
		protected boolean noMovimiento;
		
		public Figura(int posX, int posY, int dir, int val, int tam, PApplet app) {
			
			this.posX = posX;
			this.posY = posY;
			this.dir = dir;
			this.val = val;
			this.tam = tam;
			this.app = app;
			noMovimiento = false;
			
		}
		
		public void movimiento () {
			validateInBorders();
			if (!noMovimiento ) {
			posX += dir *5;
			} else {
			
				posX += 0;
			}
		}
			
				protected void validateInBorders() {
					if(posX <= 0|| posX >= (800 - 0/2)) {
						this.dir *= -1;
					}
					if(posY <= 0 ||posY >= (600 - 0/2)) {
						this.dir *= -1;
					}		
				
		}
		
		public abstract void pintar ();
		
		
		
		
		
	}

