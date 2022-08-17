/*
 * Created on 21.03.2004
 *
 */
package behavioral.beobachter;

/**
 * @author Viktor
 *
 */
public class TestTreiber {

	public static void main(String[] args) {
		
		Wechselkurse meineWechselkurse = new Wechselkurse();
		meineWechselkurse.setDollarkurs( 1.10 );
		
		Firma meineFirma = new Firma( meineWechselkurse );
		Firma deineFirma = new Firma( meineWechselkurse );
		
		meineWechselkurse.anmeldenBeobachter( meineFirma );
		// meineWechselkurse.anmeldenBeobachter( deineFirma );
		
		// Alle angemeldeten Beobachter werden automatisch aktualisiert
		meineWechselkurse.setDollarkurs( 1.25 );
		
		meineFirma.anzeigen();
		deineFirma.anzeigen();
		
		
	}
}
