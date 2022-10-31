/*
 * PlotterAdapter.java
 */

package structural.adapter;


public class PdfCreatorToDruckerAdapter extends Drucker {

    private final PdfCreator pdfCreator;

    public PdfCreatorToDruckerAdapter(PdfCreator pdfCreator) {
        this.pdfCreator = pdfCreator;
    }

    void druckeText(String text) {
        pdfCreator.createPdf(text);
    }
}
