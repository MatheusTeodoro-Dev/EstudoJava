package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		/*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		System.out.println("Enter client data: ");
		System.out.print("Name ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client cliente = new Client(name,email,birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order (new Date(), status, cliente);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for ( int i = 1; i<= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			
			Product product = new Product(productName, productPrice);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem ordemItem = new OrderItem (quantity ,productPrice, product);
			
			order.addItems(ordemItem);
		}
		
		System.out.println();
		System.out.println("Order Summary");
		System.out.println(order);
		
		
		
		sc.close(); */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order (new Date(),status, client);
		System.out.print("How many items to this order? ");
		int x = sc.nextInt();
		for (int i = 1; i<=x; i++) {
			System.out.println("Enter #" +i+" item data: ");
			System.out.print("Product name: ");
			sc.nextLine();
			String productname = sc.nextLine();
			System.out.print("Product price: ");
			double productprice = sc.nextDouble();
			
			Product product = new Product (productname, productprice);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem item = new OrderItem(quantity, productprice, product);
			
			order.addItem(item);
			
		}
		
		System.out.println();
		System.out.println(order);
		
		sc.close();
	}

}
