package coordinatecalc;

import java.util.ArrayList;
import java.util.List;

public class Points {
    List<Point> points;

    // [(10,10), (14,15)]
    public Points(List<Point> points) {
        this.points = points;
    }

    // {(10,10), (14,15)}
    public Points(String... pointArray) {
        points = new ArrayList<>();
        for (String point : pointArray) {
            points.add(new Point(point));
        }
    }

    // (10,10)-(14,15)
    public static Points create(String input) {
        return new Points(input.split("-"));
    }

    public List<Point> get() {
        return points;
    }

    public double getDistance() {
        Point a = points.get(0);
        Point b = points.get(1);
        return getDistance(a, b);
    }

    public static double getDistance(Point a, Point b) {
        int xDifference = a.getX() - b.getX();
        int yDifference = a.getY() - b.getY();

        return Math.sqrt(Math.pow(xDifference, 2) + Math.pow(yDifference, 2));
    }
}
