package controller;

import enums.Operation;
import factory.iCalculableFactory;
import factory.iCalculableFactory;

import java.util.Scanner;

public interface Controller {
    Operation chooseOperation(Scanner scanner);
    void run(Scanner scanner);
    iCalculableFactory getFactory();
}
