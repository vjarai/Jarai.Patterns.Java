package behavioral.besucher;

import java.util.Vector;

public class TestTreiber {
    public static void main(String[] args) {

        int i;
        Vector<Fahrzeug> fuhrpark = new Vector<>();

        fuhrpark.add(new Lkw(1.0f));
        fuhrpark.add(new Bus(2));
        fuhrpark.add(new Lkw(3.0f));
        fuhrpark.add(new Bus(4));
        fuhrpark.add(new Lkw(5.0f));

        Gutachter g = new Gutachter();

        for (i = 0; i < fuhrpark.size(); i++) {
            fuhrpark.get(i).nimmEntgegen(g);
        }
        g.zeigeSumme();

        Putzfrau p = new Putzfrau();
        for (i = 0; i < fuhrpark.size(); i++) {
            fuhrpark.get(i).nimmEntgegen(p);
        }
    }
}
