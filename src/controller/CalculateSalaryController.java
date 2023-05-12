package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import db.DAO;
import model.Admin;
import model.Employee;
import model.HR;
import model.SalesManager;
import view.CalculateSalaryFrame;
import view.HomeFrame;


public class CalculateSalaryController implements ActionListener {

	private CalculateSalaryFrame csf;

	public CalculateSalaryController(CalculateSalaryFrame calculateSalaryFrame) {
		csf =calculateSalaryFrame ;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == csf.getBtSubmit()) {
			int id = Integer.parseInt(csf.getTxtId().getText());
			
			DAO dao = new DAO();
			dao.searchEmployee(id);
			Employee e1 = dao.searchEmployee(id);
			if (e1 != null) {
				int salary = allEmployeeDetails(e1);
				JOptionPane.showMessageDialog(csf, "Employee salary is " + salary);

			} else {
			    System.out.println("Employee does not exist");
				JOptionPane.showMessageDialog(csf, "Employee does not exist");
			}

			csf.dispose();
			new HomeFrame();
		}
	}

	int allEmployeeDetails(Employee e1) {
		if (e1 instanceof HR) {
			HR hr = (HR) e1;
			int calsal=  hr.getSalary() + hr.getCommission();
			System.out.println("Commission is: " + hr.getCommission());
			System.out.println("Salary is: " + calsal);
			return calsal;
		}
		if (e1 instanceof Admin) {
			Admin admin = (Admin) e1;
			int calsal= admin.getSalary() + admin.getAllowance();
			System.out.println("Allowance is: " + admin.getAllowance());
			System.out.println("Salary is: " + calsal);
			return calsal;
		}
		if (e1 instanceof SalesManager) {
			SalesManager salsesmanager = (SalesManager) e1;
			int calsal = salsesmanager.getSalary()+ salsesmanager.getIncentive();
			System.out.println("Incentive is: " + salsesmanager.getIncentive());
			System.out.println("Target is: " + salsesmanager.getTarget());
			System.out.println("Salary is: " + calsal);
			return calsal;
		}
		return 0;
	}
}
