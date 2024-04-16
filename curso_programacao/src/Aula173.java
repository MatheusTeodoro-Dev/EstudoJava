import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Reservation;

public class Aula173 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate datainicio = LocalDate.parse("23-09-2019", formatter);
		LocalDate dataFim = LocalDate.parse("26-09-2019", formatter);
		Reservation r1 = new Reservation(8021, datainicio, dataFim);
		
		System.out.println(r1);
		
		sc.close();
	}

}
