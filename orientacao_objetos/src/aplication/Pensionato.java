package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Rent[] rooms = new Rent[10];
		System.out.print("Quantos quartos vão ser alugados: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i+1));
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.println("Email: ");
			String mail = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			
			rooms[room] = new Rent(name, mail);
		}
		
		System.out.println("Busy Roms: ");
		for(int i = 0; i<rooms.length; i++) {
			if(rooms[i]!= null) {
				System.out.printf("\n%d: %s", i, rooms[i].toString());
			}
		}
		
		sc.close();
	}

}
