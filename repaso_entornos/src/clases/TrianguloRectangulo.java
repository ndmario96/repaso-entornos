package clases;

public class TrianguloRectangulo {
 int a; //Cateto1
 int b; //Cateto2
 int c; //Hipotenusa
 
 
 
 public TrianguloRectangulo () {
	 this.a = 1;
	 this.b = 1;
 }
 public TrianguloRectangulo(int a, int b) {
	 if (a <= 0 || b <= 0) {
		 throw new IllegalArgumentException ("El numero debe ser mayor o igual a 0");
	 }else {
		 this.a = a;
		 this.b = b;
	 }
 }
 
 public double area() {
	 return((a*b)/2.0);
 }
 
 public double hipotenusa() {
	 double raiz = ((a*a) + (b*b));
	 double hipotenusa = Math.sqrt(raiz);
	 return hipotenusa;
 }
 
 public double perimetro() {
	 return a + b + hipotenusa();
 }
 
 //Getters y Setters
 public int getA() {
	 return a;
 }
 
 public void setA(int a) {
	 this.a = a;
 }
 
 public int getB() {
	 return this.b;
 }
 
 public void setB(int b) {
	 this.b = b;
 }
 
 
 @Override
 public String toString() {
	 String mensaje = "";
	 
	 mensaje += "El cateto 1(a) es: " + this.a + "\n";
	 mensaje += "El cateto 2(b) es: " + this.b + "\n"; 
	 
	 return mensaje;
 }
}
