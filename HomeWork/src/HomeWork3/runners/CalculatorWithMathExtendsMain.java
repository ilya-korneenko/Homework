package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();
        double firstAction = calculator.multiplier(15,7);
        double secondAction = calculator.division(28,5);
        double thirdAction = calculator.pow(secondAction,2);
        double fourthAction = calculator.sum(4.1, firstAction);
        double firthAction = calculator.sum(fourthAction,thirdAction);
        output(firthAction);
    }

    private static void output(double firthAction) {
        System.out.println(firthAction);
    }
}
