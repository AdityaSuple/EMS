package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import db.DAO;
import model.User;
import view.SearchUserFrame;

public class SearchController implements ActionListener {
	private SearchUserFrame rf;

	public SearchController(SearchUserFrame searchUserFrame) {
		rf = searchUserFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == rf.getRbtClear()) {
			System.out.println("search user Clear");
			rf.getRtxtUsername().setText("");
			rf.getRtxtUserId().setText("");
		} else if (e.getSource() == rf.getRbtSearchUser()) {
			System.out.println("search user search");
			User user = new User();
			user.setUsername(rf.getRtxtUsername().getText());
			user.setUserid(rf.getRtxtUserId().getText());
			DAO dao = new DAO();
			user = dao.search(user);
			System.out.println(user);
			if (user!=null) {
				String userFound = "User found " + user;
				JOptionPane.showMessageDialog(rf, userFound);
			} else {
				JOptionPane.showMessageDialog(rf, "User not found");
			}
		}
	}
}
