package coordinatecalc;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {

    // { (10,10), (14,15) }
    public Shape(String... pointArray) {
        List<Point> points = new ArrayList<>();
        for (String point : pointArray) {
            points.add(new Point(point));
        }
    }
    abstract public List<Point> get();
}
