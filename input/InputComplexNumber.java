package input;

import logger.CalcLogger;

import java.util.Scanner;
import java.util.logging.Logger;

public class InputComplexNumber extends InputNumber{
    double imageNumber;

    public InputComplexNumber(Scanner scanner) {
        inputRealNumber(scanner);
        Logger logger = Logger.getLogger(InputComplexNumber.class.getName());
        logger.info(String.format("Введена действительная часть числа: %f", super.getRealNumber()));
        inputImageNumber(scanner);
        logger.info(String.format("Введена мнимая часть числа: %fj", imageNumber));
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
