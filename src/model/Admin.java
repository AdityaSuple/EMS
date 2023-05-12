package model;

public class Admin extends Employee {

	private int allowance;

	public Admin(int id, String name, int salary, int allowance) {
		super(id, name, salary);
		this.allowance = allowance;
	}

	public int getAllowance() {
		return allowance;
	}

	public void setAllowance(int allowance) {
		this.allowance = allowance;
	}
	
	
}
