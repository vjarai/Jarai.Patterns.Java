package jarai.patterns.excercises.iterator;

public class Contact {
    private final String firstname;
    private final String lastname;

    public Contact(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
