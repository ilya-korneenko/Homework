package HomeWork2.Homework2.loops;

import java.util.Scanner;

public class Task1_recursion {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int flag = 1;
        long number = 0;
        //проверка на корректность ввода
        while (1 == flag) {
            System.out.print("Введите число:\t");
            number = console.nextLong();
            if (number < 0 || number >= 40) {
                System.out.println("Ошибка ввода");
                System.out.println("Число должно быть меньше 40 и не отрицательное");
                number = 0;
            } else
                flag = 0;
        }

        if (0 == number || 1 == number) {
            {
                number=1;
                System.out.println(number + "=" + 1);
            }

        }
        else {
            System.out.println(factorial(number) );
        }

    }

    static long factorial(long number) {
        long result = 1;


        if (number == 0) {
            System.out.print(" = ");
            return result;
        }
        if (number == 1) {
            System.out.print(" * 1 = ");
            return result;
        }

        System.out.print(number);
        if (number != 2) {
            System.out.print(" * ");
        }

        result = number * factorial(number - 1);
        return result;


    }


}

