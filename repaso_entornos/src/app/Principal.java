package app;

import clases.TrianguloRectangulo;

public class Principal {

	public static void main(String[] args) {
	
		TrianguloRectangulo t1 = new TrianguloRectangulo (0 + (int)(Math.random()*10 - 0 + 1),0 + (int)(Math.random()*10 - 0 + 1));
		
		TrianguloRectangulo t2 = new TrianguloRectangulo();
		
		t1.area();
		t1.perimetro();
		
		t2.area();
		t2.perimetro();

	}

}
