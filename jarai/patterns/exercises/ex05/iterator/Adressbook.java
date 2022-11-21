package jarai.patterns.exercises.ex05.iterator;

/**
 * ToDo: Sorgen Sie dafür, dass ein Adressbook mit einer for each Schleife durchlaufen werden kann.
 * Implementieren Sie hierzu Iterable<Contact> in der Klasse Adressbook
 */
public class Adressbook {

    private final Contact[] contacts;

    public Adressbook(Contact[] contacts) {
        this.contacts = contacts;
    }


}
