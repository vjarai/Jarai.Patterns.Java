package jarai.patterns.structural.bridge;

import java.util.Date;

public class InformationScreen extends Screen {


    /**
     * Creates a new <code>InformationScreen</code> object with the provided
     * <i>Implementor</i>.
     *
     * @param si the implementor to use
     */

    public InformationScreen(ScreenImplementation si) {
        super(si);
    }


    /**
     * Draws/prints the system time in a text box
     */

    public void drawInfo() {
        Date date = new Date();
        drawTextBox("Current system time: " + date);
    }
}
        