package jarai.patterns.excercises.adapter;

public class AppleDevice implements ILightningChargeable {

    @Override
    public void chargeViaLightning() {
        System.out.println("Charging Apple Device via Lightning");
    }
}


