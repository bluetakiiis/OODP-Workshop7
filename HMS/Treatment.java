package HMS;

/**
 * Records medical treatments and descriptions.
 */
public class Treatment {
    private String treatmentID, type, description;

    public Treatment(String id, String type, String desc) {
        this.treatmentID = id;
        this.type = type;
        this.description = desc;
    }

    public void updateDescription(String newDesc) {
        this.description = newDesc;
        System.out.println("Treatment " + treatmentID + " description updated.");
    }

    public void viewTreatmentDetails() {
        System.out.println("Treatment ID: " + treatmentID + " | Type: " + type + " | Info: " + description);
    }

    public String getType() { return type; }
}