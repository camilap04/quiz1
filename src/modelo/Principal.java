package modelo;

import java.util.ArrayList;

import processing.core.PApplet;

public class Principal extends PApplet{

	private String[] texto;
private ArrayList<Figura> figs;
	private PApplet app;

	public Principal(PApplet app) {

		this.app = app;
		texto= app.loadStrings("../data/datos.txt");
		figs = new ArrayList<Figura>();
		leerTEXTO();
	}

	public void leerTEXTO() {

		for (int i = 0; i < texto.length; i++) {
			System.out.println(texto.length);

			String[] figuras = texto[i].split(" ");
			
			for (int j = 0; j < figuras.length; j++) {
				if (figuras[j].equals("Cuadrado")) {
					int posX= Integer.parseInt(figuras[j+2]);
					int posY= Integer.parseInt(figuras[j+3]);
					int dir= Integer.parseInt(figuras[j+4]);
					int val= Integer.parseInt(figuras[j+5]);
					int tam= Integer.parseInt(figuras[j+1]);
					cuadro c = new cuadro(posX,posY,dir,val,tam,this.app);
					figs.add(c);
				}
					
					else if (figuras[j].equals("Circulo")) {
						int posX= Integer.parseInt(figuras[j+2]);
						int posY= Integer.parseInt(figuras[j+3]);
						int dir= Integer.parseInt(figuras[j+4]);
						int val= Integer.parseInt(figuras[j+5]);
						int tam= Integer.parseInt(figuras[j+1]);
						circulo c = new circulo(posX,posY,dir,val,tam,this.app);
						figs.add(c);	
						
					
				
					
					
				}
			}
			

		}	
	}
	public void pintar() {
		for (int i = 0; i < figs.size(); i++) {
			figs.get(i).pintar();
			figs.get(i).movimiento();
		}
	}
	

}


