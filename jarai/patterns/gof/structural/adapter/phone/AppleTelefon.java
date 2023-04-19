package jarai.patterns.gof.structural.adapter.phone;

public class AppleTelefon {
    public void aufladen(AppleNetzteil netzteil) {
        System.out.println("AppleTelefon wird aufgeladen mit " + netzteil.liefereStromViaLightning() + " mA.");
    }
}
