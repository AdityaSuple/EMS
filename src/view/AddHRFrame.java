package view;

import java.awt.*;
import java.awt.event.*;

import controller.*;
import controller.MyWindowListener;

public class AddHRFrame extends Frame {
	
	   private TextField txtId, txtName, txtSalary,txtCommission;
	   private Label lbId, lbName, lbSalary,lbCommission;
	   Button btSubmit;
	  
      public AddHRFrame() {                //constructor
		 	  
    	 
    	  txtId = new TextField(20);
    	  txtName = new TextField(20);
    	  txtSalary = new TextField(20);
    	  txtCommission = new TextField(20);
    	  lbId = new Label("Enter the Id");
    	  lbName =  new Label("Enter the Name");
    	  lbSalary =  new Label("Enter the Salary");
    	  lbCommission =  new Label("Enter the Commission");
    	  btSubmit = new Button("Submit");
    	 
    	  this.add(lbId);	
    	  this.add(txtId);
    	  this.add(lbName);
    	  this.add(txtName);
    	  this.add(lbSalary);
    	  this.add(txtSalary);
    	  this.add(lbCommission);
    	  this.add(txtCommission);
    	  this.add(btSubmit);
       
    	  this.setBounds(200, 200, 350, 300);
          this.setResizable(false);
    	  this.setLayout(new FlowLayout());
    	  this.setVisible(true);
    	  
        MyWindowListener mw = new MyWindowListener(this);
    	  this.addWindowListener(mw);       //registration process
      //->frame.addWindowListner(WindowListner)
    	  
    	  AddHRController hc = new AddHRController(this);
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

	public TextField getTxtCommission() {
		return txtCommission;
	}

	public void setTxtCommission(TextField txtCommission) {
		this.txtCommission = txtCommission;
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

	public Label getLbCommission() {
		return lbCommission;
	}

	public void setLbCommission(Label lbCommission) {
		this.lbCommission = lbCommission;
	}

	public Button getBtSubmit() {
		return btSubmit;
	}

	public void setBtSubmit(Button btSubmit) {
		this.btSubmit = btSubmit;
	}

	
}


