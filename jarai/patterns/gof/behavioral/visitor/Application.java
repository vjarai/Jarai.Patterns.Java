package jarai.patterns.gof.behavioral.visitor;

public class Application {
    public static void main(String[] args) {

        int i;
        var fuhrpark = new Fuhrpark();

        fuhrpark.add(new Lkw());
        fuhrpark.add(new Bus(2));

        var gutachter = new Gutachter();
        gutachter.begutachte(fuhrpark);

        var putzfrau = new Reinigungskraft();
        putzfrau.putzen(fuhrpark);

    }
}

