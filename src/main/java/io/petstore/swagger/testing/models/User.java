package io.petstore.swagger.testing.models;

public class User {
	
	String id, userName, firstName, lastName, email, password, phone, userStatus;

	public User(String id, String userName, String firstName, String lastName, String email, String password,
			String phone, String userStatus) {
		super();
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.userStatus = userStatus;
	}

	public String getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getPhone() {
		return phone;
	}

	public String getUserStatus() {
		return userStatus;
	}
	
}
