/*
 * Created on 27.03.2004
 *
 */
package behavioral.zustand;

/**
 * @author Viktor
 *
 */
public class VerbindungIstHergestellt extends TelefonZustand {

	TelefonZustand auflegenH�rer() {
		System.out.println("Der H�rer wurde aufgelegt und die Verbindung getrennt.");
		return new H�rerIstAufgelegt();
	}

	void f�hrenUnterhaltung() {
		System.out.println("Sie unterhalten sich prima.");
    }

}