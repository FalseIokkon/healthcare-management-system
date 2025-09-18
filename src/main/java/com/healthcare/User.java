package com.healthcare;

public class User{
	private int id;
	private String username;
	private String password;
	private String role;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;

	public User(int id, String username, String password, String role, String firstName, String lastName, 
				String email, String phoneNumber){
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.role = role;
	} 

	public User(){
		this.id = 1;
		this.username = "jdoe01";
		this.password = "password";
		this.firstName = "John";
		this.lastName = "Doe";
		this.email = "john.doe@gmail.com";
		this.phoneNumber = "626-200-3000";
		this.role = "Blank";
	}

	//getters
	public int getId(){
		return id;
	}
	public String getUsername(){
		return username;
	}
	public String getPassword(){
		return password;
	}
	public String getRole(){
		return role;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public String getEmail(){
		return email;
	}
	public String getPhoneNumber(){
		return phoneNumber;
	}

	//setters
	public void setId(int id){
		this.id = id;
	}
	public void username(String username){
		this.username = username;
	}
	public void password(String password){
		this.password = password;
	}
	public void role(String role){
		this.role = role;
	}
	public void firstName(String firstName){
		this.firstName = firstName;
	}
	public void lastName(String lastName){
		this.lastName = lastName;
	}
	public void email(String email){
		this.email = email;
	}
	public void phoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

}