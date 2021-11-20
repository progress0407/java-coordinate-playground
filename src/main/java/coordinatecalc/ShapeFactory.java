package coordinatecalc;

import java.util.ArrayList;
import java.util.List;

public class ShapeFactory {

    public static Shape create(String input) {
        int dashCount = getDashCount(input);
        String[] pointArray = input.split("-");
        List<Point> points = createPoints(pointArray);
        if (dashCount == 3) {
            return new Rectangle(points);
        }
        if (dashCount == 1) {
            return new Line(points);
        }
        return null;
    }

    private static List<Point> createPoints(String... pointArray) {
        List<Point> points = new ArrayList<>();
        for (String point : pointArray) {
            points.add(new Point(point));
        }
        return points;
    }

    private static int getDashCount(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == '-') {
                count++;
            }
        }
        return count;
    }
}
