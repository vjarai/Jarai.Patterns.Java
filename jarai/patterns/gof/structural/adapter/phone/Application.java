package jarai.patterns.gof.structural.adapter.phone;


public class Application {


    public Application() {
    }

    public static void main(String[] args) {


        var iphone = new AppleTelefon();
        var samsungPhone = new AndroidTelefon();

        var appleNetzteil = new AppleNetzteil();
        var usbNetzteil = new UsbNetzteil();

        iphone.aufladen(appleNetzteil);
        samsungPhone.aufladen(usbNetzteil);

        iphone.aufladen(new UsbToLightningAdapter(usbNetzteil));
        samsungPhone.aufladen(new LightToUsbingAdapter(appleNetzteil));

    }

}
