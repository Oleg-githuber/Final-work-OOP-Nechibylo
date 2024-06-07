package factory;

import model.Calculable;
import model.ComplexCalculator;
import model.ComplexNumber;

public class CalculableFactory implements iCalculableFactory{
    @Override
    public Calculable create(ComplexNumber primaryArgument) {
        return new ComplexCalculator(primaryArgument);
    }
}
