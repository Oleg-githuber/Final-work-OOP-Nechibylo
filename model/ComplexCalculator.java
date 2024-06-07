package model;

import operation.Diff;
import operation.Divide;
import operation.Multiple;
import operation.Sum;

public class ComplexCalculator implements Calculable{
    private ComplexNumber primaryArgument;

    public ComplexCalculator(ComplexNumber primaryArgument) {
        this.primaryArgument = primaryArgument;
    }

    @Override
    public Calculable sum(ComplexNumber argument) {
        this.primaryArgument = new Sum().operaion(this.primaryArgument, argument);
        return this;
    }

    @Override
    public Calculable diff(ComplexNumber argument) {
        this.primaryArgument = new Diff().operaion(this.primaryArgument, argument);
        return this;
    }

    @Override
    public Calculable multiple(ComplexNumber argument) {
        this.primaryArgument = new Multiple().operaion(this.primaryArgument, argument);
        return this;
    }

    @Override
    public Calculable divide(ComplexNumber argument) {
        double denum = Math.pow(argument.getRealNumber(), 2) - Math.pow(argument.getImageNumber(), 2);
        ComplexNumber argument2 = new ComplexNumber(argument.getRealNumber(), argument.getImageNumber() * -1);
        this.primaryArgument = new Divide().operaion(new Multiple().operaion(this.primaryArgument, argument2), argument);
        return this;
    }

    @Override
    public ComplexNumber getResult() {
        return this.primaryArgument;
    }
}
