package jarai.patterns.gof.behavioral.iterator;

public class Application {

    static public void main(String[] arg) {

        var container = new IterableContainer(new String[]{"Record1", "Record2", "Record3", "Record4", "Record5"});

        System.out.println("Erste Schleife  ************** ");

        for (var item : container)
            System.out.println(item);

        System.out.println("Zweite Schleife ************** ");

        for (var iterator = container.iterator(); iterator.hasNext(); )
            System.out.println(iterator.next());


    }
}
