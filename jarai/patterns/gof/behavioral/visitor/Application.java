package jarai.patterns.gof.behavioral.visitor;

public class Application {
    public static void main(String[] args) {

        var fuhrpark = new Fuhrpark();

        fuhrpark.add(new Lkw());
        fuhrpark.add(new Bus());

        var gutachter = new GutachterVisitor();
        fuhrpark.acceptVisitor(gutachter);

        var reinigungskraft = new ReinigungsVisitor();
        fuhrpark.acceptVisitor(reinigungskraft);

    }
}

