/*
 * Created on 27.03.2004
 *
 */
package behavioral.zustand;

/**
 * @author Viktor
 *
 */
public abstract class TelefonZustand {

	/**
	 * 
	 */
	public TelefonZustand() {
	}

	TelefonZustand annehmenAnruf()
	{
		System.out.println("Anruf kann zur Zeit nicht angenommen werden.");
		return this;
	}
	
	TelefonZustand wähleRufnummer(String rufnummer)
	{
		System.out.println("Die Rufnummer " + rufnummer + " kann zur Zeit nicht gewählt werden");
		return this;
	}

	void führenUnterhaltung() {
		System.out.println("Keiner versteht Sie zur Zeit.");
    }

	TelefonZustand auflegenHörer() {
		System.out.println("Sie können den Hörer zur Zeit nicht auflegen.");		
		return this;
	}

	TelefonZustand abhebenHörer() {
		System.out.println("Sie können den Hörer zur Zeit nicht abheben.");		
		return this;
	}

}