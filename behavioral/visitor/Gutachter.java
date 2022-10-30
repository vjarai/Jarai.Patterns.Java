package behavioral.visitor;

public class Gutachter extends Besucher {

    private double summe = 0;

    void besuche(Lkw e) {
        summe += e.getDoubleDaten();
    }

    void besuche(Bus e) {
    }

    public void zeigeSumme() {
        System.out.println("Summe aller Lkw: " + summe);
    }

}
