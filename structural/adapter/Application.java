/*
 * Application.java
 *
 * Created on 21. Maerz 2004, 17:08
 */

package structural.adapter;


public class Application {

    /**
     * Creates a new instance of Application
     */
    public Application() {
    }

    public static void main(String[] args) {

        var meinDrucker = new Drucker();
        var meinPlotter = new PdfCreator();

        var meinReport = new Report();

        System.out.println("Drucke Report auf dem Drucker...");
        meinReport.druckeReport(meinDrucker);


        System.out.println("Drucke Report auf Plotter...");

        // Geht NICHT: Ein Plotter ist kein Drucker!
        // meinReport.druckeReport( meinPlotter );   

        // Aufgabe: 
        // Erstellen Sie die Klasse PlotterAdapter, so dass
        // der Report auf dem Plotter ausgegeben werden kann.
        // Die Klassen Report, Drucker und Plotter duerfen NICHT veraendert werden.

        // Loesung: Durch PlotterAdapter kann ein Plotter als Drucker verwendet werden
        meinReport.druckeReport(new PdfCreatorToDruckerAdapter(meinPlotter));

    }

}
