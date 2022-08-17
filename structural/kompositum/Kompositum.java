/*
 * Created on 21.03.2004
 *
 */
package structural.kompositum;
import java.util.LinkedList;
/**
 * @author Viktor
 *
 */
public abstract class Kompositum extends Komponente{

	protected final LinkedList<Komponente> komponentenListe = new LinkedList<>();		// Component interface

	public Kompositum( double preis) {
		super( preis );		
	}

	void anzeigen(){
		super.anzeigen();
		Komponente komponente;

		for (Komponente value : komponentenListe) {
			komponente = value;
			komponente.anzeigen();
		}
			
	}

	void hinzufügen(Komponente komponente ) {
		komponentenListe.add( komponente );
	}

}