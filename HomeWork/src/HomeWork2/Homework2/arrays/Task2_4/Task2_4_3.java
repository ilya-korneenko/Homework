package HomeWork2.Homework2.arrays.Task2_4;

import HomeWork2.Homework2.arrays.ArraysUtils;
//import Homework2.arrays.ArraysUtils;
// 38 67 71 56 34 11 17 84 92 61
public class Task2_4_3 {
    public static void main(String[] args) {
        int[] ms = ArraysUtils.arrayFromConsole();
        double sum = 0;
        for (int i = 0; i < ms.length; i++) {
            sum+=ms[i];
        }
        sum/=ms.length;
        System.out.println("Среднее арифметическое:\t "+ sum );
        for (int i = 0; i < ms.length; i++) {
            if(ms[i]<sum) {
                System.out.print(ms[i]+" ");
            }
        }
    }
}
