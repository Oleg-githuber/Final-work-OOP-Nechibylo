import controller.CalcController;
import input.InputComplexNumber;
import input.InputNumber;
import model.ComplexNumber;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcController controller = new CalcController();
        controller.setCalculableFactory();
        controller.run(scanner);
        scanner.close();
    }
}
