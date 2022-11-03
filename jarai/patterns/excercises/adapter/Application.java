package jarai.patterns.excercises.adapter;

public class Application {

    public static void main(String[] args) {

        var androidDevice = new AndroidDevice();
        var appleDevice = new AppleDevice();
        var usbCharger = new UsbCharger();

        usbCharger.charge(androidDevice);

        // ToDo: Sorgen Sie dafür, dass das appleDevice mit dem usbCharger aufgeladen werden kann
        // Die Klassen UsbCharger, AppleDevice und AndroidDevice dürfen dafür NICHT geändert werden!

        // usbCharger.charge(appleDevice); // passt leider nicht ?????
    }

}
