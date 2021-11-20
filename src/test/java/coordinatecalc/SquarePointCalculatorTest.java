package coordinatecalc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SquarePointCalculatorTest {

    @Test
    @DisplayName("점 4개를 입력 받는다: 정상")
    void 점입력_정상() {
        String input = "(10,10)-(22,10)-(22,18)-(10,18)";
        Rectangle rectangle = (Rectangle) ShapeFactory.create(input);
        List<Point> pointList = rectangle.get();
        assertThat(pointList).containsExactly(
                new Point(10, 10),
                new Point(22, 10),
                new Point(22, 18),
                new Point(10, 18)
        );
    }

    @Test
    @DisplayName("점 4개를 입력 받는다: 예외")
    void 점입력_예외() {

    }
}
