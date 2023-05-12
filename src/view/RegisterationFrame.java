package view;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

import controller.MyWindowListener;
import controller.RegistrationController;

public class RegisterationFrame extends Frame {

	private TextField RtxtUsername, RtxtPassword, RtxtCity;
	private Label RlbUsername, RlbPassword, RlbCity;
	private Button RbtNewUser, RbtClear, RbtSearchUser, RbtLogin;

	public RegisterationFrame() {

		this.RtxtUsername = new TextField(20);
		this.RtxtPassword = new TextField(20);
		this.RtxtCity = new TextField(20);

		this.RlbUsername = new Label("Enter the Username");
		this.RlbPassword = new Label("Enter the Password");
		this.RlbCity = new Label("Enter the city");
		this.RbtNewUser = new Button("NewUser");
		this.RbtClear = new Button("Clear");
		this.RbtSearchUser = new Button("SearchUser");
		this.RbtLogin = new Button("Login");

		this.add(RlbUsername);
		this.add(RtxtUsername);
		this.add(RlbPassword);
		this.add(RtxtPassword);
		this.add(RlbCity);
		this.add(RtxtCity);
		this.add(RbtNewUser);
		this.add(RbtClear);
		this.add(RbtSearchUser);
		this.add(RbtLogin);

		this.setResizable(false);
		this.setLayout(new FlowLayout());
		this.setVisible(true);

		this.setBounds(200, 200, 350, 300);
		RtxtPassword.setEchoChar('*');
		this.setTitle("Registration Page");

		MyWindowListener mw = new MyWindowListener(this);//->this represent frame(Registration Frame) 
//      (gui)frame.addWindowListener.this(registrationframe/Listner)
		this.addWindowListener(mw);   //-->coupling

		RegistrationController rc = new RegistrationController(this);
		RbtNewUser.addActionListener(rc);
		RbtClear.addActionListener(rc);
		RbtSearchUser.addActionListener(rc);
		RbtLogin.addActionListener(rc);
	}

	public TextField getRtxtUsername() {
		return RtxtUsername;
	}

	public void setRtxtUsername(TextField rtxtUsername) {
		RtxtUsername = rtxtUsername;
	}

	public TextField getRtxtPassword() {
		return RtxtPassword;
	}

	public void setRtxtPassword(TextField rtxtPassword) {
		RtxtPassword = rtxtPassword;
	}

	public TextField getRtxtCity() {
		return RtxtCity;
	}

	public void setRtxtCity(TextField rtxtCity) {
		RtxtCity = rtxtCity;
	}

	public Label getRlbUsername() {
		return RlbUsername;
	}

	public void setRlbUsername(Label rlbUsername) {
		RlbUsername = rlbUsername;
	}

	public Label getRlbPassword() {
		return RlbPassword;
	}

	public void setRlbPassword(Label rlbPassword) {
		RlbPassword = rlbPassword;
	}

	public Label getRlbCity() {
		return RlbCity;
	}

	public void setRlbCity(Label rlbCity) {
		RlbCity = rlbCity;
	}

	public Button getRbtNewUser() {
		return RbtNewUser;
	}

	public void setRbtNewUser(Button rbtNewUser) {
		RbtNewUser = rbtNewUser;
	}

	public Button getRbtClear() {
		return RbtClear;
	}

	public void setRbtClear(Button rbtClear) {
		RbtClear = rbtClear;
	}

	public Button getRbtSearchUser() {
		return RbtSearchUser;
	}

	public void setRbtSearchUser(Button rbtSearchUser) {
		RbtSearchUser = rbtSearchUser;
	}

	public Button getRbtLogin() {
		return RbtLogin;
	}

	public void setRbtLogin(Button rbtLogin) {
		RbtLogin = rbtLogin;
	}

}
