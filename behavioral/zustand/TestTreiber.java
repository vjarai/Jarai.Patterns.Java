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
		
		meinTelefon.abhebenH�rer();
//		meinTelefon.abhebenH�rer();
		meinTelefon.w�hleRufnummer("112");
		meinTelefon.f�hrenUnterhaltung();
		meinTelefon.auflegenH�rer();
	}
}
