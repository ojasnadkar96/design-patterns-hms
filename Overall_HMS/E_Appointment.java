import java.util.ArrayList;
import java.util.List;

public class E_Appointment {
	
	private static E_Appointment instance = new E_Appointment();
	
	private E_Appointment(){}
	
	public static E_Appointment getInstance(){
		return instance;
	}
	
	public List<String> requestDoctor(String doctorName){
    	List<String> listOfTimeslots = new ArrayList<String>();
		if(doctorName.equals("A") || doctorName.equals("a")){
          	listOfTimeslots.add("Monday 09:00 - 09:30 am");
          	listOfTimeslots.add("Monday 09:30 - 10:00 am");
		}
		else if(doctorName.equals("B") || doctorName.equals("b")){
          	listOfTimeslots.add("Tuesday 09:00 - 09:30 am");
          	listOfTimeslots.add("Tuesday 09:30 - 10:00 am");
		}
		else if(doctorName.equals("C") || doctorName.equals("c")){
          	listOfTimeslots.add("Wednesday 09:00 - 09:30 am");
          	listOfTimeslots.add("Wednesday 09:30 - 10:00 am");
		}
		return listOfTimeslots;
	}

	public int bookAppointment(int timeslot) {
		int token = 1;
		return token;
	}
	

}
