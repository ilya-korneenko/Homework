package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;

/**
 * division     -   деление
 * multiplier   -   умножение
 * sum          -   сложение
 * difference   -   вычитание
 * pow          -   возведение в степень
 * module       -   модуль числа
 * squareRoot   -   поожительный корень
 */
public class CalculatorWithOperator implements ICalculator {
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

    public double pow(double number, int degree) {
        double result = number;
        for (int i = 1; i < degree; i++) {
            result *= number;
        }
        return result;
    }

    public double module(double number) {
        if (number < 0) {
            return number * (-1.0);
        } else {
            return number;
        }
    }

    public double mySqrt(double number) {
        double t;
        double squareRoot = number / 2;
        do {
            t = squareRoot;
            squareRoot = (t + (number / t)) / 2;
        } while ((t - squareRoot) != 0);
        return squareRoot;
    }

}
