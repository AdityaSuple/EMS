package model;

public class SalesManager extends Employee {
	private int incentive;
	private int target;
	
	
	public SalesManager(int id, String name, int salary, int incentive, int target) {
		super(id, name, salary);
		this.incentive = incentive;
		this.target = target;
	}
	public int getIncentive() {
		return incentive;
	}
	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	
	

}
