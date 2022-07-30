package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation {
    private final CalculatorWithMathCopy calculator;
    private long count;

    CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calculator) {
        this.calculator = calculator;
    }

    public double division(double divisible, double divisor) {
        incrementCountOperation();
        return calculator.division(divisible,divisor);
    }

    public double multiplier(double first_num, double second_num) {
        incrementCountOperation();
        return calculator.multiplier(first_num, second_num);
    }

    public double sum(double first_summand, double second_summand) {
        incrementCountOperation();
        return calculator.sum(first_summand,second_summand);
    }

    public double difference(double reduced, double subtractible) {
        incrementCountOperation();
        return calculator.difference(reduced,subtractible);
    }

    public double pow(double number, int degree){
        incrementCountOperation();
        return calculator.pow(number,degree);
    }

    public double module(double number){
        incrementCountOperation();
        return calculator.module(number);
    }

    public double mySqrt(double number){
        incrementCountOperation();
        return calculator.mySqrt(number);
    }

    public long getCountOperation(){

        return count;
    }

    private void incrementCountOperation() {
        count++;
    }
}
