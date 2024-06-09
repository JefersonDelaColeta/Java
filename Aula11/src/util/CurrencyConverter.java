package util;

public class CurrencyConverter {
	
	public static final double IOF = 6;
	
	public static double troca(double dolar, double price) {
		double troca1 = (((dolar * price) *6)/100);
		return troca1 + (dolar*price);
	} 
	
}
