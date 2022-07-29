package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    public double division(double divisible, double divisor) {
        return divisible / divisor;
    }

    public double multiplier(double first_num, double second_num) {
        return first_num * second_num;
    }

    public double sum(double first_summand, double second_summand) {
        return first_summand + second_summand;
    }

    public double difference(double reduced, double subtractible) {
        return reduced - subtractible;
    }

    public double pow(double number, int degree){
        return Math.pow(number,degree);
    }

    public double module(double number){
        return Math.abs(number);
    }

    public double mySqrt(double number){
        return Math.abs(number);
    }
}
