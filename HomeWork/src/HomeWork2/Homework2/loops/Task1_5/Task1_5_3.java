package HomeWork2.Homework2.loops.Task1_5;

import java.util.Scanner;

public class Task1_5_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] ms = inequality(input(console));
        for (int i = 0; i < ms.length; i++) {
            if (i == 0)
                System.out.println("Чётных:\t" + ms[i]);
            else
                System.out.println("Нечётных:\t" + ms[i]);
        }
    }

    static int input(Scanner console) {
        System.out.print("Введите число:\t");
        return console.nextInt();
    }

    static int[] inequality(int number) {
        int[] ms = new int[2];
        if (0 == number) {
            ms[0] = 1;
            ms[1] = 0;
            return ms;
        } else {
            int even = 0;
            int odd = 0;
            while (number != 0) {
                if (number % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
                number /= 10;
            }
            ms[0] = even;
            ms[1] = odd;
        }
        return ms;
    }
}

