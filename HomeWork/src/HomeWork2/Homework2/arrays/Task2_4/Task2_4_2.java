package HomeWork2.Homework2.arrays.Task2_4;

import HomeWork2.Homework2.arrays.ArraysUtils;
//import Homework2.arrays.ArraysUtils;

public class Task2_4_2 {
    public static void main(String[] args) {
        int[] ms = ArraysUtils.arrayFromConsole();
        int sum = 0;
        int max_index=0;
        for (int i = 2; i < ms.length; i+=2) {
            if(ms[i]>ms[max_index]){
                max_index=i;
            }
        }
        System.out.println("Максимальный из элементов массива: " + ms[max_index] + " с четным индексом: " +max_index);
    }
}
