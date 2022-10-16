/*
 * Created on 27.03.2004
 *
 */
package behavioral.state.pattern;


public class VerbindungIstHergestellt extends TelefonZustand {

    TelefonZustand auflegenHoerer() {
        System.out.println("Der Hoerer wurde aufgelegt und die Verbindung getrennt.");
        return new HoererIstAufgelegt();
    }

    void fuehrenUnterhaltung() {
        System.out.println("Sie unterhalten sich prima.");
    }

}