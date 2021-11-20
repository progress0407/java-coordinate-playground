package coordinatecalc;

import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class Prompt {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            print();
            inputCoordinate(scanner);
        }
    }

    public void inputCoordinate(Scanner scanner) {
        String input = scanner.nextLine();
        input.split("-");
    }

    private void print() {
        out.println("좌표를 입력하세요.");
    }

    public List<MyPoint> convertPoints(String input) {
        String[] pointArray = input.split("-");
        MyPoints myPoints = new MyPoints(pointArray);
        List<MyPoint> pointList = myPoints.get();
        return pointList;
    }
}