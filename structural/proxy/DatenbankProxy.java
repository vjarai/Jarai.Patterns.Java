/*
 * Created on 21.03.2004
 *
 */
package structural.proxy;

/**
 * @author Viktor
 *
 */
public class DatenbankProxy extends Datenbank {

	private int lastKey;

	private String lastResult;

	private final Datenbank datenbank;

	public String abfragenDaten(int key) {
		
		String result;
		
		// Proxy verhindert Zugriff auf vertrauliche Daten.
		if( key <= 100 )
		{
			System.out.print("Kein Zugriff.");
			result = "<nichts>";
		}		
		// Proxy erspart zeitaufwändigen Datebankzugriff, wenn Daten im Cache vorhanden
		else if( key == lastKey )	
		{
			System.out.print("Daten aus dem Cache abgerufen.");
			result = lastResult;
		}
		else	// ansonsten Abfrage an die Datenbank weiterleiten
		{
			result 		= datenbank.abfragenDaten( key );
			lastKey 	= key;
			lastResult	= result; 
		}
			
		return result;			
	}

	DatenbankProxy(Datenbank datenbank) {
		this.datenbank = datenbank;
	}

}