package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

    private int count = 0;

    public void incrementCountOperation() {
        count++;
    }

    public long getCountOperation() {
        return count;
    }
}
