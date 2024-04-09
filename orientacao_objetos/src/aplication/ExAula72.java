package aplication;

import java.util.Locale;
import java.util.Scanner;

import utility.CurrencyConverter;

public class ExAula72 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		double dolar, quantidade, valoremReal;
		System.out.print("What is the dollar price? ");
		dolar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		quantidade = sc.nextDouble();
		valoremReal = CurrencyConverter.conversaoDolar(dolar, quantidade);
		
		System.out.println("Amount to be paid in reais = " + String.format("%.2f", valoremReal));
		sc.close();
	}

}
