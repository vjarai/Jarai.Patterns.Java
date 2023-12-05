package jarai.patterns.gof.structural.adapter.phone;

public class UsbNetzteil {
    public int liefereStromViaUsb() {
        int strom = 500;
        System.out.println("UsbNetzteil liefert Strom: " + strom);
        return strom;
    }
}
