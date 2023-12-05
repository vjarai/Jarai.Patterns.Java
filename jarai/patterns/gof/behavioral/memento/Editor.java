package jarai.patterns.gof.behavioral.memento;

public class Editor {

    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public Memento createMemento() {
        return new Memento(text);
    }

    public void restoreMemento(Memento memento) {
        text = memento.getText();
    }

    public void showText() {
        System.out.println(text);
    }

}
