package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithOperator;

/**
 * division     -   деление
 * multiplier   -   умножение
 * sum          -   сложение
 * difference   -   вычитание
 * pow          -   возведение в степень
 * module       -   модуль числа
 * squareRoot   -   поожительный корень
 */
//double result = 4.1 + 15 * 7 + (28.0 / 5) *(28.0/5);

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator1 = new CalculatorWithOperator();

        double firstAction = calculator1.multiplier(15, 7);
        double secondAction = calculator1.division(28, 5);
        double thirdAction = calculator1.pow(secondAction, 2);
        double fourthAction = calculator1.sum(4.1, firstAction);
        double fifthAction = calculator1.sum(fourthAction, thirdAction);
        System.out.println(fifthAction);//вывод в консоль

    }

    private void Output(double number){
        System.out.println(number);
    }
}
