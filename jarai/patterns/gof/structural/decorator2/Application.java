package jarai.patterns.gof.structural.decorator2;

public class Application {


    public static void main(String[] args) {

        Weihnachtsbaum baum = new Weihnachtsbaum();
        LamettaDecorator baumMitLametta = new LamettaDecorator(baum);
        KerzenDecorator baumMitKerzen = new KerzenDecorator(baumMitLametta);
        LichterkettenDecorator baumMitLichterkette = new LichterkettenDecorator(baumMitKerzen);

        baumMitKerzen.anzuenden();
        //baumMitLichterkette.einschalten();

        baumMitLichterkette.show();
        System.out.println(".");
    }
}