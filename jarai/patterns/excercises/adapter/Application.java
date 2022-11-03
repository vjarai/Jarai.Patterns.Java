package jarai.patterns.excercises.adapter;

public class Application {

    public static void main(String[] args) {

        var androidDevice = new AndroidDevice();
        var appleDevice = new AppleDevice();
        var usbCharger = new UsbCharger();

        usbCharger.charge(androidDevice);

        // ToDo: Sorgen Sie daf�r, dass das appleDevice mit dem usbCharger aufgeladen werden kann
        // Die Klassen UsbCharger, AppleDevice und AndroidDevice d�rfen daf�r NICHT ge�ndert werden!

        // usbCharger.charge(appleDevice); // passt leider nicht ?????
    }

}
