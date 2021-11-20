package coordinatecalc;

import java.util.ArrayList;
import java.util.List;

public abstract class ShapeFactory {

    public static Rectangle create(String input) {
        int dashCount = getDashCount(input);
        String[] pointArray = input.split("-");
        if (dashCount == 3) {
            return createRectangle(pointArray);
        }
        return null;
    }

    private static Rectangle createRectangle(String... pointArray) {
        List<Point> points = new ArrayList<>();
        for (String point : pointArray) {
            points.add(new Point(point));
        }
        return new Rectangle(points);
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
