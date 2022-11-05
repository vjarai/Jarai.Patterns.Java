package jarai.patterns.gof.structural.bridge;

public abstract class Screen {

        private final ScreenImplementation implementor;


    public Screen(ScreenImplementation implementor) {
        this.implementor = implementor;
    }


    public void drawText(String text) {
        implementor.printText(text);
        implementor.printLine();
    }


    public void drawTextBox(String text) {

        int length = text.length();

        for (int i = 0; i < length + 4; i++) {
            implementor.printDecor();
        }

        implementor.printLine();
        implementor.printDecor();
        implementor.printText(" " + text + " ");
        implementor.printDecor();
        implementor.printLine();

        for (int i = 0; i < length + 4; i++) {
            implementor.printDecor();
        }

        implementor.printLine();
    }
}
        