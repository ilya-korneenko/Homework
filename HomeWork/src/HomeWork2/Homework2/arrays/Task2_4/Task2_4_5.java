package HomeWork2.Homework2.arrays.Task2_4;

import HomeWork2.Homework2.arrays.ArraysUtils;
//import Homework2.arrays.ArraysUtils;

import java.util.Scanner;

public class Task2_4_5 {
    public static void main(String[] args) {
        int[] ms = ArraysUtils.arrayFromConsole();
        int leftRange, rightRange;
        int size = ms.length;
        Scanner console = new Scanner(System.in);
        System.out.print("Удаляем дипазон:\t");
        leftRange = console.nextInt();
        System.out.print("\n по:\t");
        rightRange = console.nextInt();
        int i = 0;
        while (i < size) {
            if (ms[i] <= rightRange && ms[i] > leftRange) {
                size -= 1;
                for (int j = i; j < size; j++) {
                    ms[j] = ms[j + 1];
                }
            } else {
                i += 1;
            }
        }

        for (i = ms.length - 1; i > 1; i--) {
            if (ms[i] == ms[i - 1])
                ms[i] = 0;
        }
    }
}
