package jarai.patterns.gof.structural.adapter.phone;

public class UsbToLightningAdapter extends AppleNetzteil {
    UsbNetzteil usbNetzteil;

    public UsbToLightningAdapter(UsbNetzteil usbNetzteil) {

        this.usbNetzteil = usbNetzteil;
    }

    @Override
    public int liefereStromViaLightning() {
        int strom = usbNetzteil.liefereStromViaUsb();
        System.out.println("UsbToLightningAdapter liefert Strom via Lightning: " + strom);
        return strom;

    }
}
