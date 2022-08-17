/*
 * Created on 27.03.2004
 *
 */
package creational.fabrikmethode;
import java.io.*;

/**
 * @author Viktor
 *
 */
public class TestTreiber {

	public static void main(String[] args) {
		int  auswahl = 1;

		Händler meinHändler;
		Produkt meinProdukt;
		
		Ikea IkeaWallau = new Ikea("Wallau");
		Ikea IkeaHeidelberg = new Ikea("Heidelberg");
		Aldi AldiFrankfurt = new Aldi("Frankfurt");
		
		do{
			
			System.out.println("Wo wollen Sie einkaufen (1=Ikea Wallau, 2=Ikea Heidelberg, 3=Aldi)?");
			
			try{
				auswahl = Integer.parseInt(new BufferedReader( new InputStreamReader(System.in)).readLine());
			}
			catch(IOException e) {
				System.err.println("Caught IOException: " +	e.getMessage());
			}
			
			switch(auswahl)
			{
				case 1:	meinHändler = IkeaWallau;
						break;
				case 2:	meinHändler = IkeaHeidelberg;
						break;
				case 3:	meinHändler = AldiFrankfurt;
						break;
				default:meinHändler = null;	 
			}
		
			if( meinHändler != null)
			{	
				meinProdukt = meinHändler.verkaufen();	// Fabrikmethode aufrufen
				
				if( meinProdukt  != null )
					meinProdukt.benutzen();
				
				meinHändler.anzeigen();
			}
			
		}while( meinHändler != null); 
		
		System.out.println("Einkauf beendet.");
		
	}
}
