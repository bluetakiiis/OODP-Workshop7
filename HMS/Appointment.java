package HMS;

/**
 * Records the date, time, and patient details for an appointment.
 */
public class Appointment {
    private String appointmentID, appointmentDate, appointmentTime;
    private Patient patient; 

    public Appointment(String id, String date, String time, Patient patient) {
        this.appointmentID = id;
        this.appointmentDate = date;
        this.appointmentTime = time;
        this.patient = patient;
    }

    public void rescheduleAppointment(String newDate, String newTime) {
        this.appointmentDate = newDate;
        this.appointmentTime = newTime;
        System.out.println("Appointment " + appointmentID + " rescheduled to: " + appointmentDate + " at " + appointmentTime);
    }

    public void cancelAppointment() {
        System.out.println("Appointment " + appointmentID + " for " + patient.getName() + " has been cancelled.");
    }

    public void viewAppointmentDetails() {
        System.out.println("Appt ID: " + appointmentID + " | Date: " + appointmentDate + " | Patient: " + patient.getName());
    }
}