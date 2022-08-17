/*
 * Created on 27.03.2004
 *
 */
package behavioral.zuständigkeitskette;

/**
 * @author Viktor
 *
 */
public class Buchhalter extends Mitarbeiter {

	/**
	 * @param name
	 */
	public Buchhalter(String name) {
		super(name);	
	}
	
	boolean bearbeitenAnfrage(String anfrage) {
		if( anfrage.equals("Kontostand"))
		{
			System.out.println( name + " sagt: Kontostand ist 123.45");
			return true;
		}
		else
		{
			System.out.println( name + " kennt " + anfrage +" nicht." );
			return false;
		}
		
	}	
	

}
