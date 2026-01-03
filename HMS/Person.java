package HMS;

/**
 * Parent class for all individuals in the hospital system.
 */
public class Person {
    protected String personID, name, gender, address, contactDetails;
    protected int age;

    public Person(String personID, String name, int age, String gender, String address, String contactDetails) {
        this.personID = personID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.contactDetails = contactDetails;
    }

    /** Displays all personal details to ensure all attributes are used. */
    public void viewPersonalDetails() {
        System.out.println("ID: " + personID + " | Name: " + name + " | Age: " + age);
        System.out.println("Gender: " + gender + " | Address: " + address + " | Contact: " + contactDetails);
    }
}