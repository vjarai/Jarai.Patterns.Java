/*
 * PlotterAdapter.java
 */

package structural.adapter;


public class PlotterAdapter extends Drucker {

    private final Plotter plotter;
    private int zeile = 0;

    public PlotterAdapter(Plotter plotter) {
        this.plotter = plotter;
    }

    void druckeText(String text) {
        plotter.plotte(++zeile, 0, text);
    }
}
