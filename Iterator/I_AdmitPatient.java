
public class I_AdmitPatient implements Interface{
	
	private static RoomList listOfVacantRooms = new RoomList();
	private static boolean approval;
	private static C_AdmitPatient controllerInstance = C_AdmitPatient.getInstance();
	
	public void requestVacantRooms(){
		listOfVacantRooms = controllerInstance.requestVacantRooms();
		display(listOfVacantRooms.toString());
	}
	
	public void assignRoom(String patientID, int room){
		approval = controllerInstance.assignRoom(patientID, room);
		if(approval)
			display("Room " + Integer.toString(room) + " allotted to " + patientID + " successfully");
		else
			display("Room allotment failed");
	}
	
	public void display(String str){
		System.out.println(str);
	}
}
