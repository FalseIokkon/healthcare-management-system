public class User{
	private int id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String role;

	public User(int id, String username, String password, String firstName, String lastName, 
				String email, String phoneNumber, String role){
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

	public int getId(){
		return id;
	}
	public String getUsername(){
		return username;
	}
	public String getPassword(){
		return password;
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
	public String getRole(){
		return role;
	}
}