package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import db.DAO;
import model.SalesManager;
import view.AddSalesManagerFrame;
import view.HomeFrame;

public class AddSalesManagerController implements ActionListener {

	private AddSalesManagerFrame smf;

	public AddSalesManagerController(AddSalesManagerFrame salesmanagerFrame) {
		smf = salesmanagerFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == smf.getBtSubmit()) {
			int id = Integer.parseInt(smf.getTxtId().getText());
			String name = smf.getTxtName().getText();
			int salary = Integer.parseInt(smf.getTxtSalary().getText());
			int incentive = Integer.parseInt(smf.getTxtIncentive().getText());
			int target = Integer.parseInt(smf.getTxtIncentive().getText());

			SalesManager sm = new SalesManager(id, name, salary, incentive, target);

			DAO dao = new DAO();
			if (dao.addEmployee(sm)) {
				JOptionPane.showMessageDialog(smf, "Sales manager employee registration Successful");

			} else {
				System.out.println("Employee already exist");
				JOptionPane.showMessageDialog(smf, "Employee already exist");
			}

			smf.dispose();
			new HomeFrame();
		}
    }
}