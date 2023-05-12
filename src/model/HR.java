package model;

public class HR extends Employee {

	private int commission;

	public HR(int id, String name, int salary, int commission) {
		super(id, name, salary);
		this.commission = commission;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}
	
	
}
