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
public class Ikea extends H�ndler {

	private double filialUmsatz = 0;
	private static double konzernUmsatz = 0;

	Produkt verkaufen() {
		int auswahl = 0;
		System.out.println("Willkommen bei Ikea "  + this.standort);
		System.out.println(" Was wollen Sie kaufen (1 = Tisch, 2 = Stuhl ?");
		
		try{
			auswahl = Integer.parseInt(new BufferedReader( new InputStreamReader(System.in)).readLine());
		}
		catch(IOException e) {
		System.err.println("Caught IOException: " +
					e.getMessage());
		}
		
		Produkt gekauftesProdukt;
		
		switch( auswahl )
		{
			case 1:
				gekauftesProdukt = new Tisch("Tisch", 100);
				break;
			case 2:
				gekauftesProdukt = new Stuhl("Stuhl", 50);
				break;
			default:
				gekauftesProdukt = null;
		}
			
		
		if( gekauftesProdukt != null)
		{	
			this.filialUmsatz += gekauftesProdukt.getPreis();
			Ikea.konzernUmsatz+= gekauftesProdukt.getPreis();
		}
		
		return gekauftesProdukt;
	}

	Ikea(String standort) {
		super( standort );
	}

	void anzeigen() {
		System.out.println("Ikea Filialumsatz : " + this.standort + " " + this.filialUmsatz + " EUR");
		System.out.println("Ikea Konzernumsatz: " + Ikea.konzernUmsatz + " EUR");
	}

}
