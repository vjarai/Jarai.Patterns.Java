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
		meineMutterplatine.hinzuf�gen( new Prozessor(2400, 300) );
		meineMutterplatine.hinzuf�gen( new Ram(512, 250) );
		
		meinComputer.hinzuf�gen( meineMutterplatine );
		meinComputer.hinzuf�gen( new Festplatte("C:", 100) );
		meinComputer.hinzuf�gen( new Festplatte("D:", 100) );
		
		meinComputer.anzeigen();
		
	}
}
