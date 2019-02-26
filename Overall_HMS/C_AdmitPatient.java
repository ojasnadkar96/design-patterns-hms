public class C_AdmitPatient {
	
	private static int[] listOfVacantRooms = new int[100];
	private static boolean approval;
	private static C_AdmitPatient admitter = new C_AdmitPatient();
	
	private C_AdmitPatient(){}
	
	public static C_AdmitPatient getInstance(){
		return admitter;
	}
	
	public int[] requestVacantRooms(){
		E_Rooms roomsDbInstance = E_Rooms.getInstance();
		listOfVacantRooms = roomsDbInstance.requestVacantRooms();
		return listOfVacantRooms;
	}
	
	public boolean assignRoom(String patientID, int room){
		E_Rooms roomsDbInstance = E_Rooms.getInstance();
		approval = roomsDbInstance.assignRoom(patientID, room);
		return approval;
	}
	
	//assignRoom() updates patient's history as well
	
}
