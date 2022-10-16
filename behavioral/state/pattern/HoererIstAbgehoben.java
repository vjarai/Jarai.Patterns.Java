/*
 * Created on 27.03.2004
 *
 */
package behavioral.state.pattern;


public class HoererIstAbgehoben extends TelefonZustand {

    TelefonZustand waehleRufnummer(String rufnummer) {
        System.out.println("Die Rufnummer " + rufnummer + " wird gewaehlt.");
        return new VerbindungIstHergestellt();
    }

    TelefonZustand auflegenHoerer() {
        System.out.println("Der Hoerer wurde aufgelegt.");
        return new HoererIstAufgelegt();
    }

}
