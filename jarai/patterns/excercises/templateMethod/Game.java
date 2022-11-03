package jarai.patterns.excercises.templateMethod;

public abstract class Game {

    public void run() {
        initialize();

        while (!isFinished()) {
            requestInput();
            showResponse();
        }

        showWinner();
    }

    protected abstract void initialize();

    protected abstract void showResponse();

    protected abstract void requestInput();

    protected abstract void showWinner();

    protected abstract boolean isFinished();

}
