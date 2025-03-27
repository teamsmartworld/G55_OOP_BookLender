class Person {
    // Static sequencer to auto-generate unique IDs
    private static int sequencer = 0;
    private int id;
    private String firstName;
    private String lastName;

    // Constructor to initialize a person with a unique ID
    public Person(String firstName, String lastName) {
        this.id = ++sequencer;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Getter and Setter for First Name
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and Setter for Last Name
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // toString method for displaying person details
    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
    }
}