
public abstract class PatientDecorator {
	protected Patient decoratedPatient;
	
	public PatientDecorator(Patient decoratedPatient){
		this.decoratedPatient = decoratedPatient;
	}
}
