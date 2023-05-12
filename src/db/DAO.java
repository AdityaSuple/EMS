 package db;

import java.util.*;
import model.Employee;
import model.User;

public class DAO {

	static List<User> userList;
	static List<Employee> employeeList;
//	static int index;

	static {
		userList = new ArrayList<>();
		employeeList = new ArrayList<>();
		User temp = new User();
		temp.setUsername("123");
		temp.setCity("Nagpur");
		temp.setUserid("1");
		temp.setPassword("123");

		userList.add(temp);
//		index = 0; 
	}

	public boolean register(User u1) {
		userList.add(u1);
		return true;
	}

	public User validate(User u1) {

		for (int i = 0; i < userList.size(); i++) {
			User dbuser = userList.get(i);
			if (dbuser.getUsername().equals(u1.getUsername()) && dbuser.getPassword().equals(u1.getPassword())) {
				u1.setCity(dbuser.getCity());
				return u1;
			}
		}
		return null;
	}

	public User search(User user) {

		if (user.getUserid() != null){
			for (int i = 0; i < userList.size(); i++){
				User dbuser = userList.get(i);
				if (dbuser.getUserid().equals(user.getUserid())) {
					return dbuser;
				}
			}
		} 
		else {
			if (user.getUsername() != null){
				for (int i = 0; i < userList.size(); i++) {
					User dbuser = userList.get(i);
					if (dbuser.getUsername().equals(user.getUsername())) {
						return dbuser;
					}
				}
			}
		}
		return null;
	}

	public boolean addEmployee(Employee employee) {
		Employee dbEmployee = searchEmployee(employee.getId());
		if (dbEmployee != null) {
			return false;
		}
		employeeList.add(employee);
		    return true;
	}

	public Employee searchEmployee(int id) {
		for (int i = 0; i < employeeList.size(); i++){
			Employee dbEmployee = employeeList.get(i);
			if (dbEmployee.getId() == id) {
				return dbEmployee;
			}
		}
		return null;
	}
}
