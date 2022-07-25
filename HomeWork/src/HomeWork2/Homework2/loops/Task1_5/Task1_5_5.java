package HomeWork2.Homework2.loops.Task1_5;

import java.util.Scanner;

public class Task1_5_5 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner console = new Scanner(System.in);
        System.out.print("Введите 1е число: ");
        num1 = console.nextInt();
        System.out.print("Введите 2е число: ");
        num2 = console.nextInt();
        System.out.print("Введите 3е число: ");
        num3 = console.nextInt();
        System.out.println("\n");
        for (; num1 < num2; num1 += num3) {
            System.out.print(num1 + " ");
        }
    }

}
