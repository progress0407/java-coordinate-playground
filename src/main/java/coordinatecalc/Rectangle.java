package coordinatecalc;

import java.util.ArrayList;
import java.util.List;

public class Rectangle {

    List<Point> points;

    public Rectangle(List<Point> points) {
        this.points = points;
    }

    public List<Point> get() {
        return points;
    }
}
