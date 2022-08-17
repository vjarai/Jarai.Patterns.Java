/*
 * PlotterAdapter.java
 */

package structural.adapter;


public class PlotterAdapter extends Drucker {
     
    private int zeile = 0;
	private final Plotter plotter;

    public PlotterAdapter( Plotter plotter) {
        this.plotter = plotter;
    }
    
    void druckeText(String text) {
        plotter.plotte( ++ zeile, 0, text );
    }    
}
