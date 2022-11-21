package jarai.patterns.exercises.ex01.templateMethod;

/**
 * Übungsaufgabe Template Method:
 * Die Methode play() implementiert einen einfachen Spielalgorithmus.
 * Das konkrete Spiel muss durch Überschreiben der abstrakten Methoden realisiert werden.
 */
public abstract class Game {

    /**
     * Template Methode, implementiert einen einfachen Spielalgorithmus
     */
    public void play() {
        initialize();

        while (!isFinished()) {
            requestInput();
            showResponse();
        }

        showWinner();
    }

    /**
     * Wird einmalig beim Start des Spiels aufgerufen
     */
    protected abstract void initialize();

    /**
     * Liefert die Antwort auf den Zug des menschlichen Spielers
     */
    protected abstract void showResponse();

    /**
     * Fragt den Zug des menschlichen Spielers ab
     */
    protected abstract void requestInput();

    /**
     * Zeigt beim Spielende an, wer gewonnen hat
     */
    protected abstract void showWinner();

    /**
     * Liefert true, wenn das Spiel vom Spieler gewonnen wurde
     * oder wenn die maximal Anzahl Züge überschritten wurde
     */
    protected abstract boolean isFinished();

}
