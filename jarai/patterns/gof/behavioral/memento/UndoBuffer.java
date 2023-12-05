package jarai.patterns.gof.behavioral.memento;

import java.util.Vector;

public class UndoBuffer {

    private final Vector<Memento> mementos = new Vector<>();

    private final Editor editor;

    UndoBuffer(Editor editor) {
        this.editor = editor;
    }

    void save() {
        mementos.add(editor.createMemento());
    }

    void undo(int i) {
        editor.restoreMemento(mementos.get(i));
    }

}
