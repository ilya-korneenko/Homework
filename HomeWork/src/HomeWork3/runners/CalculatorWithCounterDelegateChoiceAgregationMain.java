package HomeWork3.runners;

import HomeWork3.calcs.api.additional.CalculatorWithCounterAutoChoiceAgregation;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {

        CalculatorWithOperator CalculatorWithOperator = new CalculatorWithOperator();
        CalculatorWithCounterAutoChoiceAgregation calculator1 = new CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator);
        double firstAction = calculator1.multiplier(15, 7);
        double secondAction = calculator1.division(28, 5);
        double thirdAction = calculator1.pow(secondAction, 2);
        double fourthAction = calculator1.sum(4.1, firstAction);
        double fifthAction = calculator1.sum(fourthAction, thirdAction);
        output(fifthAction, calculator1.getCountOperation());

        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoChoiceAgregation calculator2 = new CalculatorWithCounterAutoChoiceAgregation(calculatorWithMathCopy);
        firstAction = calculator2.multiplier(15, 7);
        secondAction = calculator2.division(28, 5);
        thirdAction = calculator2.pow(secondAction, 2);
        fourthAction = calculator2.sum(4.1, firstAction);
        fifthAction = calculator2.sum(fourthAction, thirdAction);
        output(fifthAction, calculator2.getCountOperation());

        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoChoiceAgregation calculator3 = new CalculatorWithCounterAutoChoiceAgregation(calculatorWithMathExtends);
        firstAction = calculator3.multiplier(15, 7);
        secondAction = calculator3.division(28, 5);
        thirdAction = calculator3.pow(secondAction, 2);
        fourthAction = calculator3.sum(4.1, firstAction);
        fifthAction = calculator3.sum(fourthAction, thirdAction);
        output(fifthAction, calculator3.getCountOperation());
    }

    private static void output(double fifthAction, long countOperation) {
        System.out.println("Результат " + fifthAction);
        System.out.println("Счётчик " + countOperation);
    }
}
