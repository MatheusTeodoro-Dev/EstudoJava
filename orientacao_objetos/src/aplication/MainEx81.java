package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class MainEx81 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o número da conta: ");
		int num = sc.nextInt();
		System.out.print("Digite o nome do titular da conta: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Deseja realizar um depósito inicial? (s/n): ");
		String opcao = sc.next();
		ContaBancaria c1;
		
		if (opcao.equalsIgnoreCase("s")) {
			System.out.print("Digite o valor do deposito: ");
			double deposito = sc.nextDouble();
			c1 = new ContaBancaria(num, nome, deposito);
		} else	{
			c1 = new ContaBancaria(num, nome);
		}
		System.out.println("Account data:");
		System.out.println(c1);
		System.out.print("Enter a deposit value: ");
		c1.deposito(sc.nextDouble());
		System.out.println("Updated Account Data: ");
		System.out.println(c1);
		System.out.print("Enter a withdraw value: ");
		c1.sacar(sc.nextDouble());
		System.out.println(c1);
		
		sc.close();
	}

}
