package model;

public class ComplexCalculator implements Calculable{
    private ComplexNumber primaryArgument;

    public ComplexCalculator(ComplexNumber primaryArgument) {
        this.primaryArgument = primaryArgument;
    }

    @Override
    public Calculable sum(ComplexNumber argument) {
        this.primaryArgument.setRealNumber(this.primaryArgument.getRealNumber() + argument.getRealNumber());
        this.primaryArgument.setImageNumber(this.primaryArgument.getImageNumber() + argument.getImageNumber());
        return this;
    }

    @Override
    public Calculable diff(ComplexNumber argument) {
        this.primaryArgument.setRealNumber(this.primaryArgument.getRealNumber() - argument.getRealNumber());
        this.primaryArgument.setImageNumber(this.primaryArgument.getImageNumber() - argument.getImageNumber());
        return this;
    }

    @Override
    public Calculable multiple(ComplexNumber argument) {
        double primaryReal = this.primaryArgument.getRealNumber();
        double real = argument.getRealNumber();
        double primaryImage = this.primaryArgument.getImageNumber();
        double image = argument.getImageNumber();
        double newReal = primaryReal * real - primaryImage * image;
        double newImage = primaryReal * image + primaryImage * real;
        this.primaryArgument.setRealNumber(newReal);
        this.primaryArgument.setImageNumber(newImage);
        return this;
    }

    @Override
    public Calculable divide(ComplexNumber argument) {
        double denum = Math.pow(argument.getRealNumber(), 2) - Math.pow(argument.getImageNumber(), 2);
        argument.setImageNumber(argument.getImageNumber() * (-1));
        multiple(argument);
        try {
            this.primaryArgument.setRealNumber(this.primaryArgument.getRealNumber() / denum);
            this.primaryArgument.setImageNumber(this.primaryArgument.getImageNumber() / denum);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        }
        return this;
    }

    @Override
    public ComplexNumber getResult() {
        return this.primaryArgument;
    }
}
