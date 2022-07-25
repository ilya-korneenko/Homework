package HomeWork2.Homework2.arrays.Task2_4;

import HomeWork2.Homework2.arrays.ArraysUtils;
//import Homework2.arrays.ArraysUtils;

public class Task2_4_1 {
    public static void main(String[] args) {
        int[] ms = ArraysUtils.arrayFromConsole();
        int sum = 0;
        for (int i = 0; i < ms.length; i++) {
            if (ms[i] % 2 == 0 && ms[i] > 0) {
                sum += ms[i];
            }
        }
        System.out.println("Сумма чётных и положительных чисел:\t" + sum);
    }
}
