package coordinatecalc;

import java.util.ArrayList;
import java.util.List;

public class Line extends Shape {

    List<Point> points;

    public Line(List<Point> points) {
        this.points = points;
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

    @Override
    public List<Point> get() {
        return points;
    }
}
