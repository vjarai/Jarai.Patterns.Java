package behavioral.iterator;

//import java.util.Vector;
import java.util.LinkedList;

public class TestTreiber {

public static void main(String[] args) {
	
	// Daten in einem vector speichern
	//Vector daten = new Vector();
	
	// Daten in einer verketteten Liste speichern
	LinkedList<Integer> daten = new LinkedList<>();
	
	daten.add(10);
	daten.add( 100);
	daten.add(200);
	daten.add(50);
	
	// Ein Iterator bietet container unabhängigen Zugriff auf die Daten

	for (Integer integer : daten) {
		System.out.println(integer);
	}
}
}
