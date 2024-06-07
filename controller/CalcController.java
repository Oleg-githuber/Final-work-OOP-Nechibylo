package controller;

import enums.Operation;
import factory.iCalculableFactory;
import input.InputComplexNumber;
import logger.CalcLogger;
import model.Calculable;
import model.ComplexNumber;
import factory.CalculableFactory;
import view.ComplexCalcView;

import java.util.Scanner;
import java.util.logging.Logger;

public class CalcController implements Controller{
    private CalculableFactory calculableFactory;
    private Logger logger = Logger.getLogger(CalcController.class.getName());

    public void setCalculableFactory() {
        this.calculableFactory = new CalculableFactory();
    }

    @Override
    public Operation chooseOperation(Scanner scanner) {
        while (true) {
            String op = "";
            System.out.println("Введите символ арифметической операции (+, - , *, /, =)");
            op = scanner.nextLine();
            switch (op) {
                case "+":
                    logger.info("Выбрана операция сложения");
                    return Operation.sum;
                case "-":
                    logger.info("Выбрана операция вычитания");
                    return Operation.diff;
                case "*":
                    logger.info("Выбрана операция умножения");
                    return Operation.multiple;
                case "/":
                    logger.info("Выбрана операция деления");
                    return Operation.divide;
                case "=":
                    logger.info("Выбрана операция результата арифметического действия");
                    return Operation.equal;
                default:
                    System.out.println("Символ введён некорректно.");
                    logger.info("Символ введён некорректно.");
            }
        }
    }

    @Override
    public void run(Scanner scanner) {
        InputComplexNumber in = new InputComplexNumber(scanner);
        ComplexNumber primaryArgument = new ComplexNumber(in.getRealNumber(), in.getImageNumber());
        //logger.initLogger(String.format("Создано комплексное число: %s", primaryArgument));
        Calculable calculator = calculableFactory.create(primaryArgument);
        while (true) {
            Operation oper = chooseOperation(scanner);
            if (oper == Operation.equal) {
                new ComplexCalcView().printComplexNumber(primaryArgument);
                break;
            }
            InputComplexNumber in2 = new InputComplexNumber(scanner);
            //ComplexNumber argument2 = new ComplexNumber(in2.getRealNumber(), in2.getImageNumber());
            switch (oper) {
                case sum:
                    calculator.sum( new ComplexNumber(in2.getRealNumber(), in2.getImageNumber()));
                    break;
                case diff:
                    calculator.diff( new ComplexNumber(in2.getRealNumber(), in2.getImageNumber()));
                    break;
                case multiple:
                    calculator.multiple( new ComplexNumber(in2.getRealNumber(), in2.getImageNumber()));
                    break;
                case divide:
                    calculator.divide( new ComplexNumber(in2.getRealNumber(), in2.getImageNumber()));
                    break;
                default:
                    System.out.println("Введен некорректный символ");
            }

        }
    }

    @Override
    public iCalculableFactory getFactory() {
        return calculableFactory;
    }
}
