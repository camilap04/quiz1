package modelo;

import processing.core.PApplet;

public class Figura extends PApplet{

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
			if (!noMovimiento) {
			posX += dir;
			} else {
				posX += 0;
			}
		}
		
		
		
		
		
	}

