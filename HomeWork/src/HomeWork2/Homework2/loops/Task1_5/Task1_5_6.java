package HomeWork2.Homework2.loops.Task1_5;

import java.util.Scanner;

public class Task1_5_6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите число:\t");
        int number=console.nextInt();
        System.out.print("Изначальное число:\t" + number);
        int per = 0;
        while(number>0){
            per = per*10+number%10;
            number/=10;
        }
        System.out.print("\nПеревёрнутое число:\t" + per);
    }
}
