package entities;

public class ContribuinteJuridico extends Contribuinte{

	private Integer totalFuncionarios;
	
	public ContribuinteJuridico() {
		super();
	}
	
	public ContribuinteJuridico(String nome, Double rendaAnual, Integer totalFuncionarios) {
		super(nome, rendaAnual);
		this.totalFuncionarios = totalFuncionarios;
	}
	
	public Integer getTotalFuncionarios() {
		return totalFuncionarios;
	}

	public void setTotalFuncionarios(Integer totalFuncionarios) {
		this.totalFuncionarios = totalFuncionarios;
	}

	@Override
	public double calculoImposto() {
		double totalImposto;
		if (totalFuncionarios < 10) {
			totalImposto = super.getRendaAnual()* 0.16;
		}
		else {
			totalImposto = super.getRendaAnual() * 0.14;
		}
		return totalImposto;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getNome());
		sb.append(" : $");
		sb.append(String.format("%.2f", calculoImposto()));
		return sb.toString();
	}
}