package rentcompany;

public class Avante extends Car {

    private static final double distancePerLiter = 15;
    private final double tripDistance;

    public Avante(double tripDistance) {
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
