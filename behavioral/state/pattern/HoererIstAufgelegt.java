/*
 * Created on 27.03.2004
 *
 */
package behavioral.state.pattern;


public class HoererIstAufgelegt extends TelefonZustand {

    TelefonZustand abhebenHoerer() {
        System.out.println("Sie haben den Hoerer abgehoben.");
        return new HoererIstAbgehoben();
    }

    TelefonZustand annehmenAnruf() {
        System.out.println("Anruf wurde entgegengenommen");
        return new VerbindungIstHergestellt();
    }

}