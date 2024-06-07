package operation;

import model.ComplexNumber;

public class Sum implements MathOperation {
    @Override
    public ComplexNumber operaion(ComplexNumber argument1, ComplexNumber argument2) {
        argument1.setRealNumber(argument1.getRealNumber() + argument2.getRealNumber());
        argument1.setImageNumber(argument1.getImageNumber() + argument2.getImageNumber());
        return argument1;
    }
}
