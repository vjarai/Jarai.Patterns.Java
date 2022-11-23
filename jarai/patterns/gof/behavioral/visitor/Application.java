package jarai.patterns.gof.behavioral.visitor;

public class Application {
    public static void main(String[] args) {

        var fuhrpark = new Fuhrpark();

        fuhrpark.add(new Lkw());
        fuhrpark.add(new Bus());

        var gutachter = new Gutachter();
        gutachter.begutachte(fuhrpark);

        var putzfrau = new Reinigungskraft();
        putzfrau.putzen(fuhrpark);

    }
}

