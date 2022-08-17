/*
 * Created on 27.03.2004
 *
 */
package behavioral.zustand;

/**
 * @author Viktor
 *
 */
public class HörerIstAbgehoben extends TelefonZustand {

	TelefonZustand wähleRufnummer(String rufnummer) {
		System.out.println("Die Rufnummer " + rufnummer + " wird gewählt.");
		return new VerbindungIstHergestellt();
	}

	TelefonZustand auflegenHörer() {
		System.out.println("Der Hörer wurde aufgelegt.");
		return new HörerIstAufgelegt();
	}

}
