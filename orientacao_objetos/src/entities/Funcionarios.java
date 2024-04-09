package entities;

public class Funcionarios {

	private int id;
	private String nome;
	private double salario;
	
	public Funcionarios(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public Funcionarios() {
		
	}
	public void aumentaSalario(double percentage) {
		salario += salario *percentage/100;
	}
	
	public int getID() {
		return id;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString () {
		return id +", " + nome + ", R$:" + salario; 
	}
}
