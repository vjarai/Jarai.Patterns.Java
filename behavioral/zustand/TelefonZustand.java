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
	
	TelefonZustand w�hleRufnummer(String rufnummer)
	{
		System.out.println("Die Rufnummer " + rufnummer + " kann zur Zeit nicht gew�hlt werden");
		return this;
	}

	void f�hrenUnterhaltung() {
		System.out.println("Keiner versteht Sie zur Zeit.");
    }

	TelefonZustand auflegenH�rer() {
		System.out.println("Sie k�nnen den H�rer zur Zeit nicht auflegen.");		
		return this;
	}

	TelefonZustand abhebenH�rer() {
		System.out.println("Sie k�nnen den H�rer zur Zeit nicht abheben.");		
		return this;
	}

}