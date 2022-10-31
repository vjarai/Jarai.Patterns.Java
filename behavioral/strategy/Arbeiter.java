/*
 * Created on 28.03.2004
 *
 */
package behavioral.strategy;


public abstract class Arbeiter {
    protected String Name;

    public Arbeiter(String name) {
        Name = name;
    }

    public abstract void Arbeiten();
}
