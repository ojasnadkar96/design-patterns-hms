import java.util.ArrayList;
import java.util.List;

public class C_ScheduleAppointment {
	
	private static List<String> listOfTimeslots = new ArrayList<String>();
	private static int tokenNumber;
	private static C_ScheduleAppointment scheduler = new C_ScheduleAppointment();
	
	private C_ScheduleAppointment(){}
	
	public static C_ScheduleAppointment getInstance(){
		return scheduler;
	}
	
	public List<String> requestDoctor(String doctorName){
		
		E_Appointment appointmentDbInstance = E_Appointment.getInstance();
		listOfTimeslots = appointmentDbInstance.requestDoctor(doctorName);
		return listOfTimeslots;
	}
	
	public int requestAppointment(int timeslot){
		E_Appointment appointmentDbInstance = E_Appointment.getInstance();
		tokenNumber = appointmentDbInstance.bookAppointment(timeslot);
		return tokenNumber;
	}
	
	public String sendPatientDetails(String patientDetails){
		E_Patient patientDbInstance = E_Patient.getInstance();
		return patientDbInstance.sendPatientDetails(patientDetails);
	}
	
}
