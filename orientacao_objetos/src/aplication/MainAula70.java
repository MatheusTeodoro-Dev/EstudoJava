package aplication;

import java.util.Locale;
import java.util.Scanner;
import utility.Calculator;

public class MainAula70 {

			
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double radius, c, v;
		System.out.print("Enter radius: ");
		radius = sc.nextDouble();
		
		c = Calculator.circumference(radius);
		System.out.println("Circumference: " + String.format("%.2f", c));
		
		v = Calculator.volume(radius); 
		System.out.println("Volum: " + String.format("%.2f", v));
		
		System.out.printf("PI: %.2f" , Calculator.PI);
		
		sc.close();
	}

	
}
