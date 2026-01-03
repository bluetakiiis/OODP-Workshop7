package HMS;

public class HospitalApp {
    public static void main(String[] args) {
        // 1. Create a Patient with full details
        Patient p1 = new Patient("SSN-001", "John Doe", 30, "Male", "123 Main St", "555-0101", "P101");
        p1.viewPersonalDetails();
        p1.bookAppointment();

        // 2. Create a Doctor
        Doctor d1 = new Doctor("SSN-099", "Dr. Smith", 45, "Female", "Hospital Ave", "555-0202", "D202", "Cardiology");
        
        // 3. Create an Appointment linked to the Patient
        Appointment a1 = new Appointment("A01", "2025-12-31", "10:00 AM", p1);
        a1.viewAppointmentDetails();

        // 4. Create a Treatment
        Treatment t1 = new Treatment("T01", "Physiotherapy", "Initial session");
        
        // 5. Doctor interacts with Patient and Treatment
        d1.seePatientDetails(p1);
        d1.prescribeTreatment(p1, t1);
    }
}