package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.EmployeeFrame;
import view.CalculateSalaryFrame;
import view.HomeFrame;

public class HomeController implements ActionListener {

	private HomeFrame hf;

	public HomeController(HomeFrame HomeFrame) {
		hf = HomeFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == hf.getBtAddEmployee()) {
			hf.dispose();
			new EmployeeFrame();
		} else if (e.getSource() == hf.getBtRemoveEmployee()) {
//			hf.dispose();
//			new LoginFrame();
		} else if (e.getSource() == hf.getBtUpdateEmployee()) {
//			hf.dispose();
//			new LoginFrame();
		} else if (e.getSource() == hf.getBtCalculateSalary()) {
			hf.dispose();
			new CalculateSalaryFrame();
		} else {
			hf.dispose();
			new HomeFrame();
		}

	}

}
