package HomeWork3.runners;

import HomeWork3.calcs.api.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();
        double firstAction = calculator.multiplier(15, 7);
        double secondAction = calculator.division(28, 5);
        double thirdAction = calculator.pow(secondAction, 2);
        double fourthAction = calculator.sum(4.1, firstAction);
        double fifthAction = calculator.sum(fourthAction, thirdAction);
        output(fifthAction, calculator.getCountOperation());
    }

    private static void output(double fifthAction, long countOperation) {
        System.out.println("Результат\t" + fifthAction);
        System.out.println("Счётчик\t" + countOperation);
    }
}

