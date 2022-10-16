/*
 * Created on 21.03.2004
 *
 */
package structural.kompositum;


public class TestTreiber {

    public static void main(String[] args) {

        Computer meinComputer = new Computer("IBM", 100);

        Mutterplatine meineMutterplatine = new Mutterplatine("Asus", 120);
        meineMutterplatine.hinzufuegen(new Prozessor(2400, 300));
        meineMutterplatine.hinzufuegen(new Ram(512, 250));

        meinComputer.hinzufuegen(meineMutterplatine);
        meinComputer.hinzufuegen(new Festplatte("C:", 100));
        meinComputer.hinzufuegen(new Festplatte("D:", 100));

        meinComputer.anzeigen();

    }
}
