package operation;

import model.ComplexNumber;

public class Multiple implements MathOperation{
    @Override
    public ComplexNumber operaion(ComplexNumber argument1, ComplexNumber argument2) {
        double primaryReal = argument1.getRealNumber();
        double real = argument2.getRealNumber();
        double primaryImage = argument1.getImageNumber();
        double image = argument2.getImageNumber();
        double newReal = primaryReal * real - primaryImage * image;
        double newImage = primaryReal * image + primaryImage * real;
        argument1.setRealNumber(newReal);
        argument1.setImageNumber(newImage);
        return argument1;
    }
}
