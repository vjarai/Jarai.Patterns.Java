package jarai.patterns.behavioral.iterator;

//import java.util.Vector;

public class Application {

    static public void main(String[] arg) {

        var container = new RecordContainer(new String[]{"Record1", "Record2", "Record3", "Record4", "Record5"});

        for (var iterator = container.iterator(); iterator.hasNext(); )
            System.out.println("Erste Schleife : " + iterator.next());

        for (var x : container)
            System.out.println("Zweite Schleife: " + x);
    }
}
