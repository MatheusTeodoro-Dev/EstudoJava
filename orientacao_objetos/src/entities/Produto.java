package entities;

public class Produto {

	private String nome;
	private double price;
	private int quantity;
	
	public Produto () {
	}
	
	public Produto (String nome, double price, int quantity) {
		this.nome = nome;
		this.price = price;
		this .quantity = quantity;
	}
	
	public Produto (String nome, double price) {
		this.nome = nome;
		this.price = price;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setName(String name) {
		this.nome = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double totalValueStock() {
		return quantity * price;
	}
	
	public void addProducts(int num) {
		quantity += num;
	}
	
	public void removeProducts (int num) {
		quantity -= num;
	}
	
	public String toString () {
		return  nome +", $ " + String.format("%.2f", price) + 
				", " + quantity +" units, Total: $ " + 
				String.format("%.2f", totalValueStock()) ;
	}
	
}
