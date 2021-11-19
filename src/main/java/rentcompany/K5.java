package rentcompany;

public class K5 extends Car {

    private static final double distancePerLiter = 13;
    private final double tripDistance;

    public K5(double tripDistance) {
        this.tripDistance = tripDistance;
    }

    @Override
    double getDistancePerLiter() {
        return 0;
    }

    @Override
    double getTripDistance() {
        return 0;
    }

    @Override
    String getName() {
        return null;
    }

    @Override
    double getChargeQuantity() {
        return super.getChargeQuantity();
    }
}
