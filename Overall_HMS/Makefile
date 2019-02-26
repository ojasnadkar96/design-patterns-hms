
JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	HospitalManagement.java \
    I_AdmitPatient.java \
    I_GenerateBill.java \
    I_PerformCheckup.java \
	I_PerformTest.java \
	I_ScheduleAppointment.java \
	C_AdmitPatient.java \
    C_GenerateBill.java \
    C_PerformCheckup.java \
	C_PerformTest.java \
	C_ScheduleAppointment.java \
	E_Patient.java \
	E_Appointment.java \
	E_Rooms.java \
	Interface.java \
	InPatient.java \
	OutPatient.java \
	Patient.java \
	PatientFactory.java \
	RoomFinder.java \
	RoomFinderAdapter.java \
	VacantRoomFinder.java \
	Bill.java \

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class