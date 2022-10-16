/*
 * Created on 28.03.2004
 *
 */
package structural.fassade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReaderFassade {

    public static int eingebenInteger(String meldung) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println(meldung);
        int eingabe = Integer.parseInt(br.readLine());

        return eingabe;
    }

}
