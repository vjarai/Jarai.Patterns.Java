package behavioral.befehl;

import java.util.Vector;


public class MakroBefehl extends Befehl {

    private final Vector<Befehl> makroBefehle = new Vector<>();

    public MakroBefehl() {
        super(null);
    }

    void ausfuehren() {
        for (Befehl befehl : makroBefehle) {
            befehl.ausfuehren();
        }
    }

    void rueckgaengig() {
        for (int i = makroBefehle.size() - 1; i >= 0; i--) {
            Befehl befehl = makroBefehle.get(i);
            befehl.rueckgaengig();
        }
    }

    void hinzufuegenBefehl(Befehl befehl) {
        makroBefehle.add(befehl);
    }

}
