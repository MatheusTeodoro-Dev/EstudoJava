package aplication;

import java.util.Locale;
import java.util.Scanner;

public class DesafioPensionato {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.print("Digite quantos estudantes vão alugar um quarto: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		int [] numQuarto = new int [11];
		String [] nomeEstudante = new String [11];
		String [] email = new String[11];
		
		for(int i = 1;i<=n;i++) {
			System.out.println("Rent #" + i);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String mail = sc.nextLine();
			System.out.print("Room: ");
			int quarto = sc.nextInt();
			sc.nextLine();
			
			nomeEstudante[quarto] = name;
			email[quarto] = mail;
			numQuarto[quarto] = quarto;
		}
		
		System.out.println("Busy Rooms");
		
		for (int i = 1; i<=10; i++) {
			if(nomeEstudante[i] != null) {
				System.out.println(numQuarto[i] + ": " + nomeEstudante[i]+", " +email[i]);
					
			}
		}
		sc.close();
	}

}
