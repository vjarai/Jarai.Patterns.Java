/*
 * Created on 27.03.2004
 *
 */
package behavioral.state.pattern;


public class TestTreiber {

    public static void main(String[] args) {
        Telefon meinTelefon = new Telefon();

        meinTelefon.abhebenHoerer();
//		meinTelefon.abhebenHoerer();
        meinTelefon.waehleRufnummer("112");
        meinTelefon.fuehrenUnterhaltung();
        meinTelefon.auflegenHoerer();
    }
}
