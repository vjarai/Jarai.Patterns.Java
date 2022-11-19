package jarai.patterns.gof.structural.decorator;

public class Application {


    public static void main(String[] args) {

        var baum = new Weihnachtsbaum();
        var baumMitLametta = new LamettaDecorator(baum);
        var baumMitKerzen = new KerzenDecorator(baumMitLametta);
        var baumMitLichterkette = new LichterkettenDecorator(baumMitKerzen);

        baumMitKerzen.anzuenden();
        //baumMitLichterkette.einschalten();

        baumMitLichterkette.show();
        System.out.println(".");
    }
}