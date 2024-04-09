package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	public double calculoP () {
		double aux;
		aux = (a + b + c)/2;
				
		return aux;
	}
	
	public double calculoArea() {
		double aux, p = calculoP();
		aux = Math.sqrt(p * ((p - a)*(p - b)*(p - c)));
		return aux;
	}
}
