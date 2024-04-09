package entities;

public class ProdutoImportado extends Produto{

	private Double customsFee;
	
	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return super.getPrice() + customsFee;
	}
	
	@Override
	public String priceTag() {
		return super.getName() + " $ " + totalPrice() + "(Customs fee: $" + customsFee +")";
	}
}
