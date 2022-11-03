package jarai.patterns.excercises.iterator;

public class Application {

    public static void main(String[] args) {

        var myAdressbook = new Adressbook(
                new Contact[]{
                        new Contact("Donald", "Duck"),
                        new Contact("Daisy", "Duck")
                }
        );

        // Todo: Mit einer for each Schleife alle Adressen des Adressbooks anzeigen
        // for(var contact : myAdressbook)
        //    System.out.println(contact);
    }

}
