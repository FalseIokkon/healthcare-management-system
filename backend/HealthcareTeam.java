import java.util.ArrayList;

public class HealthcareTeam extends User{
	String doctorId;
	String specialization;
	ArrayList<Appointment> appointments;

	//constructor that inherits from user class, role is Doctos
	public HealthcareTeam(int id, String username, String password, String firstName, String lastName, 
				String email, String phoneNumber, String doctorId, String specialization, ArrayList<Appointment> appointments){
		super(id, username, password, "Doctor", firstName, lastName, email, phoneNumber);
		this.doctorId = doctorId;
		this.specialization = specialization;
		this.appointments = appointments;
	}

	//getters
	public String getDoctorId(){
		return doctorId;
	}
	public String getSpecialization(){
		return specialization;
	}
	public ArrayList<Appointment> getAppointments(){
		return appointments;
	}

	//setters
	public void setDoctorId(String doctorId){
		this.doctorId = doctorId;
	}
	public void setSpecialization(String specialization){
		this.specialization = specialization;
	}
	public void setAppointments(ArrayList<Appointment> appointments){
		this.appointments = appointments;
	}
}