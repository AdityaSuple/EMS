package view;

import java.awt.*;

import controller.*;


public class EmployeeFrame extends Frame {

	Button btAddSalesManager, btAddAdmin, btAddHR;

	public EmployeeFrame() { // constructor

		btAddSalesManager = new Button("AddSalesManager");
		btAddAdmin = new Button("AddAdmin");
		btAddHR = new Button("AddHR");

		this.add(btAddSalesManager);
		this.add(btAddAdmin);
		this.add(btAddHR);

		this.setBounds(200, 200, 350, 300);
		this.setResizable(false);
		this.setLayout(new FlowLayout());
		this.setVisible(true);

		MyWindowListener mw = new MyWindowListener(this);
		this.addWindowListener(mw); // registration process
		// ->frame.addWindowListner(WindowListner)

		EmployeeController ec = new EmployeeController(this);
		btAddAdmin.addActionListener(ec);
		btAddSalesManager.addActionListener(ec);
		btAddHR.addActionListener(ec);
	}

	public Button getBtAddSalesManager() {
		return btAddSalesManager;
	}

	public void setBtAddSales(Button btAddSalesManager) {
		this.btAddSalesManager = btAddSalesManager;
	}

	public Button getBtAddAdmin() {
		return btAddAdmin;
	}

	public void setBtAddAdmin(Button btAddAdmin) {
		this.btAddAdmin = btAddAdmin;
	}

	public Button getBtAddHR() {
		return btAddHR;
	}

	public void setBtAddHR(Button btAddHR) {
		this.btAddHR = btAddHR;
	}

}
