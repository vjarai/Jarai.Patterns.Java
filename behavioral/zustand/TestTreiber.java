/*
 * Created on 27.03.2004
 *
 */
package behavioral.zustand;

/**
 * @author Viktor
 *
 */
public class TestTreiber {

	public static void main(String[] args) {
		Telefon meinTelefon = new Telefon();
		
		meinTelefon.abhebenHörer();
//		meinTelefon.abhebenHörer();
		meinTelefon.wähleRufnummer("112");
		meinTelefon.führenUnterhaltung();
		meinTelefon.auflegenHörer();
	}
}
