/*
 * Created on 27.03.2004
 *
 */
package behavioral.zustand;

/**
 * @author Viktor
 *
 */
public class HörerIstAufgelegt extends TelefonZustand {

	TelefonZustand abhebenHörer() {
		System.out.println("Sie haben den Hörer abgehoben.");
		return new HörerIstAbgehoben();
	}

	TelefonZustand annehmenAnruf() {
		System.out.println("Anruf wurde entgegengenommen");
		return new VerbindungIstHergestellt();
	}

}