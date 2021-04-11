package control;

import modelo.Principal;
import processing.core.PApplet;

public class control {
	
	private Principal logica; 
	
	private PApplet app;

	public control(PApplet app) {
		
		this.app = app;
		logica= new Principal(app);
	} 
	
	


}
