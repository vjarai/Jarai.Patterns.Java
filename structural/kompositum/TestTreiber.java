/*
 * Created on 21.03.2004
 *
 */
package structural.kompositum;

/**
 * @author Viktor
 *
 */
public class TestTreiber {

	public static void main(String[] args) {
		
		Computer meinComputer = new Computer("IBM", 100);
		
		Mutterplatine meineMutterplatine = new Mutterplatine( "Asus", 120);
		meineMutterplatine.hinzufügen( new Prozessor(2400, 300) );
		meineMutterplatine.hinzufügen( new Ram(512, 250) );
		
		meinComputer.hinzufügen( meineMutterplatine );
		meinComputer.hinzufügen( new Festplatte("C:", 100) );
		meinComputer.hinzufügen( new Festplatte("D:", 100) );
		
		meinComputer.anzeigen();
		
	}
}
