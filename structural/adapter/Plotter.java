/*
 * Plotter.java
 *
 * Created on 21. Maerz 2004, 17:08
 */

package structural.adapter;

public class Plotter {

    /**
     * Creates a new instance of Plotter
     */
    public Plotter() {
    }

    void plotte(int x, int y, String text) {
        System.out.println("Plotte: " + text);
    }

}
