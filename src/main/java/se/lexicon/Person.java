package se.lexicon;

public class Person {
    // declare the instance variables
    private int  sequencer = 0;
    private int id;
    private String firstName;
    private String lastName;
}
public int Person (int id, String firstName, String lastName) {
    if ( firstName == null || lastName == null) {
        throw new IllegalArgumentException("Sorry the Field Cannot be empty");
    }
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;

    //Getters (to retrieve private fields
    public String getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    //Setters to update private field values with validation
    public void setFirstName (String firstName) {
        if (firstName == null) {
            throw new IllegalArgumentException("First Name cannot be empty");
        }
        this.firstName = firstName;
    }

    public void setLastName (String lastName){
        if (lastName == null) {
            throw new IllegalArgumentException("First Name cannot be empty");
        }
        this.lastName = lastName;
    }
}

