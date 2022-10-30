/*
 * Created on 21.03.2004
 *
 */
package structural.composite;


public class Ram extends Komponente {

    private final int megabytes;

    /**
     *
     */
    public Ram(int megabytes, double preis) {
        super(preis);
        this.megabytes = megabytes;
    }

    void anzeigen() {
        System.out.print(megabytes + " Megabytes RAM ");
        super.anzeigen();
    }

}