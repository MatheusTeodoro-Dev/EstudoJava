package entities;

public class OutsorcedEmployee extends Employee{

	protected Double additionalCharge;
	
	public OutsorcedEmployee() {
		super();
	}

	public OutsorcedEmployee(String name, Integer hours, Double valuePerHours, Double additionalCharge) {
		super(name, hours, valuePerHours);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Double payment() {
		return super.payment() + (1.1 * additionalCharge);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(" - $");
		sb.append(payment());
		return sb.toString();
	}
}
