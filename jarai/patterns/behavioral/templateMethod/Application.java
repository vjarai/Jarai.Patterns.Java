
package jarai.patterns.behavioral.templateMethod;


public class Application {

    public static void main(String[] args) {

        Anwendung anwendung;

        // Die Anwendung als Consolenanwendung starten
        anwendung = new ConsolenAnwendung();
        anwendung.schablonenMethode();

        // Die gleiche Anwendung als Guianwendung starten
        anwendung = new GuiAnwendung();
        anwendung.schablonenMethode();
    }
}
