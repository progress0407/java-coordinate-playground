package coordinate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FigureFactory {

    private static final Map<Integer, Function<List<Point>, AbstractFigure>> figureMap;

    static {
        figureMap = new HashMap<>();
        figureMap.put(Line.LINE_POINT_SIZE, Line::new);
        figureMap.put(Triangle.TRIANGLE_POINT_SIZE, Triangle::new);
        figureMap.put(Rectangle.RECTANGLE_POINT_SIZE, Rectangle::new);
    }

    private static void initFigures(List<Point> points) {
        Map<Integer, AbstractFigure> oldFigureMap = new HashMap<>();
        oldFigureMap.put(Line.LINE_POINT_SIZE, new Line(points));
        oldFigureMap.put(Triangle.TRIANGLE_POINT_SIZE, new Triangle(points));
        oldFigureMap.put(Rectangle.RECTANGLE_POINT_SIZE, new Rectangle(points));
    }

    static Figure getInstance(List<Point> points) {
//        initFigures(points);
//        AbstractFigure figure = oldFigureMap.get(points.size());
        AbstractFigure figure = figureMap.get(points.size()).apply(points);
        if (figure != null) {
            return figure;
        }
        throw new IllegalArgumentException("유효하지 않은 도형입니다.");
    }
}
