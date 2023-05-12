package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import db.DAO;
import model.User;
import view.LoginFrame;
import view.RegisterationFrame;
import view.SearchUserFrame;

public class RegistrationController implements ActionListener {
	
	RegisterationFrame rf;

	public RegistrationController(RegisterationFrame registrationFrame) {
		rf = registrationFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == rf.getRbtNewUser())
		{
			String uname = rf.getRtxtUsername().getText();
			String pass = rf.getRtxtPassword().getText();
			String city = rf.getRtxtCity().getText();

			//Encapsulate
			User user = new User();
			user.setUsername(uname);
			user.setPassword(pass);
			user.setCity(city);

			DAO dao = new DAO();
			if (dao.register(user))
			{
				JOptionPane.showMessageDialog(rf, "Registeration Successful");
				rf.dispose();
				new LoginFrame();
			} 
			else 
			{
				System.out.println("Registration Failed");
			}

		} 
		else if (e.getSource() == rf.getRbtClear()) 
		{
			// System.out.println("Clear");
			rf.getRtxtUsername().setText("");
			rf.getRtxtPassword().setText("");
			rf.getRtxtCity().setText("");
		} 
		else if (e.getSource() == rf.getRbtSearchUser()) 
		{
//			System.out.println("Test action search");
			rf.dispose();
			new SearchUserFrame();
		} 
		else if (e.getSource() == rf.getRbtLogin()) 
		{
//		System.out.println("Test action login");
			rf.dispose();
			new LoginFrame();
		}
	}
}
