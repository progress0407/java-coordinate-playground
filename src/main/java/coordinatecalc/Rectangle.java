package coordinatecalc;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class Rectangle extends Shape {

    List<Point> points;

    public Rectangle(List<Point> points) {
        this.points = points;
    }

    public int getArea() {
        Point point = points.get(0);
        int x0 = point.getX();
        int y0 = point.getY();

        int x1 = 0;
        int y1 = 0;
        for (int i = 1; i < points.size(); i++) {
            Point pointIterating = points.get(i);
            int xIterating = pointIterating.getX();
            int yIterating = pointIterating.getY();
            if (x0 != xIterating) {
                x1 = xIterating;
            }
            if (y0 != yIterating) {
                y1 = yIterating;
            }
        }

        int dx = Math.abs(x0 - x1);
        int dy = Math.abs(y0 - y1);
        return dx * dy;
    }

    @Override
    public List<Point> get() {
        return points;
    }

    @Override
    public void printProcessedValue() {
        out.println("사각형 넓이는 " + getArea());
    }
}
