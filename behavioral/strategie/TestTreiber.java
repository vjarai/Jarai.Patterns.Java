/*
 * Created on 28.03.2004
 *
 */
package behavioral.strategie;

import java.util.Vector;
/**
 * @author Viktor
 *
 */
public class TestTreiber {

	static private Vector daten;

	public static void main(String[] args) {

		int auswahl = 2;
		
		// Auswahl einer Strategie ZUR LAUFZEIT 
		SortStrategie sortStrategie;
		if( auswahl == 1)
			sortStrategie = new BubbleSort();
		else
			sortStrategie = new QuickSort();

		// verwenden der ausgewählten Strategie
		sortStrategie.sortiere( daten );		
	}
}
