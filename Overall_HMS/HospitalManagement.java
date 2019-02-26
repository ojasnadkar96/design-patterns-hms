import java.util.Scanner;

public class HospitalManagement implements Interface{
	
	public static void main (String args[]){
		I_AdmitPatient admit = new I_AdmitPatient();
		I_GenerateBill bill = new I_GenerateBill();
		I_PerformCheckup checkup = new I_PerformCheckup();
		I_PerformTest test = new I_PerformTest();
		I_ScheduleAppointment appointment = new I_ScheduleAppointment();
		HospitalManagement hms = new HospitalManagement();
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println();
			hms.display("WELCOME TO HOSPITAL MANAGEMENT SYSTEM");
			hms.display("1: Schedule an Appointment");
			hms.display("2: Perform Checkup");
			hms.display("3: Generate Patient Bill");
			hms.display("4: Perform Tests");
			hms.display("5: Admit Patient");
			hms.display("6: Exit");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
				hms.display("APPOINTMENT MENU");
				hms.display("Select a Doctor:");
				hms.display("A: Dr. Gregory House - Department of Diagnostic Medicine");
				hms.display("B: Dr. Drake Ramory - Department of Neuroscience");
				hms.display("C: Dr. Meredith Grey - Depeartment of Surgery");
				String doc = sc.next();
				appointment.requestDoctor(doc);
				hms.display("Select a Timeslot:");
				int tslot = sc.nextInt();
				hms.display("Enter your name: ");
				String pname = sc.next();
				appointment.requestAppointment(tslot);
				String pid = appointment.sendPatientDetails(pname);
				hms.display("Your Patient ID is: " + pid);
				hms.display("Appointment Successful!");
				break;
				
				case 2:
				hms.display("WELCOME TO CHECKUP CLINIC");
				hms.display("Enter patient ID");
				String patientID = sc.next();
				checkup.requestPatientHistory(patientID);
				hms.display("Enter Medication: ");
				String medication = sc.next();
				checkup.prescribeTreatment(patientID,medication);
				hms.display("Medical History Successfully Updated!");
				break;
				
				case 3:
				hms.display("WELCOME TO HOSPITAL BILLING");
				hms.display("Enter patient ID");
				String billID = sc.next();
				bill.requestBill(billID);
				break;
				
				case 4:
				hms.display("WELCOME TO HOSPITAL BILLING");
				hms.display("Enter patient ID");
				String testID = sc.next();
				hms.display("Enter Test details");
				String testDetails = sc.next();
				test.updatePatientHistory(testID,testDetails);
				hms.display("Test Done!");
				break;
				
				case 5:
				hms.display("WELCOME TO PATIENT ADMISSION");
				hms.display("Enter patient ID");
				String roomID = sc.next();
				hms.display("List of vacant rooms");
				admit.requestVacantRooms();
				hms.display("Select a room");
				int rooms = sc.nextInt();
				admit.assignRoom(roomID,rooms);
				hms.display("Get Well Soon!");
				break;
			}
		}while(choice!=6);
		sc.close();
	}
	
	public void display(String str){
		System.out.println(str);
	}
}