package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.TrianguloRectangulo;

class testTrianguloRectangulo {
	
	static TrianguloRectangulo tr;
	@BeforeAll
	static void setup() {
		tr = new TrianguloRectangulo();
		
	}
	@Test
	void testAreaDefecto() {	
		 
		 double areaObtenido = tr.area();
	     double areaEsperado = 0.5;
	     assertEquals(areaEsperado, areaObtenido);

	}

	@Test
	void testHipotenusaDefecto() {
		  double hipotenusaObtenido = tr.hipotenusa();
	      double hipotenusaEsperado = 1.4142;
	      assertEquals(hipotenusaEsperado, hipotenusaObtenido, 0.0001);

	}

	@Test
	void testPerimetroDefecto() {
		 double perimetroObtenido = tr.perimetro();
	     double perimetroEsperado = 3.4142;
	     assertEquals(perimetroEsperado, perimetroObtenido, 0.0001);
	}
	
	  @Test
	    void testArea() {
	        TrianguloRectangulo tr = new TrianguloRectangulo(2,3);
	        double areaObtenida = tr.area();
	        double areaEsperada = 3;
	        assertEquals(areaEsperada, areaObtenida, 0.0001);
	    }
	    @Test
	    void testHipotenusa() {
	        TrianguloRectangulo tr = new TrianguloRectangulo(2,3);
	        double hipotenusaObtenida = tr.hipotenusa();
	        double hipotenusaEsperada = 3.6055;
	        assertEquals(hipotenusaEsperada, hipotenusaObtenida, 0.0001);
	    }
	    @Test
	    void testPerimetro() {
	        TrianguloRectangulo tr = new TrianguloRectangulo(2,3);
	        double perimetroObtenida = tr.perimetro();
	        double perimetroEsperada = 8.6055;
	        assertEquals(perimetroEsperada, perimetroObtenida, 0.0001);
	    }

	    
	    @Test
	    void testExcepcion() {
	    	Exception excepcion = assertThrows(IllegalArgumentException.class, ()-> new TrianguloRectangulo(-1,0));
	    	String mensajeEsperado = "El numero debe ser mayor o igual a 0";
	    	
	    	String mensajeObtenido = excepcion.getMessage();
	    	assertEquals(mensajeEsperado, mensajeObtenido);
	    }

}
