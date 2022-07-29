package HomeWork3.calcs.additional;

public class CalculatorWithCounterDelegateAgregation {
    private CalculatorWithCounterAutoSuper calculator;
    private long count;


    public CalculatorWithCounterDelegateAgregation() {
        calculator = new CalculatorWithCounterAutoSuper();
        this.calculator = calculator;
    }

    public double pow(double number, int degree) {
        incrementCountOperation();
        return calculator.pow(number, degree);
    }

    public double mySqrt(double number) {
        incrementCountOperation();
        return calculator.mySqrt(number);
    }

    public double module(double number) {
        incrementCountOperation();
        return calculator.module(number);
    }

    public double difference(double reduced, double subtractible) {
        incrementCountOperation();
        return calculator.difference(reduced, subtractible);
    }

    public double sum(double first_summand, double second_summand) {
        incrementCountOperation();
        return calculator.sum(first_summand, second_summand);
    }

    public double division(double divisible, double divisor) {
        incrementCountOperation();
        return calculator.division(divisible, divisor);
    }

    public double multiplier(double first_num, double second_num) {
        incrementCountOperation();
        return calculator.multiplier(first_num, second_num);
    }
    void incrementCountOperation(){
        count++;
    }
    public long getCountOperation() {
        return count;
    }

}
