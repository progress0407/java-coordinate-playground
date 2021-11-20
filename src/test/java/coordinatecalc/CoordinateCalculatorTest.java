package coordinatecalc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class CoordinateCalculatorTest {

    @Test
    @DisplayName("점을 입력 받는다")
    void 점_입력() {
        MyPoint myPoint = new MyPoint(3, 1);
        int x = myPoint.getX();
        int y = myPoint.getY();
        assertThat(x).isEqualTo(3);
        assertThat(y).isEqualTo(1);
    }

    @Test
    @DisplayName("두 점 사이의 거리를 계산한다")
    void 거리계산() {
        MyPoint a = new MyPoint(10, 10);
        MyPoint b = new MyPoint(14, 15);
        double distance = PolygonCalculator.getDistance(a, b);
        assertThat(distance).isEqualTo(6.403, offset(0.0009));
    }

    @Test
    @DisplayName("문자열이 두 점이 된다")
    void 문자열이_두점() {
        String input = "(10,10)-(14,15)";
        // inputCoordinate
        Prompt prompt = new Prompt();
        List<MyPoint> pointList = prompt.convertPoints(input);
        assertThat(pointList).containsExactly(new MyPoint(10, 10), new MyPoint(14, 15));
    }

}
