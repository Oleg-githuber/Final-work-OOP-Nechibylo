package factory;

import model.Calculable;
import model.ComplexNumber;

public interface iCalculableFactory {
    Calculable create (ComplexNumber primaryArgument);
}
