public class Patient{
	private int patientId;
	private String firstName;
	private String lastName;
	private String dob;
	private String insurance;
	private String address;
	private int zip;

	//constructor
	public Patient(int patientId, String firstName, String lastName, String dob,
				   String insurance, String address, int zip){
		this.patientId = patientId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.insurance = insurance;
		this.address = address;
		this.zip = zip;
	}

	//getters
	public int getPatientId(){
		return patientId;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public String getDob(){
		return dob;
	}
	public String getInsurance(){
		return insurance;
	}
	public String getAddress(){
		return address;
	}
	public int getZip(){
		return zip;
	}

	//setters
	public void setPatientId(int patientId){
		this.patientId = patientId;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public void setDob(String dob){
		this.dob = dob;
	}
	public void setInsurance(String insurance){
		this.insurance = insurance;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public void setZip(int zip){
		this.zip = zip;
	}
}