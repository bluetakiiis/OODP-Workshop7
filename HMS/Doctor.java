package HMS;

/**
 * Represents a doctor in a specific department. 
 */
public class Doctor extends Person {
    private String doctorID, department;

    public Doctor(String personID, String name, int age, String gender, String address, String contactDetails, String doctorID, String department) {
        super(personID, name, age, gender, address, contactDetails);
        this.doctorID = doctorID;
        this.department = department;
    }

    /** View patient records.  */
    public void seePatientDetails(Patient patient) {
        System.out.println("Doctor " + name + " is viewing records for " + patient.getName() + " in the " + department + " department.");
    }

    /** Prescribe treatments/medications for patients during an appointment. */
    public void prescribeTreatment(Patient patient, Treatment treatment) {
        System.out.println("Doctor " + name + " (ID: " + doctorID + ") prescribed " + 
                           treatment.getType() + " for patient " + patient.getName());
    }
}