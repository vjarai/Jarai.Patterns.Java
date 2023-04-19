package jarai.patterns.gof.structural.adapter.phone;

public class LightToUsbingAdapter extends UsbNetzteil {

    private final AppleNetzteil appleNetzteil;

    public LightToUsbingAdapter(AppleNetzteil appleNetzteil) {

        this.appleNetzteil = appleNetzteil;
    }

    @Override
    public int liefereStromViaUsb() {
        return appleNetzteil.liefereStromViaLightning();
    }
}
