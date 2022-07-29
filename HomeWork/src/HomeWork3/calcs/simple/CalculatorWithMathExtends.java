package HomeWork3.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator {
    //CalculatorWithOperator calculator;
    @Override
    public double pow(double number, int degree) {
        return Math.pow(number, degree);
    }

    @Override
    public double mySqrt(double number) {
        return Math.sqrt(number);
    }

    @Override
    public double module(double number) {
        return Math.abs(number);
    }
}