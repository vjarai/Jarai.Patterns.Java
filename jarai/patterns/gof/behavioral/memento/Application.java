package jarai.patterns.gof.behavioral.memento;

public class Application {

    public static void main(String[] args) {

        Urheber urheber = new Urheber();
        UndoBuffer undoBuffer = new UndoBuffer(urheber);

        urheber.setzeZustand("Zustand0");
        urheber.zeigeZustand();
        undoBuffer.speichereZustand();

        urheber.setzeZustand("Zustand1");
        urheber.zeigeZustand();
        undoBuffer.speichereZustand();

        undoBuffer.rueckgaengigZustand(0);
        urheber.zeigeZustand();

        undoBuffer.rueckgaengigZustand(1);
        urheber.zeigeZustand();
    }
}
