import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.ContribuinteFisico;
import entities.ContribuinteJuridico;

public class ExClasseAbstrata {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> list = new ArrayList<>();
		System.out.print("Enter number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company(c/i): ");
			String pessoa = sc.next();
			System.out.print("Name: ");
			String nome = sc.next();
			System.out.print("Anual income: ");
			Double renda = sc.nextDouble();
			if(pessoa.equalsIgnoreCase("c")) {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new ContribuinteJuridico(nome,renda,employees));
			}else {
				System.out.print("Health expenditures: ");
				double gastoSaude = sc.nextDouble();
				list.add(new ContribuinteFisico(nome,renda,gastoSaude));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		for (Contribuinte pessoa : list) {
			System.out.println(pessoa);
		}
		double totalTaxas = 0;
		for (Contribuinte pessoa : list) {
			totalTaxas += pessoa.calculoImposto();
		}
		
		System.out.println("TOTAL TAXES : " + String.format("%.2f", totalTaxas));
		sc.close();
	}

}
