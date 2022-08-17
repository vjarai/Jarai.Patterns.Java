package structural.brücke;
 
public class GreetingScreen extends Screen {
    
    /** 
     * Creates a new <code>GreetingScreen</code> object with the provided
     * <i>Implementor</i>.
     *
     * @param si the implementor to use
     */       

    public GreetingScreen(ScreenImplementation si) {
        super(si);
    }
    
    /**
     * Draws/prints a greeting in a text box
     */

    public void drawGreeting() {
        drawTextBox("Greetings!");
    }
}

    