package jarai.patterns.gof.structural.proxy;


import java.util.Hashtable;

public class CachingDatasourceProxy extends Datasource {

    private final Datasource datasource;
    private final Hashtable<Integer, String> cache = new Hashtable<>();

    CachingDatasourceProxy(Datasource datasource) {

        this.datasource = datasource;
    }

    public String getResult(int key) {

        String result;

        // Proxy kann Zugriff auf bestimmte Daten einschränken
        if (key <= 100) {
            throw new NotAuthorizedException("Autorisierung erforderlich.");
        }

        // Proxy erspart zeitaufwaendigen Datebankzugriff, wenn Daten im Cache vorhanden
        if (cache.containsKey(key)) {
            System.out.println("Daten aus dem Cache abgerufen.");
            result = cache.get(key);
        } else {
            result = datasource.getResult(key);
            cache.put(key, result);
        }

        return result;
    }


}

