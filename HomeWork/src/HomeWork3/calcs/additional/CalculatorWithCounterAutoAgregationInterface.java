package HomeWork3.calcs.additional;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {
    public CalculatorWithCounterAutoAgregationInterface(ICalculator calculator) {
        this.iCalculator = calculator;
    }

    private long count;

    public long getCountOperation() {
        return count;
    }

    void incrementCountOperation() {
        count++;
    }

    ICalculator iCalculator;


    public double sum(double first_summand, double second_summand) {
        incrementCountOperation();
        return iCalculator.sum(first_summand, second_summand);
    }

    public double division(double divisible, double divisor) {
        incrementCountOperation();
        return iCalculator.division(divisible, divisor);
    }

    public double multiplier(double first_num, double second_num) {
        incrementCountOperation();
        return iCalculator.multiplier(first_num, second_num);
    }

    public double difference(double reduced, double subtractible) {
        incrementCountOperation();
        return iCalculator.difference(reduced, subtractible);
    }

    public double pow(double number, int degree) {
        incrementCountOperation();
        return iCalculator.pow(number, degree);
    }

    public double module(double number) {
        incrementCountOperation();
        return iCalculator.module(number);
    }

    public double mySqrt(double number) {
        incrementCountOperation();
        return iCalculator.mySqrt(number);
    }


}
