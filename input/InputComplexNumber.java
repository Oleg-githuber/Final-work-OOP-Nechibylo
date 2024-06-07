package input;

import logger.CalcLogger;

import java.util.Scanner;

public class InputComplexNumber extends InputNumber{
    double imageNumber;

    public InputComplexNumber(Scanner scanner, CalcLogger logger) {
        inputRealNumber(scanner);
        //Logger logger = Logger.getLogger(InputComplexNumber.class.getName());
        logger.printLog(String.format("Введена действительная часть числа: %.2f", super.getRealNumber()));
        inputImageNumber(scanner);
        logger.printLog(String.format("Введена мнимая часть числа: %.2fj", imageNumber));
    }

    public void inputRealNumber(Scanner scanner) {
        while (true) {
            System.out.println("Введите действительную часть числа:");
            try {
                super.setRealNumber(Double.parseDouble(scanner.nextLine()));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели некорректное число.");
            }
        }
    }

    public void inputImageNumber(Scanner scanner) {
        while (true) {
            System.out.println("Введите мнимую часть числа:");
            try {
                setImageNumber(Double.parseDouble(scanner.nextLine()));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели некорректное число.");
            }
        }
    }

    public double getImageNumber() {
        return imageNumber;
    }

    public void setImageNumber(double imageNumber) {
        this.imageNumber = imageNumber;
    }
}
