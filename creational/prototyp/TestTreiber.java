
package creational.prototyp;

public class TestTreiber {

	public static void main(String[] args) {
		
		KopierWerkzeug w = new KopierWerkzeug();
		
		KlonbarerString s1 = new KlonbarerString( "OriginalString");
		KlonbarerInteger i1 = new KlonbarerInteger( 100 );
	
		Klonbar s2 = w.erstelleObject( s1 );
		Klonbar i2 = w.erstelleObject( i1 );
		
		s1.setString("Geänderter String");
		s1.anzeigen();
		s2.anzeigen();
	
		i1.setIntWert( 200 );
		i1.anzeigen();
		i2.anzeigen();
	}
}
