package view;

import java.awt.*;

import controller.MyWindowListener;
import controller.SearchController;

public class SearchUserFrame extends Frame {

	private TextField RtxtUsername, RtxtUserId;
	private Label RlbUsername, RlbUserId;
	private Button RbtClear, RbtSearchUser;

	public SearchUserFrame() {

		this.RtxtUsername = new TextField(20);
		this.RtxtUserId = new TextField(20);

		this.RlbUsername = new Label("Enter the Username");
		this.RlbUserId = new Label("Enter the User ID");
		this.RbtClear = new Button("Clear");
		this.RbtSearchUser = new Button("SearchUser");

		this.add(RlbUsername);
		this.add(RtxtUsername);
		this.add(RlbUserId);
		this.add(RtxtUserId);
		this.add(RbtSearchUser);
		this.add(RbtClear);

		this.setResizable(false);
		this.setLayout(new FlowLayout());
		this.setVisible(true);

		this.setBounds(200, 200, 350, 300);
		this.setTitle("Search User Page");

		MyWindowListener mw = new MyWindowListener(this);
		this.addWindowListener(mw);

		SearchController rc = new SearchController(this);
		RbtClear.addActionListener(rc);
		RbtSearchUser.addActionListener(rc);
	}

	public TextField getRtxtUsername() {
		return RtxtUsername;
	}

	public void setRtxtUsername(TextField rtxtUsername) {
		RtxtUsername = rtxtUsername;
	}

	public TextField getRtxtUserId() {
		return RtxtUserId;
	}

	public void setRtxtUserId(TextField rtxtUserId) {
		RtxtUserId = rtxtUserId;
	}

	public Label getRlbUsername() {
		return RlbUsername;
	}

	public void setRlbUsername(Label rlbUsername) {
		RlbUsername = rlbUsername;
	}

	public Label getRlbUserId() {
		return RlbUserId;
	}

	public void setRlbUserId(Label rlbUserId) {
		RlbUserId = rlbUserId;
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

}
