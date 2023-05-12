package view;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

import controller.MyWindowListener;
import controller.AddSalesManagerController;

public class AddSalesManagerFrame extends Frame {
	private TextField txtId, txtName, txtSalary, txtIncentive, txtTarget;
	private Label lbId, lbName, lbSalary, lbIncentive, lbTarget;
	Button btSubmit;

	public AddSalesManagerFrame() { // constructor

		txtId = new TextField(20);
		txtName = new TextField(20);
		txtSalary = new TextField(20);
		txtIncentive = new TextField(20);
		txtTarget = new TextField(20);
		lbId = new Label("Enter the Id");
		lbName = new Label("Enter the Name");
		lbSalary = new Label("Enter the Salary");
		lbIncentive = new Label("Enter the Incentive");
		lbTarget = new Label("Enter the Target");
		btSubmit = new Button("Submit");

		this.add(lbId);
		this.add(txtId);
		this.add(lbName);
		this.add(txtName);
		this.add(lbSalary);
		this.add(txtSalary);
		this.add(lbIncentive);
		this.add(txtIncentive);
		this.add(lbTarget);
		this.add(txtTarget);
		this.add(btSubmit);

		this.setBounds(200, 200, 350, 300);
		this.setResizable(false);
		this.setLayout(new FlowLayout());
		this.setVisible(true);

		MyWindowListener mw = new MyWindowListener(this);
		this.addWindowListener(mw); // registration process
		// ->frame.addWindowListner(WindowListner)

		AddSalesManagerController hc = new AddSalesManagerController(this);
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

	public TextField getTxtIncentive() {
		return txtIncentive;
	}

	public void setTxtIncentive(TextField txtIncentive) {
		this.txtIncentive = txtIncentive;
	}

	public TextField getTxtTarget() {
		return txtTarget;
	}

	public void setTxtTarget(TextField txtTarget) {
		this.txtTarget = txtTarget;
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

	public Label getLbIncentive() {
		return lbIncentive;
	}

	public void setLbIncentive(Label lbIncentive) {
		this.lbIncentive = lbIncentive;
	}

	public Label getLbTarget() {
		return lbTarget;
	}

	public void setLbTarget(Label lbTarget) {
		this.lbTarget = lbTarget;
	}

	public Button getBtSubmit() {
		return btSubmit;
	}

	public void setBtSubmit(Button btSubmit) {
		this.btSubmit = btSubmit;
	}

}
