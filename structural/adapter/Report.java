/*
 * Created on 21.03.2004
 *
 */
package structural.adapter;


public class Report {

    public Report() {
    }

    void druckeReport(Drucker drucker) {
        for (int i = 0; i < 10; i++)
            drucker.druckeText("Dies ist Zeile " + i);
    }

}
