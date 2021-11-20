package coordinatecalc;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class Triangle extends Shape {

    List<Point> points;
    List<Double> sides;

    public Triangle(List<Point> points) {
        this.points = points;
    }

    @Override
    public List<Point> get() {
        return points;
    }

    public List<Double> getTriangleSides() {
        sides = new ArrayList<>();
        sides.add(calcSide(0, 1));
        sides.add(calcSide(1, 2));
        sides.add(calcSide(2, 0));
        return sides;
    }

    private double calcSide(int a, int b) {
        int sideX = Math.abs(points.get(a).getX() - points.get(b).getX());
        int sideY = Math.abs(points.get(a).getY() - points.get(b).getY());
        return Math.sqrt(Math.pow(sideX, 2) + Math.pow(sideY, 2));
    }

    public double getArea() {
        getTriangleSides();
        double a = sides.get(0);
        double b = sides.get(1);
        double c = sides.get(2);
        double s = (a + b + c) / 2;
        double S = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return S;
    }

    @Override
    public void printProcessedValue() {
        out.println("삼각형 넓이는 " + getArea());
    }
}
