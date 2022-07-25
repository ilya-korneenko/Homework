package HomeWork2.Homework2.loops;

import java.util.Scanner;
//факториал 0 = 1
public class Task1_loops {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        long number = 1, factorial = 1;
        int flag = 1;
        //проверка
        while (1 == flag) {
            System.out.print("Введите число:\t");
            number = console.nextLong();
            if (number < 1 || number >= 40) {
                System.out.println("Ошибка ввода");
                System.out.println("Число должно быть меньше 40 и не отрица");
                number = 0;
            } else
                flag = 0;
        }
        System.out.print(factorial);
        factorial = factorial(number);
        for (int i = 1; i <= number; i++) {
            if (i > 1) {
                System.out.print("*" + i);
            }
        }
        System.out.print("=");
        System.out.println(factorial);
    }

    static long factorial(long number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
