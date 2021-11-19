package coordinatecalc;

public class PolygonCalculator {

    public static double getDistance(MyPoint a, MyPoint b) {
        int xDifference = a.getX() - b.getX();
        int yDifference = a.getY() - b.getY();

        return Math.sqrt(Math.pow(xDifference, 2) + Math.pow(yDifference, 2));
    }
}
