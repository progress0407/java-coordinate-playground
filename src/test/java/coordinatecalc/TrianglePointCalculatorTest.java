package coordinatecalc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrianglePointCalculatorTest {

    String input;
    Shape shape;
    Triangle triangle;

    @BeforeEach
    void setUp() {
        input = "(10,10)-(14,15)-(20,8)";
        shape = ShapeFactory.create(input);
        triangle = (Triangle) shape;
    }

    @Test
    @DisplayName("문자열을 입력받아 점 세개로 바꾼다")
    void 문자열을_점세개로() {
        List<Point> pointList = shape.get();
        assertThat(pointList).containsExactly(
                new Point(10, 10),
                new Point(14, 15),
                new Point(20, 8)
        );
    }

    @Test
    @DisplayName("삼각형의 각 변의 길이를 구한다")
    void 삼각형_각변의_길이() {
        List<Double> sides = triangle.getTriangleSides();
        sides = sides.stream().map(e -> Math.floor(e * 1000) / 1000.0).collect(Collectors.toList());
        assertThat(sides).contains(6.403, 10.198, 9.219);
    }

    @Test
    @DisplayName("삼각형의 면적 구한다")
    void 삼각형의_면적() {
        double area = triangle.getArea();
        assertEquals(area, 28.9, 0.1);
    }
}
