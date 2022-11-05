package jarai.patterns.gof.structural.decorator;

public class Application {


    public static void main(String[] args) {

        var baum = new Weihnachtsbaum();
        var baumMitLametta = new Lametta(baum);
        var baumMitKerzen = new Kerzen(baumMitLametta);
        var baumMitLichterkette = new Lichterkette(baumMitKerzen);

        baumMitKerzen.anzuenden();
        //baumMitLichterkette.einschalten();

        baumMitLichterkette.print();
        System.out.println(".");
    }
}