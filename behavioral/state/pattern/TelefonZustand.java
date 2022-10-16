/*
 * Created on 27.03.2004
 *
 */
package behavioral.state.pattern;


public abstract class TelefonZustand {

    /**
     *
     */
    public TelefonZustand() {
    }

    TelefonZustand annehmenAnruf() {
        System.out.println("Anruf kann zur Zeit nicht angenommen werden.");
        return this;
    }

    TelefonZustand waehleRufnummer(String rufnummer) {
        System.out.println("Die Rufnummer " + rufnummer + " kann zur Zeit nicht gewaehlt werden");
        return this;
    }

    void fuehrenUnterhaltung() {
        System.out.println("Keiner versteht Sie zur Zeit.");
    }

    TelefonZustand auflegenHoerer() {
        System.out.println("Sie koennen den Hoerer zur Zeit nicht auflegen.");
        return this;
    }

    TelefonZustand abhebenHoerer() {
        System.out.println("Sie koennen den Hoerer zur Zeit nicht abheben.");
        return this;
    }

}