package jarai.patterns.gof.structural.adapter.phone;

public class LightningToUsbAdapter extends UsbNetzteil {

    private final AppleNetzteil appleNetzteil;

    public LightningToUsbAdapter(AppleNetzteil appleNetzteil) {

        this.appleNetzteil = appleNetzteil;
    }

    @Override
    public int liefereStromViaUsb() {

        int strom = appleNetzteil.liefereStromViaLightning();
        System.out.println("LightningToUsbAdapter liefert Strom via Usb: " + strom);
        return strom;
    }
}
