package aplication;

import java.util.Scanner;

import entities.Produto;

public class MainAula66 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
	
		System.out.println("Enter Product Data: ");
		System.out.print("Name: ");
		String nome = sc.next();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		Produto p1 = new Produto();
		p1.setName(nome);
		p1.setPrice(price);
		
		System.out.println("Product data: " + p1);
		System.out.print("\n Enter the number of products to be added in  stock: ");
		p1.addProducts(sc.nextInt());
		System.out.println("\nUpdated data: " + p1);
		System.out.print("\nEnter the number of products to be removed in stock: ");
		p1.removeProducts(sc.nextInt());
		System.out.println("\nUpdated data: " + p1);
		sc.close();

	}

}
