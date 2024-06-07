package input;

import java.util.Scanner;

public class InputNumber {
    private double realNumber;
    public void inputNumber(Scanner scanner) {
        while (true) {
            System.out.println("Введите действительное число:");
            try {
                realNumber = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                continue;
            }
        }
    }

    public double getRealNumber() {
        return realNumber;
    }

    public void setRealNumber(double realNumber) {
        this.realNumber = realNumber;
    }
}
