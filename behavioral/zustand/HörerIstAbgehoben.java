/*
 * Created on 27.03.2004
 *
 */
package behavioral.zustand;

/**
 * @author Viktor
 *
 */
public class H�rerIstAbgehoben extends TelefonZustand {

	TelefonZustand w�hleRufnummer(String rufnummer) {
		System.out.println("Die Rufnummer " + rufnummer + " wird gew�hlt.");
		return new VerbindungIstHergestellt();
	}

	TelefonZustand auflegenH�rer() {
		System.out.println("Der H�rer wurde aufgelegt.");
		return new H�rerIstAufgelegt();
	}

}
