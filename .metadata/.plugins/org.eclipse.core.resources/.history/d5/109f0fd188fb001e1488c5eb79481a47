package entities;

import java.time.LocalDate;
import java.time.Period;

public class Reservation {

	private Integer roomNumber;
	private LocalDate checkin;
	private LocalDate checkout;
	
	public Reservation() {
		
	}

	public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) {
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getCheckout() {
		return checkout;
	}

	public void setCheckout(LocalDate checkout) {
		this.checkout = checkout;
	}

	public LocalDate getCheckin() {
		return checkin;
	}
	
	public Integer duration() {
		Period periodo = Period.between(checkin, checkout);
		int dias = periodo.getDays();
		return dias;
	}
	
	public String toString() {
		return "Reservation: Room " + roomNumber + ", check-in: " + checkin + ", check-out: " + checkout +
				", " + duration() + " nights";
	}
}
