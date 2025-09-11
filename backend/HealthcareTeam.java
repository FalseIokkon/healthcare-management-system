import java.util.ArrayList;

public class HealthcareTeam extends User{
	String doctorId;
	String specialization;
	ArrayList<Appointment> appointments;

	public HealthcareTeam(int id, String username, String password, String firstName, String lastName, 
				String email, String phoneNumber, String doctorId, String specialization, ArrayList<Appointment> appointments){
		super(id, username, password, "Doctor", firstName, lastName, email, phoneNumber);
		this.doctorId = doctorId;
		this.specialization = specialization;
		this.appointments = appointments;
	}
}