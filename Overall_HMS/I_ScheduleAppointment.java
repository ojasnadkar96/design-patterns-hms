import java.util.ArrayList;
import java.util.List;

public class I_ScheduleAppointment implements Interface{
	
	private static List<String> listOfTimeslots = new ArrayList<String>();
	private static int tokenNumber;
	private C_ScheduleAppointment controllerInstance = C_ScheduleAppointment.getInstance();
	
	public void requestDoctor(String doctorName){
		listOfTimeslots = controllerInstance.requestDoctor(doctorName);
		display("Please select from  available timeslots:");
		for(int i=0; i<listOfTimeslots.size(); i++){
			display(i+1 + ": " + listOfTimeslots.get(i));
		}
	}
	
	public void requestAppointment(int timeslot){
		tokenNumber = controllerInstance.requestAppointment(timeslot);
		display("Token Number: " + Integer.toString(tokenNumber));
	}
	
	public String sendPatientDetails(String patientDetails){
		return controllerInstance.sendPatientDetails(patientDetails);
	}
	
	public void display(String str){
		System.out.println(str);
	}
}
