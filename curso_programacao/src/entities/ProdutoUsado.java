package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto{

	private LocalDate manufactureDate;
	
	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return super.getName() + "(used) $ " + super.getPrice() + "(Manufacture date: " +  manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
}
