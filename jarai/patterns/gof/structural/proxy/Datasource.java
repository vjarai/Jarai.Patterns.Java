package jarai.patterns.gof.structural.proxy;


/**
 *
 */
public class Datasource {

    public String getResult(int key) {
        System.out.println("Datenbankabfrage ausgefuehrt.");
        return "Datensatz " + key;
    }

}
