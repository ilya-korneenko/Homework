package HomeWork2.Homework2.loops.Task1_5;

import java.util.Scanner;

public class Task1_5_4 {
    public static void main(String[] args) {
        System.out.print("Введите количество элементов:\t");
        Scanner console = new Scanner(System.in);
        int elements = console.nextInt();
        int temp, first, second;
        first = 1;
        second = 2;
        System.out.print(first+" "+ second);
        for (int i = 3; i <= elements ; i++) {
            temp=second;
            second+=first;
            first = temp;
            System.out.print(" "+ second );
        }
    }
}
