package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.AddAdminFrame;
import view.AddHRFrame;
import view.AddSalesManagerFrame;
import view.EmployeeFrame;

public class EmployeeController implements ActionListener {

	private EmployeeFrame ec;

	public EmployeeController(EmployeeFrame employeeFrame) {
		ec = employeeFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == ec.getBtAddAdmin()) {
			ec.dispose();
			new AddAdminFrame();
		} else if (e.getSource() == ec.getBtAddHR()) {
			ec.dispose();
			new AddHRFrame();
		} else if (e.getSource() == ec.getBtAddSalesManager()) {
			ec.dispose();
			new AddSalesManagerFrame();
		} else {
			ec.dispose();
			new EmployeeFrame();
		}

	}

}
