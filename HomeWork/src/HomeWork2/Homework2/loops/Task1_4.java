package HomeWork2.Homework2.loops;

import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        long a = 1;
        int num1, num2, num3, num4;
        num1 = 3;
        num2 = 188;
        num3 = -19;
        long[] ms1 = overflow(a, num1);
        long[] ms2 = overflow(a, num2);
        long[] ms3 = negativeOverflow(a, num3);
        System.out.println("|||" + Long.MIN_VALUE + "|||" + Long.MAX_VALUE + "|||");

        output(ms1);
        output(ms2);
        output(ms3);

        System.out.print("Введите любое целочисленное число:\t");
        num4 = console.nextInt();
        long[] ms4 = negativeOverflow(a, num4);
        output(ms4);
    }


    static long[] negativeOverflow(long a, int num3) {
        long before = 0, after = 1;
        a = 1;
        long prioritet = 0;
        long[] ms = new long[3];

        while (Math.abs(before) < Math.abs(after)) {
            prioritet = a;
            before = a * num3;
            after = a * num3 * num3;
            a *= num3;
        }

        ms[0] = prioritet;
        ms[1] = before;
        ms[2] = after;
        return ms;
    }

    static long[] overflow(long a, int num1) {
        a = 1;
        long before = 0, after = 1;
        while (after > 0) {
            before = a;
            a *= num1;
            after = a;
        }
        long[] ms = new long[2];
        ms[0] = before;
        ms[1] = after;
        return ms;
    }

    static void output(long[] ms) {
        System.out.println("Значение до переполнения:\t" + ms[0]);
        System.out.println("Значение после переполнения:\t" + ms[1]);
    }
}


