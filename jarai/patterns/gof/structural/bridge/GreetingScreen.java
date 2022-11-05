package jarai.patterns.gof.structural.bridge;

public class GreetingScreen extends Screen {


    public GreetingScreen(ScreenImplementation si) {
        super(si);
    }


    public void drawGreeting() {
        drawTextBox("Greetings!");
    }
}

    