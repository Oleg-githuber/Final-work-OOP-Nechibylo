package model;

public interface Calculable {
    Calculable sum(ComplexNumber argument);     // Сложение
    Calculable diff(ComplexNumber argument);    // Вычитание
    Calculable multiple(ComplexNumber argument);    // Умножение
    Calculable divide(ComplexNumber argument);      // Деление
    ComplexNumber getResult();
}
