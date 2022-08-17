/*
 * Created on 29.03.2004
 *
 */
package creational.erbauer;

/**
 * @author Viktor
 *
 */
public abstract class Koch {

	public abstract void kocheVorspeise();
	public abstract void kocheHauptspeise();
	public abstract void kocheNachspeise();
	public String getMahlzeit(){
		return mahlzeit;
	}

  protected String mahlzeit;


}
