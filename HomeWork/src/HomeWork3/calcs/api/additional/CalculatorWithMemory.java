package HomeWork3.calcs.api.additional;

import HomeWork3.calcs.api.ICalculator;

import java.util.Scanner;

public class CalculatorWithMemory {
    private final ICalculator iCalculator;
    private double memoryTemp;

    public CalculatorWithMemory(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }

    public double division(double divisible, double divisor) {
        memoryTemp = iCalculator.division(divisible, divisor);
        memoryValue();
        return iCalculator.division(divisible, divisor);
    }

    public double multiplier(double first_num, double second_num) {
        memoryTemp = iCalculator.multiplier(first_num, second_num);
        memoryValue();
        return iCalculator.multiplier(first_num, second_num);
    }

    public double sum(double first_summand, double second_summand) {
        memoryTemp = iCalculator.sum(first_summand,second_summand);
        memoryValue();
        return iCalculator.sum(first_summand, second_summand);
    }

    public double difference(double reduced, double subtractible) {
        memoryTemp = iCalculator.difference(reduced,subtractible);
        memoryValue();
        return iCalculator.difference(reduced, subtractible);
    }

    public double pow(double number, int degree) {
        memoryTemp = iCalculator.pow(number,degree);
        memoryValue();
        return iCalculator.pow(number, degree);
    }

    public double module(double number) {
        memoryTemp = iCalculator.module(number);
        memoryValue();
        return iCalculator.module(number);
    }

    public double mySqrt(double number) {
        memoryTemp = iCalculator.mySqrt(number);
        memoryValue();
        return iCalculator.mySqrt(number);
    }

    private void memoryValue() {
        double temp = getMemoryTemp();
        if (choice()) {
            System.out.println(temp);
        }
    }

    public void setMemoryTemp(double memoryTemp) {
        this.memoryTemp = memoryTemp;
    }

    public double getMemoryTemp() {
        return memoryTemp;
    }

    private boolean choice() {
        Scanner console = new Scanner(System.in);
        System.out.print("Вывести ли значение из памяти:\n_______________________________\n");
        System.out.print("да - true\n_________\nнет - false\n__________\n");
        return console.nextBoolean();
    }
}
