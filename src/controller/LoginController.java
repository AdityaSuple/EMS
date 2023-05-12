package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import db.DAO;
import model.User;
import view.HomeFrame;
import view.LoginFrame;
import view.RegisterationFrame;

public class LoginController implements ActionListener {

	LoginFrame lf;

	public LoginController(LoginFrame loginFrame) {
		lf = loginFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == lf.getBtNewUser()) {
			lf.dispose();
			new RegisterationFrame();
		} else if (e.getSource() == lf.getBtClear()) {
			// clear text Boxes

		} else if (e.getSource() == lf.getBtLogin()) {
			User user = new User();
			user.setUsername(lf.getTxtUsername().getText());
			user.setPassword(lf.getTxtPassword().getText());

			DAO dao = new DAO();
			user = dao.validate(user);

			if (user != null) {
				// new WelcomeFrame();
				JOptionPane.showMessageDialog(lf, "Login Successful");
				lf.dispose();
				new HomeFrame();
			} else {
				JOptionPane.showMessageDialog(lf, "Invalid Login");
			}
		}

	}

}
