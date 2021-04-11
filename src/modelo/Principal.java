package modelo;

import processing.core.PApplet;

public class Principal extends PApplet{

	private String[] texto;

	private PApplet app;

	public Principal(PApplet app) {

		this.app = app;
		texto= app.loadStrings("../data/datos.txt");
		leerTEXTO();
	}

	public void leerTEXTO() {

		for (int i = 0; i < texto.length; i++) {

			String[] figuras = texto[i].split(" ");
			System.out.println(figuras[1]);

		}	
	}






}


