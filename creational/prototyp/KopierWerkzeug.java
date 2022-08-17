
package creational.prototyp;


public class KopierWerkzeug {

	Klonbar erstelleObject(Klonbar prototyp) {
		return prototyp.klone();
	}

}
