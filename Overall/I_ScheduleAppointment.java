import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class I_ScheduleAppointment implements Interface{
	
	private static List<Date> listOfTimeslots = new ArrayList<Date>();
	private static int tokenNumber;
	private C_ScheduleAppointment controllerInstance = C_ScheduleAppointment.getInstance();
	
	public void requestDoctor(String doctorName){
		listOfTimeslots = controllerInstance.requestDoctor(doctorName);
		display(listOfTimeslots.toString());
	}
	
	public void requestAppointment(Date timeslot){
		tokenNumber = controllerInstance.requestAppointment(timeslot);
		display(Integer.toString(tokenNumber));
	}
	
	public void sendPatientDetails(String patientDetails){
		controllerInstance.sendPatientDetails(patientDetails);
	}
	
	public void display(String str){
		System.out.println(str);
	}
}
