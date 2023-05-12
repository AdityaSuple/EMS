package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import db.DAO;
import model.Admin;
import view.AddAdminFrame;
import view.HomeFrame;

public class AddAdminController implements ActionListener {

	private AddAdminFrame af;

	public AddAdminController(AddAdminFrame adminFrame) {
		af = adminFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == af.getBtSubmit()) {
			int id = Integer.parseInt(af.getTxtId().getText());
			String name = af.getTxtName().getText();
			int salary = Integer.parseInt(af.getTxtSalary().getText());
			int allowance = Integer.parseInt(af.getTxtAllowance().getText());

			Admin admin = new Admin(id, name, salary, allowance);

			DAO dao = new DAO();
			if (dao.addEmployee(admin)) {
				JOptionPane.showMessageDialog(af, "Admin employee registration Successful");

			} else {
				System.out.println("Employee already exist");
				JOptionPane.showMessageDialog(af, "Employee already exist");
			}

			af.dispose();
			new HomeFrame();
		}

	}

}
