package behavioral.iterator;

//import java.util.Vector;

public class TestTreiber {

    static public void main(String[] arg) {
        Integer[] daten = {1, 2, 3, 4, 5};

        var i = new ArrayIterator(daten);

        while (i.hasNext())
            System.out.println("Eintrag: " + i.next());

    }
}
