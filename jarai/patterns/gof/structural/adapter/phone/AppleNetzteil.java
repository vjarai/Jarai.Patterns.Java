package jarai.patterns.gof.structural.adapter.phone;

public class AppleNetzteil {

    public int liefereStromViaLightning() {
        int strom = 1000;
        System.out.println("AppleNetzteil liefert Strom: " + strom);
        return strom;
    }
}
