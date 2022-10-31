package jarai.patterns.behavioral.visitor;

import java.util.Vector;

public class Application {
    public static void main(String[] args) {

        int i;
        var fuhrpark = new Vector<Fahrzeug>();

        fuhrpark.add(new Lkw(1.0f));
        fuhrpark.add(new Bus(2));

        var gutachter = new Gutachter();
        gutachter.begutachte(fuhrpark);
        gutachter.zeigeSumme();

        var putzfrau = new Putzfrau();
        putzfrau.putzen(fuhrpark);

    }
}

