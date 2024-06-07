package operation;

import model.ComplexNumber;

public class Divide implements MathOperation{
    @Override
    public ComplexNumber operaion(ComplexNumber argument1, ComplexNumber argument2) {
        double denum = Math.pow(argument2.getRealNumber(), 2) - Math.pow(argument2.getImageNumber(), 2);
        try {
            argument1.setRealNumber(argument1.getRealNumber() / denum);
            argument1.setImageNumber(argument1.getImageNumber() / denum);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        }
        return argument1;
    }
}
