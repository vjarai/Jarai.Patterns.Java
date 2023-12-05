package jarai.patterns.gof.structural.composite;


public class Application {

    public static void main(String[] args) {

        var meinComputer = new Baugruppe("PC");

        var meineMutterplatine = new Baugruppe("Mutterplatine");
        meineMutterplatine.hinzufuegen(new Bauteil("Prozessor", 300));
        meineMutterplatine.hinzufuegen(new Bauteil("Ram", 250));

        meinComputer.hinzufuegen(meineMutterplatine);
        meinComputer.hinzufuegen(new Bauteil("Festplatte", 100));
        meinComputer.hinzufuegen(new Bauteil("Gehaeuse", 100));


        meinComputer.anzeigen();

    }
}
