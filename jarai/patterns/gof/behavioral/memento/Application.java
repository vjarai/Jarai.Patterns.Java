package jarai.patterns.gof.behavioral.memento;

public class Application {

    public static void main(String[] args) {

        Editor editor = new Editor();
        UndoBuffer undoBuffer = new UndoBuffer(editor);

        editor.setText("Hallo");
        undoBuffer.save();
        editor.showText();

        editor.setText("Hallo Welt");
        undoBuffer.save();
        editor.showText();

        undoBuffer.undo(0);
        editor.showText();

        undoBuffer.undo(1);
        editor.showText();
    }
}
