import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Aula162 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Produto> list = new ArrayList<>();
		
		System.out.print("Enter number of products: ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 1; i<=n; i++) {
			System.out.print("Product #" + i + " data:");
			System.out.print("\nCommon, used or imported (c/u/i)? ");
			String x = sc.next();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			Double price = sc.nextDouble();

			if (x.equalsIgnoreCase("i")) {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				sc.nextLine();
				list.add(new ProdutoImportado(name,price,customsFee));				
			} else if (x.equalsIgnoreCase("u")) {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new ProdutoUsado(name,price,manufactureDate));
			} else {
				list.add(new Produto(name,price));
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Produto prod : list) {
			System.out.println(prod.priceTag());
		}
		sc.close();
	}

}
