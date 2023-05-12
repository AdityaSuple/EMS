package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import db.DAO;
import model.HR;
import view.AddHRFrame;
import view.HomeFrame;

public class AddHRController implements ActionListener {

	private AddHRFrame hrf;

	public AddHRController(AddHRFrame hrFrame) {
		hrf = hrFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == hrf.getBtSubmit()) {
			int id = Integer.parseInt(hrf.getTxtId().getText());
			String name = hrf.getTxtName().getText();
			int salary = Integer.parseInt(hrf.getTxtSalary().getText());
			int commission = Integer.parseInt(hrf.getTxtCommission().getText());

			HR hr = new HR(id, name, salary, commission);
            
			DAO dao = new DAO();
			if (dao.addEmployee(hr)) {
				JOptionPane.showMessageDialog(hrf, "HR employee registration Successful");

			} else {
				System.out.println("Employee already exist");
				JOptionPane.showMessageDialog(hrf, "Employee already exist");
			}

			hrf.dispose();
			new HomeFrame();
		}
	}
}
