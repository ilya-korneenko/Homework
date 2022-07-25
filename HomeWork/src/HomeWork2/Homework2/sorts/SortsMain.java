package HomeWork2.Homework2.sorts;

import HomeWork2.Homework2.arrays.ArraysUtils;
//import Homework2.arrays.ArraysUtils;

import java.util.Arrays;

public class SortsMain {
    public static void main(String[] args) {
        int[] ms = new int[]{1, 2, 3, 4, 5, 6};
        ms = output(ms);
        ms = new int[]{1, 1, 1, 1};
        ms = output(ms);
        ms = new int[]{9, 1, 5, 99, 9, 9};
        ms = output(ms);
        ms = new int[]{};
        ms = output(ms);
        ms = new int[]{6,5,4,3,2,1};
        ms = output(ms);
        ms = ArraysUtils.arrayRandom(50,100);
        ms = output(ms);
        ms = ArraysUtils.arrayFromConsole();
        ms = output(ms);
    }

    static int[] output(int[] ms) {
        System.out.println("");
        String arrstring = Arrays.toString(ms);
        System.out.print(arrstring);
        System.out.print(" -> ");
        SortsUtils.shake(ms);
        arrstring = Arrays.toString(ms);
        System.out.print(arrstring);
        System.out.println();
        return ms;
    }

}
