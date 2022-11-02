
package jarai.patterns.creational.singleton;


public class Application {

    public static void main(String[] args) {

        var instance1 = Singleton.getInstance();
        var instance2 = Singleton.getInstance();

        if (instance1 == instance2) {
            System.out.println("Everything is fine!");
        } else {
            System.out.println("Houston, we have a problem!");
        }


    }
}
