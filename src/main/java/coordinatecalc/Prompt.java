package coordinatecalc;

import java.util.Scanner;

import static java.lang.System.out;

public class Prompt {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        do {
            print();
            input = inputCoordinate(scanner);
            Line line = (Line) ShapeFactory.create(input);
            double distance = line.getDistance();
            out.println("두 점 사이 거리는 " + distance);
        } while (!input.equals("q"));
        scanner.close();
    }

    public String inputCoordinate(Scanner scanner) {
        return scanner.nextLine();
    }

    private void print() {
        out.println("좌표를 입력하세요.");
    }


}