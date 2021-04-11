package vista;

import control.control;
import processing.core.PApplet;

public class main extends PApplet{
	public static void main(String[] args) {
		PApplet.main(main.class.getName());
	}
	
public control control;

	public void settings() {
		size (800, 600);
	}
	
	public void setup () {
		control = new control(this);
	}
	
	public void draw () {
		background(0);
		control.pintar();
	}
}
