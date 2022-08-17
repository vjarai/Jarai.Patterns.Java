/*
 * Created on 27.03.2004
 *
 */
package behavioral.zustand;

/**
 * @author Viktor
 *
 */
public class H�rerIstAufgelegt extends TelefonZustand {

	TelefonZustand abhebenH�rer() {
		System.out.println("Sie haben den H�rer abgehoben.");
		return new H�rerIstAbgehoben();
	}

	TelefonZustand annehmenAnruf() {
		System.out.println("Anruf wurde entgegengenommen");
		return new VerbindungIstHergestellt();
	}

}