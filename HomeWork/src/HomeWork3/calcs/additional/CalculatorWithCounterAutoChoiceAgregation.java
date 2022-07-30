package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    private CalculatorWithOperator calculator1;
    private CalculatorWithMathCopy calculator2;
    private CalculatorWithMathExtends calculator3;
    private long count;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculator1) {
        this.calculator1 = calculator1;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculator2) {
        this.calculator2 = calculator2;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculator3) {
        this.calculator3 = calculator3;
    }

    public double sum(double firstNumber, double secondNumber) {
        if (calculator1 != null) {
            incrementCountOperation();
            return calculator1.sum(firstNumber, secondNumber);
        } else if (calculator2 != null) {
            incrementCountOperation();
            return calculator2.sum(firstNumber, secondNumber);
        } else if (calculator3 != null) {
            incrementCountOperation();
            return calculator3.sum(firstNumber, secondNumber);
        }
        return 0;
    }

    public double difference(double reduced, double subtractible) {
        if (calculator1 != null) {
            incrementCountOperation();
            return calculator1.difference(reduced, subtractible);
        } else if (calculator2 != null) {
            incrementCountOperation();
            return calculator2.difference(reduced, subtractible);
        } else if (calculator3 != null) {
            incrementCountOperation();
            return calculator3.difference(reduced, subtractible);
        }
        return 0;
    }

    public double multiplier(double first_num, double second_num) {
        if (calculator1 != null) {
            incrementCountOperation();
            return calculator1.multiplier(first_num, second_num);
        } else if (calculator2 != null) {
            incrementCountOperation();
            return calculator2.multiplier(first_num, second_num);
        } else if (calculator3 != null) {
            incrementCountOperation();
            return calculator3.multiplier(first_num, second_num);
        }
        return 0;
    }

    public double division(double divisible, double divisor) {
        if (calculator1 != null) {
            incrementCountOperation();
            return calculator1.division(divisible, divisor);
        } else if (calculator2 != null) {
            incrementCountOperation();
            return calculator2.division(divisible, divisor);
        } else if (calculator3 != null) {
            incrementCountOperation();
            return calculator3.division(divisible, divisor);
        }
        return 0;
    }

    public double pow(double number, int degree) {
        if (calculator1 != null) {
            incrementCountOperation();
            return calculator1.pow(number, degree);
        } else if (calculator2 != null) {
            incrementCountOperation();
            return calculator2.pow(number, degree);
        } else if (calculator3 != null) {
            incrementCountOperation();
            return calculator3.pow(number, degree);
        }
        return 0;
    }

    public double module(double number) {
        if (calculator1 != null) {
            incrementCountOperation();
            return calculator1.module(number);
        } else if (calculator2 != null) {
            incrementCountOperation();
            return calculator2.module(number);
        } else if (calculator3 != null) {
            incrementCountOperation();
            return calculator3.module(number);
        }
        return 0;
    }

    public double mySqrt(double number) {
        if (calculator1 != null) {
            incrementCountOperation();
            return calculator1.mySqrt(number);
        }else if (calculator2 != null) {
            incrementCountOperation();
            return calculator2.mySqrt(number);
        }else if (calculator3 != null) {
            incrementCountOperation();
            return calculator3.mySqrt(number);
        }
        return 0;
    }

    private void incrementCountOperation(){
        count++;
    }

    public long getCountOperation(){
        return count;
    }
}
