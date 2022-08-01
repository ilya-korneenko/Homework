package HomeWork3.runners;

import HomeWork3.calcs.api.additional.CalculatorWithMemory;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory calculator = new CalculatorWithMemory(new CalculatorWithOperator());
        double firstAction = calculator.multiplier(15, 7);
        double secondAction = calculator.division(28, 5);
        double thirdAction = calculator.pow(secondAction, 2);
        double fourthAction = calculator.sum(4.1, firstAction);
        double fifthAction = calculator.sum(fourthAction, thirdAction);
        System.out.println("Резултат: " + fifthAction);
    }
}
