package entities;

public class ContribuinteFisico extends Contribuinte{

	private double gastoSaude;
	
	public ContribuinteFisico () {
		super();
	}
	
	public ContribuinteFisico(String nome, Double rendaAnual, double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double calculoImposto() {
		double totalImposto;
		if(gastoSaude !=0) {
			if(super.getRendaAnual() < 20000.0) {
				totalImposto = super.getRendaAnual() * 0.15 - (gastoSaude * 0.5);
			} else {
				totalImposto = super.getRendaAnual() * 0.25 - (gastoSaude * 0.5); 
			}
		} else {
			if (super.getRendaAnual() < 20000.0) {
				totalImposto = super.getRendaAnual() * 0.15;
			} else {
				totalImposto = super.getRendaAnual() * 0.25;
			}
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
