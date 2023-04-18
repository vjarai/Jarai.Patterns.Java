package jarai.patterns.gof.behavioral.memento;

import java.util.Vector;

public class UndoBuffer {

    private final Vector<Memento> mementos = new Vector<>();

    private final Urheber urheber;

    UndoBuffer(Urheber urheber) {
        this.urheber = urheber;
    }

    void speichereZustand() {
        mementos.add(urheber.erzeugeMemento());
    }

    void rueckgaengigZustand(int i) {
        urheber.setzeMemento(mementos.get(i));
    }

}
