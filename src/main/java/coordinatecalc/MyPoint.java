package coordinatecalc;

import java.util.Objects;

public class MyPoint {

    private int x;
    private int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint(String input) {
        String[] split = input.replaceAll("[()]", "").split(",");
        this.x = Integer.parseInt(split[0]);
        this.y = Integer.parseInt(split[1]);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyPoint)) return false;
        MyPoint myPoint = (MyPoint) o;
        return getX() == myPoint.getX() && getY() == myPoint.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }
}
