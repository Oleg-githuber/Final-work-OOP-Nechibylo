package model;

public class ComplexNumber {
    double realNumber;
    double imageNumber;

    public ComplexNumber(double realNumber, double imageNumber) {
        this.realNumber = realNumber;
        this.imageNumber = imageNumber;
    }

    public double getRealNumber() {
        return realNumber;
    }

    public double getImageNumber() {
        return imageNumber;
    }

    public void setRealNumber(double realNumber) {
        this.realNumber = realNumber;
    }

    public void setImageNumber(double imageNumber) {
        this.imageNumber = imageNumber;
    }

    @Override
    public String toString() {
        String sign = (imageNumber < 0) ? "-" : "+";
        double secondNumber = Math.abs(imageNumber);
        return String.format("%.2f%s%.2fj", realNumber, sign, secondNumber);
    }
}
