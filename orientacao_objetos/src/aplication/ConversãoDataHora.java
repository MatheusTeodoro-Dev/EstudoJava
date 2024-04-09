package aplication;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConversãoDataHora {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T16:17:30");
		Instant d06 = Instant.parse("2022-07-20T16:17:30Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		
		System.out.println(d04.format(fmt1));
		System.out.println(fmt1.format(d04));
		
		System.out.println(d05.format(fmt1));
		System.out.println(d05.format(fmt2));
		
		System.out.println(fmt3.format(d06));
		System.out.println(fmt4.format(d06));
		

	}

}
