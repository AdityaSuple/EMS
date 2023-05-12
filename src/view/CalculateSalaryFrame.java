package view;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

import controller.CalculateSalaryController;
import controller.MyWindowListener;

public class CalculateSalaryFrame extends Frame {

	   private TextField txtId;
	   private Label lbId;
	   private Button btSubmit;

	public CalculateSalaryFrame() { // constructor

		
		txtId = new TextField(20);
  	    lbId = new Label("Enter Id");
  	    btSubmit = new Button("Submit");
  	    this.add(lbId);	
  	    this.add(txtId);
  	    this.add(btSubmit);

		this.setBounds(200, 200, 350, 300);
		this.setResizable(false);
		this.setLayout(new FlowLayout());
		this.setVisible(true);

		MyWindowListener mw = new MyWindowListener(this);
		this.addWindowListener(mw); // registration process
		// ->frame.addWindowListner(WindowListner)

		CalculateSalaryController hc = new CalculateSalaryController(this);
		btSubmit.addActionListener(hc);
	}

	public TextField getTxtId() {
		return txtId;
	}

	public void setTxtId(TextField txtId) {
		this.txtId = txtId;
	}

	public Label getLbId() {
		return lbId;
	}

	public void setLbId(Label lbId) {
		this.lbId = lbId;
	}

	public Button getBtSubmit() {
		return btSubmit;
	}

	public void setBtSubmit(Button btSubmit) {
		this.btSubmit = btSubmit;
	}

	

 }

