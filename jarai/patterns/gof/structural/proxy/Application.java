package jarai.patterns.gof.structural.proxy;


public class Application {

    public static void main(String[] args) {

        var datasource = new Datasource();
        var proxy = new CachingDatasourceProxy(datasource);

        //var myDatasource = datasource;
        var myDatasource = proxy;    // Proxy kann statt Datenbank verwendet werden

        try {
            String result = myDatasource.getResult(500);
            System.out.println("Ergebnis: " + result);

            // Daten werden beim zweiten Abruf ggf. aus dem Cache geliefert
            result = myDatasource.getResult(500);
            System.out.println("Ergebnis: " + result);

            // Zugriff auf "vertrauliche" Daten:
            result = myDatasource.getResult(0);
            System.out.println("Ergebnis: " + result);

        } catch (NotAuthorizedException e) {
            System.out.println("Fehler: " + e.getMessage());
        }

    }
}
