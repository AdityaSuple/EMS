package view;

import java.awt.*;
import java.awt.event.*;

import controller.*;
import controller.MyWindowListener;

public class LoginFrame extends Frame {
	
	  private TextField txtUsername,txtPassword;
	  private Label lbUsername,lbPassword;
	  private Button btNewUser,btLogin,btClear;
	  
      public LoginFrame() {                //constructor
		 	  
    	  txtUsername = new TextField(20);
    	  txtPassword = new TextField(20);
    	  lbUsername = new Label("Enter the UserName");
    	  lbPassword =  new Label("Enter the Password");
    	  btNewUser = new Button("NewUser");
    	  btLogin = new Button("Login");
    	  btClear = new Button("Clear");
    	  this.add(lbUsername);	
    	  this.add(txtUsername);
    	  this.add(lbPassword);
    	  this.add(txtPassword);
    	  this.add(btNewUser);
    	  this.add(btLogin);
    	  this.add(btClear);
    	  
    	  this.setTitle("Login Page");
          txtPassword.setEchoChar('*');
    	  this.setBounds(200, 200, 350, 300);
          this.setResizable(false);
    	  this.setLayout(new FlowLayout());
    	  this.setVisible(true);
    	  
          MyWindowListener mw = new MyWindowListener(this);
    	  this.addWindowListener(mw);       //registration process
      //->frame.addWindowListner(WindowListner)
    	  
    	  LoginController lc = new LoginController(this);
    	  btLogin.addActionListener(lc);
    	  btNewUser.addActionListener(lc);
    	  btClear.addActionListener(lc);
	}

	public TextField getTxtUsername() {
		return txtUsername;
	}

	public void setTxtUsername(TextField txtUsername) {
		this.txtUsername = txtUsername;
	}

	public TextField getTxtPassword() {
		return txtPassword;
	}

	public void setTxtPassword(TextField txtPassword) {
		this.txtPassword = txtPassword;
	}

	public Label getLbUsername() {
		return lbUsername;
	}

	public void setLbUsername(Label lbUsername) {
		this.lbUsername = lbUsername;
	}

	public Label getLbPassword() {
		return lbPassword;
	}

	public void setLbPassword(Label lbPassword) {
		this.lbPassword = lbPassword;
	}

	public Button getBtNewUser() {
		return btNewUser;
	}

	public void setBtNewUser(Button btNewUser) {
		this.btNewUser = btNewUser;
	}

	public Button getBtLogin() {
		return btLogin;
	}

	public void setBtLogin(Button btLogin) {
		this.btLogin = btLogin;
	}

	public Button getBtClear() {
		return btClear;
	}

	public void setBtClear(Button btClear) {
		this.btClear = btClear;
	}

	
}


