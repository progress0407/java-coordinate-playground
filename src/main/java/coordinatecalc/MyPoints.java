package coordinatecalc;

import java.util.ArrayList;
import java.util.List;

public class MyPoints {
    List<MyPoint> myPoints;

    public MyPoints(List<MyPoint> myPoints) {
        this.myPoints = myPoints;
    }

    public MyPoints(String... pointArray) {
        myPoints = new ArrayList<>();
        for (String point : pointArray) {
            myPoints.add(new MyPoint(point));
        }
    }

    public List<MyPoint> get() {
        return myPoints;
    }
}
