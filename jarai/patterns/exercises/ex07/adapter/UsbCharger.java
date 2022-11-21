package jarai.patterns.exercises.ex07.adapter;

public class UsbCharger {

    public void charge(IUsbChargeable device) {
        System.out.println("USB Charger delivers current to USB connector.");
        device.chargeViaUsb();
    }

}
