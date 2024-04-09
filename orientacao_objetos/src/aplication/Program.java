package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		Triangle y, x = new Triangle();
		y = new Triangle();
		System.out.print("Digite as medidas do triângulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.print("Digite as medidas do triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		System.out.println("O valor de P do triangulo é: " + x.calculoP());
		System.out.println("O valor da área do triangulo é: " + x.calculoArea());
		
		System.out.println("O valor de p do Triangulo Y é: " + y.calculoP());
		System.out.println("O valor da área do Triângulo Y é: " + y.calculoArea());
		
		sc.close();

	}

}
