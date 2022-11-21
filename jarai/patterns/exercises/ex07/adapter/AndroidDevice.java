package jarai.patterns.exercises.ex07.adapter;

public class AndroidDevice implements IUsbChargeable {

    @Override
    public void chargeViaUsb() {
        System.out.println("Charging Android Device via USB");
    }
}
