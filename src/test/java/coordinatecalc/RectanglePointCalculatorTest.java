package coordinatecalc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RectanglePointCalculatorTest {

    String input;
    Shape shape;

    @BeforeEach
    void setUp() {
        input = "(10,10)-(22,10)-(22,18)-(10,18)";
        shape = ShapeFactory.create(input);
    }

    @Test
    @DisplayName("점 4개를 입력 받는다")
    void 점입력_정상() {
        List<Point> pointList = shape.get();
        assertThat(pointList).containsExactly(
                new Point(10, 10),
                new Point(22, 10),
                new Point(22, 18),
                new Point(10, 18)
        );
    }
    
    @Test
    @DisplayName("사각형: 점 4개에 대한 면적을 계산한다")
    void 사각형_면적() {
        Rectangle rectangle = (Rectangle) this.shape;
        int area = rectangle.getArea();
        assertThat(area).isEqualTo(96);
    }
}
