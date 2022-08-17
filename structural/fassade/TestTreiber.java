/*
 * Created on 28.03.2004
 *
 */
package structural.fassade;

import java.io.IOException;

/**
 * @author Viktor
 *
 */
public class TestTreiber {

	public static void main(String[] args) throws IOException {
		
		int x = ReaderFassade.eingebenInteger("x eingeben:");
		
		System.out.println("wert von x: " + x);
	}
}
