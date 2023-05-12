package view;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

import controller.AddAdminController;
import controller.MyWindowListener;
import controller.AddSalesManagerController;

public class AddAdminFrame extends Frame {

	private TextField txtId, txtName, txtSalary, txtAllowance;
	private Label lbId, lbName, lbSalary, lbAllowance;
	private Button btSubmit;

	public AddAdminFrame() { // constructor

		txtId = new TextField(20);
		txtName = new TextField(20);
		txtSalary = new TextField(20);
		txtAllowance = new TextField(20);
		lbId = new Label("Enter the Id");
		lbName = new Label("Enter the Name");
		lbSalary = new Label("Enter the Salary");
		lbAllowance = new Label("Enter the Allowance");
		btSubmit = new Button("Submit");

		this.add(lbId);
		this.add(txtId);
		this.add(lbName);
		this.add(txtName);
		this.add(lbSalary);
		this.add(txtSalary);
		this.add(lbAllowance);
		this.add(txtAllowance);
		this.add(btSubmit);

		this.setBounds(200, 200, 350, 300);
		this.setResizable(false);
		this.setLayout(new FlowLayout());
		this.setVisible(true);

		MyWindowListener mw = new MyWindowListener(this);
		this.addWindowListener(mw); // registration process
		// ->frame.addWindowListner(WindowListner)

		AddAdminController hc = new AddAdminController(this);
		btSubmit.addActionListener(hc);
	}

	public TextField getTxtId() {
		return txtId;
	}

	public void setTxtId(TextField txtId) {
		this.txtId = txtId;
	}

	public TextField getTxtName() {
		return txtName;
	}

	public void setTxtName(TextField txtName) {
		this.txtName = txtName;
	}

	public TextField getTxtSalary() {
		return txtSalary;
	}

	public void setTxtSalary(TextField txtSalary) {
		this.txtSalary = txtSalary;
	}

	public TextField getTxtAllowance() {
		return txtAllowance;
	}

	public void setTxtAllowance(TextField txtAllowance) {
		this.txtAllowance = txtAllowance;
	}

	public Label getLbId() {
		return lbId;
	}

	public void setLbId(Label lbId) {
		this.lbId = lbId;
	}

	public Label getLbName() {
		return lbName;
	}

	public void setLbName(Label lbName) {
		this.lbName = lbName;
	}

	public Label getLbSalary() {
		return lbSalary;
	}

	public void setLbSalary(Label lbSalary) {
		this.lbSalary = lbSalary;
	}

	public Label getLbAllowance() {
		return lbAllowance;
	}

	public void setLbAllowance(Label lbAllowance) {
		this.lbAllowance = lbAllowance;
	}

	public Button getBtSubmit() {
		return btSubmit;
	}

	public void setBtSubmit(Button btSubmit) {
		this.btSubmit = btSubmit;
	}

}
