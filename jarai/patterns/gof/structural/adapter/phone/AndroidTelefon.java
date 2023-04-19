package jarai.patterns.gof.structural.adapter.phone;

public class AndroidTelefon {

    public void aufladen(UsbNetzteil netzteil) {
        System.out.println("AndroidTelefon wird aufgeladen mit " + netzteil.liefereStromViaUsb() + " mA.");
    }
}
