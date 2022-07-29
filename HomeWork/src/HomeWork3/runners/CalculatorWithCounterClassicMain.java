package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterClassic;

/**
 * division     -   деление
 * multiplier   -   умножение
 * sum          -   сложение
 * difference   -   вычитание
 * pow          -   возведение в степень
 * module       -   модуль числа
 * squareRoot   -   поожительный корень
 */

//    double firstAction = calculator.multiplier(15, 7);
//            double secondAction = calculator.division(28, 5);
//            double thirdAction = calculator.pow(secondAction, 2);
//            double fourthAction = calculator.sum(4.1, firstAction);
//            double firthAction = calculator.sum(fourthAction, thirdAction);
//            output(firthAction);

//double result = 4.1 + 15 * 7 + (28.0 / 5) *(28.0/5);
public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();
        double firstAction = calculator.multiplier(15,7);
        calculator.incrementCountOperation();
        double secondAction = calculator.division(28,5);
        calculator.incrementCountOperation();
        double thirdAction = calculator.pow(secondAction,2);
        calculator.incrementCountOperation();
        double fourthAction = calculator.sum(4.1,firstAction);
        calculator.incrementCountOperation();
        double fifthAction = calculator.sum(fourthAction, thirdAction);
        calculator.incrementCountOperation();
        output(fifthAction, calculator.getCountOperation());
    }

    private static void output(double fifthAction, long countOperation) {
        System.out.println("Результат\t" + fifthAction);
        System.out.println("Счётчик\t" + countOperation);
    }

}
