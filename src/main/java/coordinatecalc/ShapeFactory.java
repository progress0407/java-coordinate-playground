package coordinatecalc;

import java.util.ArrayList;
import java.util.List;

public class ShapeFactory {

    public static Shape create(String input) {
        int dashCount = getDashCount(input);
        List<Point> points = createPoints(input);
        if (dashCount == 3) {
            return new Rectangle(points);
        }
        if (dashCount == 2) {
            return new Triangle(points);
        }
        if (dashCount == 1) {
            return new Line(points);
        }
        throw new RuntimeException("점의 갯수는 2 ~ 4개만 허용합니다.");
    }

    private static List<Point> createPoints(String input) {
        String[] pointArray = input.split("-");
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
