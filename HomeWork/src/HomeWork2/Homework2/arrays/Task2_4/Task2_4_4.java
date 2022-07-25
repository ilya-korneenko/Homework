package HomeWork2.Homework2.arrays.Task2_4;

import HomeWork2.Homework2.arrays.ArraysUtils;
//import Homework2.arrays.ArraysUtils;

public class Task2_4_4 {
    public static void main(String[] args) {
        int[] ms = ArraysUtils.arrayFromConsole();
        int min_index1 = 0, min_index2 = 0, temp = 0;
        if (ms[0] < ms[1]) {
            min_index1 = 0;
            min_index2 = 1;
        } else {
            min_index1 = 1;
            min_index2 = 0;
        }

        for (int i = 2; i < ms.length; i++) {
            if (ms[i] < ms[min_index1]) {
                temp = min_index1;
                min_index1 = i;
            }
            if (ms[temp] < ms[min_index2]) {
                min_index2 = temp;
            } else {
                if (ms[i] < ms[min_index2]) {
                    min_index2 = i;
                }
            }
        }

        System.out.println("Индекс первого минимального:\t" + (min_index1 + 1) + " число:\t" + ms[min_index1]);
        System.out.println("Индекс второго минимального:\t" + (min_index2 + 1) + " число:\t" + ms[min_index2]);
//        for (i=2; i< N; i++) {<br>
//            if (a[i] < a[min1]) {<br>
//                    buff = min1;<br>
//                    min1 = i;<br>
//                if (a[buff] < a[min2]) min2 = buff;<br>
//            } else {<br>
//                if (a[i] < a[min2]) min2 = i;<br>
//            }<br>
    }
}
