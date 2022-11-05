package jarai.patterns.gof.structural.bridge;

import java.util.Date;

public class InformationScreen extends Screen {


    public InformationScreen(ScreenImplementation si) {
        super(si);
    }


    public void drawInfo() {
        Date date = new Date();
        drawTextBox("Current system time: " + date);
    }
}
        