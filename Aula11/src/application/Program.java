package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dolar = sc.nextDouble();
		
		System.out.println("How mnay dollars will be bought? ");
		double price = sc.nextDouble();
		
		double r = CurrencyConverter.troca(dolar, price);
		
		
		
		
		System.out.printf("Amount to be paid inr eais = %.2f", r);
		
	}

}
