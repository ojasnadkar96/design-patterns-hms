import java.util.Date;

public class StaffFacade {
	private I_AdmitPatient admitPatient;
	private I_GenerateBill generateBill;
	private I_ScheduleAppointment scheduleAppointment;
	
	public StaffFacade(){
		admitPatient = new I_AdmitPatient();
		generateBill = new I_GenerateBill();
		scheduleAppointment = new I_ScheduleAppointment();
	}
	
	public void requestVacantRooms(){
		admitPatient.requestVacantRooms();
	}
	
	public void assignRoom(String patientID, int room){
		admitPatient.assignRoom(patientID, room);
	}
	
	public void requestBill(String patientID){
		generateBill.requestBill(patientID);
	}
	
	public void requestDoctor(String doctorName){
		scheduleAppointment.requestDoctor(doctorName);
	}
	
	public void requestAppointment(Date timeslot){
		scheduleAppointment.requestAppointment(timeslot);
	}
	
	public void sendPatientDetails(String patientDetails){
		scheduleAppointment.sendPatientDetails(patientDetails);
	}
	
}
