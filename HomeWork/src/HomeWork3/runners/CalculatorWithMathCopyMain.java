package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
        double firstAction = calculator.multiplier(15, 7);
        double secondAction = calculator.division(28, 5);
        double thirdAction = calculator.pow(secondAction, 2);
        double fourthAction = calculator.sum(4.1, firstAction);
        double firthAction = calculator.sum(fourthAction, thirdAction);
        output(firthAction);
    }
    static void output(double number){
        System.out.println(number);
    }
}
