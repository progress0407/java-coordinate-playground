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
            Shape shape =  ShapeFactory.create(input);
            shape.printProcessedValue();
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