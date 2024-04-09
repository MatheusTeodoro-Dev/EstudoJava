package utility;


public class CurrencyConverter {
	
	public static final double IOF = 6.0;
	
	public static double conversaoDolar(double dolar, double quantidade) {
		double aux = dolar * quantidade;
		aux += aux *IOF / 100 ;
		return aux;
	}
	
}
