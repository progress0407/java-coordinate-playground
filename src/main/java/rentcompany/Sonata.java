package rentcompany;

public class Sonata extends Car{

    private static final double distancePerLiter = 10;
    private final double tripDistance;

    public Sonata(double tripDistance) {
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
