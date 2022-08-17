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

	TelefonZustand auflegenHörer() {
		System.out.println("Der Hörer wurde aufgelegt und die Verbindung getrennt.");
		return new HörerIstAufgelegt();
	}

	void führenUnterhaltung() {
		System.out.println("Sie unterhalten sich prima.");
    }

}