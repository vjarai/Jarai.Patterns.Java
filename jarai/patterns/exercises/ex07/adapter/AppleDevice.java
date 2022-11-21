package jarai.patterns.exercises.ex07.adapter;

public class AppleDevice implements ILightningChargeable {

    @Override
    public void chargeViaLightning() {
        System.out.println("Charging Apple Device via Lightning");
    }
}


