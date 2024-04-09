package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o número de alturas a adicionar: ");
		int x = sc.nextInt();
		double [] vect = new double [x];
		
		for(int i = 0; i<x; i++) {
			System.out.print("Digite a altura: ");
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0;
		
		for(int i =0; i<x; i++) {
			soma += vect[i];
		}
		
		double avg = soma/x;
		
		System.out.println("AVERAGE: " + String.format("%.2f", avg));
		
		sc.close();

	}

}
