package creational.builder;

public class TestTreiber {

    public static void main(String[] args) {

        var auswahl = 1;
        Koch koch;

        // Erbauer (Koch) auswaehlen
        if (auswahl == 1)
            koch = new ItalienischerKoch();
        else
            koch = new DeutscherKoch();

        var kuechenChef = new KuechenChef(koch);

        // Direktor erstellt eine komplexe Mahlzeit
        kuechenChef.erstelleMahlzeit();

        System.out.println(koch.getMahlzeit());
    }
}
