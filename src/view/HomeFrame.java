package view;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

import controller.HomeController;
import controller.MyWindowListener;

public class HomeFrame extends Frame {

	Button btAddEmployee, btRemoveEmployee, btUpdateEmployee,btCalculateSalary;

	public HomeFrame() { // constructor

		btAddEmployee = new Button("Add New Employee");
		btRemoveEmployee = new Button("Remove Employee");
		btUpdateEmployee = new Button("Update Employee");
		btCalculateSalary = new Button("Calculate Salary");

		this.add(btAddEmployee);
		this.add(btRemoveEmployee);
		this.add(btUpdateEmployee);
		this.add(btCalculateSalary);

		this.setTitle("Home Page");
		this.setBounds(200, 200, 350, 300);
		this.setResizable(false);
		this.setLayout(new FlowLayout());
		this.setVisible(true);

		MyWindowListener mw = new MyWindowListener(this);
		this.addWindowListener(mw); // registration process
		// ->frame.addWindowListner(WindowListner)

		HomeController hc = new HomeController(this);
		btRemoveEmployee.addActionListener(hc);
		btAddEmployee.addActionListener(hc);
		btUpdateEmployee.addActionListener(hc);
		btCalculateSalary.addActionListener(hc);
	}

	public Button getBtAddEmployee() {
		return btAddEmployee;
	}

	public void setBtAddEmployee(Button btAddEmployee) {
		this.btAddEmployee = btAddEmployee;
	}

	public Button getBtRemoveEmployee() {
		return btRemoveEmployee;
	}

	public void setBtRemoveEmployee(Button btRemoveEmployee) {
		this.btRemoveEmployee = btRemoveEmployee;
	}

	public Button getBtUpdateEmployee() {
		return btUpdateEmployee;
	}

	public void setBtUpdateEmployee(Button btUpdateEmployee) {
		this.btUpdateEmployee = btUpdateEmployee;
	}

	public Button getBtCalculateSalary() {
		return btCalculateSalary;
	}

	public void setBtCalculateSalary(Button btCalculateSalary) {
		this.btCalculateSalary = btCalculateSalary;
	}

	
}
