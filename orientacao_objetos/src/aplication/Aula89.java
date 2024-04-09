package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Aula89 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número: ");
		int n = sc.nextInt();
		Produto [] vect = new Produto [n];
		
		for(int i = 0; i<vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite o nome: ");
			String name = sc.nextLine();
			System.out.print("Digite o preço: ");
			double preco = sc.nextDouble();
			vect[i] = new Produto(name, preco);
		}
		
		double soma = 0;
		
		for(int i = 0; i<vect.length; i++) {
			soma += vect[i].getPrice();
		}
		
		double media = soma / vect.length;
		
		System.out.println("Média é: " + String.format("%.2f", media));
		
		sc.close();
	}

}
