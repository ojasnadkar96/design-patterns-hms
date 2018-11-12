import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Calendar;

public class E_Appointment {
	
	private static E_Appointment instance = new E_Appointment();
	
	private E_Appointment(){}
	
	public static E_Appointment getInstance(){
		return instance;
	}
	
	public List<Date> requestDoctor(String doctorName){
		
		List<Date> listOfTimeslots = new ArrayList<Date>();
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, 2017);
		cal.add(Calendar.MONTH, Calendar.MARCH);
		
		if(doctorName == "Dr. A"){
			cal.add(Calendar.DAY_OF_MONTH, 6);
			Date dateRep = cal.getTime();
			listOfTimeslots.add(dateRep);
			
			cal.add(Calendar.DAY_OF_MONTH, 7);
			dateRep = cal.getTime();
			listOfTimeslots.add(dateRep);
		}
		else if(doctorName == "Dr. B"){
			cal.add(Calendar.DAY_OF_MONTH, 8);
			Date dateRep = cal.getTime();
			listOfTimeslots.add(dateRep);
			
			cal.add(Calendar.DAY_OF_MONTH, 9);
			dateRep = cal.getTime();
			listOfTimeslots.add(dateRep);
		}
		
		return listOfTimeslots;
		
	}

	public int bookAppointment(Date timeslot) {
		int token = 1;
		return token;
	}
	

}
