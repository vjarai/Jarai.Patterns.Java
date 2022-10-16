/*
 * Created on 29.03.2004
 *
 */
package creational.erbauer;


public abstract class Koch {

    protected String mahlzeit;

    public abstract void kocheVorspeise();

    public abstract void kocheHauptspeise();

    public abstract void kocheNachspeise();

    public String getMahlzeit() {
        return mahlzeit;
    }


}
