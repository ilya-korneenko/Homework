package HomeWork3.calcs.api.additional;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private long count=0;


    public void incrementCountOperation() {
        count++;
    }

    public long getCountOperation() {
        return count;
    }

    @Override
    public double pow(double number, int degree) {
        incrementCountOperation();
        return super.pow(number, degree);
    }

    @Override
    public double mySqrt(double number) {
        incrementCountOperation();
        return super.mySqrt(number);
    }

    @Override
    public double module(double number) {
        incrementCountOperation();
        return super.module(number);
    }

    @Override
    public double difference(double reduced, double subtractible) {
        incrementCountOperation();
        return super.difference(reduced, subtractible);
    }

    @Override
    public double sum(double first_summand, double second_summand) {
        incrementCountOperation();
        return super.sum(first_summand, second_summand);
    }

    @Override
    public double division(double divisible, double divisor) {
        incrementCountOperation();
        return super.division(divisible, divisor);
    }

    @Override
    public double multiplier(double first_num, double second_num) {
        incrementCountOperation();
        return super.multiplier(first_num, second_num);
    }
}
