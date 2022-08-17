/*
 * Created on 27.03.2004
 *
 */
package behavioral.zuständigkeitskette;

/**
 * @author Viktor
 *
 */
public class Verkäufer extends Mitarbeiter {

	public Verkäufer(String name) {
		super(name);
	}
	
	boolean bearbeitenAnfrage(String anfrage) {
		if( anfrage.equals("Preis"))
		{
			System.out.println( name + " sagt: Preis ist 99.99");
			return true;
		}
		else
		{
			System.out.println( name + " kennt " + anfrage +" nicht." );
			return false;
		}
		
	}	


}
