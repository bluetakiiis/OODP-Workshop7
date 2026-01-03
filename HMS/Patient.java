package HMS;

/**
 * Represents a hospital patient.
 */
public class Patient extends Person {
    private String patientID;

    public Patient(String personID, String name, int age, String gender, String address, String contactDetails, String patientID) {
        super(personID, name, age, gender, address, contactDetails);
        this.patientID = patientID;
    }

    /** Patients can book appointments with doctors. */
    public void bookAppointment() {
        System.out.println("Patient " + name + " (ID: " + patientID + ") is booking an appointment.");
    }
    
    public String getName() { return name; }
}