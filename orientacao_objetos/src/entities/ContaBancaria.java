package entities;

public class ContaBancaria {

	private final int NUMEROCONTA;
	private String titular;
	private double saldo;
	public final double TAXA = 5.00;
	
	public ContaBancaria(int numeroConta, String titular, double depositoInicial) {
		this.NUMEROCONTA = numeroConta;
		this.titular = titular;
		deposito(depositoInicial);
	}

	public ContaBancaria(int numeroConta, String titular) {
		this.NUMEROCONTA = numeroConta;
		this.titular = titular;
	}
	
	public void deposito (double valor) {
		saldo += valor;
	}
	
	public void sacar (double valor) {
		saldo -= valor + TAXA;
	}
	
	public String toString() {
		return "Titular: " + titular + " Conta: " + NUMEROCONTA 
				+ ", Saldo: " + String.format("%.2f", saldo); 
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNUMEROCONTA() {
		return NUMEROCONTA;
	}
	
}
