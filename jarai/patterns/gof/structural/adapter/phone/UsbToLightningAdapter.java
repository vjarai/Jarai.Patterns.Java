package jarai.patterns.gof.structural.adapter.phone;

public class UsbToLightningAdapter extends AppleNetzteil {
    UsbNetzteil usbNetzteil;

    public UsbToLightningAdapter(UsbNetzteil usbNetzteil) {

        this.usbNetzteil = usbNetzteil;
    }

    @Override
    public int liefereStromViaLightning() {
        return usbNetzteil.liefereStromViaUsb();

    }
}
