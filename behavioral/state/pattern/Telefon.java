/*
 * Created on 27.03.2004
 *
 */
package behavioral.state.pattern;


public class Telefon {

    private TelefonZustand aktuellerZustand = new HoererIstAufgelegt();

    /**
     *
     */
    public Telefon() {
    }

    void waehleRufnummer(String rufnummer) {
        aktuellerZustand = aktuellerZustand.waehleRufnummer(rufnummer);
    }

    void annehmenAnruf() {
        aktuellerZustand = aktuellerZustand.annehmenAnruf();
    }

    void auflegenHoerer() {
        aktuellerZustand = aktuellerZustand.auflegenHoerer();
    }


    void fuehrenUnterhaltung() {
        aktuellerZustand.fuehrenUnterhaltung();
    }

    void abhebenHoerer() {
        aktuellerZustand = aktuellerZustand.abhebenHoerer();
    }

}
