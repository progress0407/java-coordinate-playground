package coordinatecalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinePointCalculatorTest {

    @Test
    @DisplayName("점을 입력 받는다")
    void 점_입력() {
        Point point = new Point(3, 1);
        int x = point.getX();
        int y = point.getY();
        assertThat(x).isEqualTo(3);
        assertThat(y).isEqualTo(1);
    }

    @Test
    @DisplayName("두 점 사이의 거리를 계산한다")
    void 거리계산() {
        Point a = new Point(10, 10);
        Point b = new Point(14, 15);
        double distance = Line.getDistance(a, b);
        assertThat(distance).isEqualTo(6.403, offset(0.0009));
    }

    @Test
    @DisplayName("문자열이 두 점이 된다")
    void 문자열이_두점() {
        String input = "(10,10)-(14,15)";
        Line line = (Line) ShapeFactory.create(input);
        List<Point> pointList = line.get();
        assertThat(pointList).containsExactly(new Point(10, 10), new Point(14, 15));
    }

    @Test
    @DisplayName("두점을 입력받아 거리를 계산한다")
    void 입력후_두점_거리계산() {
        String input = "(10,10)-(14,15)";
        Line line = (Line) ShapeFactory.create(input);
        double distance = line.getDistance();
        assertEquals(6.403, distance, 0.001);
    }
}
