package Home_Work_1.Task3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число:\t");
        double number1 = in.nextDouble();
        //sqrt
        if (number1 > 0) {
            System.out.println("Корень введённого числа:\t" + Math.sqrt(number1));
        } else {
            System.out.println("Корень данного числа не существует в области вещественных чисел");
        }
        //abs
        System.out.println("Модуль введённого числа:\t" + Math.abs(number1));
        System.out.print("Введите второе число:\t");
        double number2;
        number2 = in.nextDouble();
        //max
        System.out.println("Большее число из " + number1 + " " + number2 + ":\t" + Math.max(number1, number2));
        //min
        System.out.println("Меньшее число из " + number1 + " " + number2 + ":\t" + Math.min(number1, number2));
        System.out.println("Рандомное число:\t" + Math.random());
        //System.out.println("Логарифм числа "+number1 +":\t"+Math.log(number1));
        System.out.println("Целочисленное деление " + number1 + " на " + number2 + ":\t" + Math.floorDiv((int) number1, (int) number2));
        System.out.println("Округление числа " + number1 + " до ближайшего целого числа:\t" + Math.round(number1));
        System.out.println("Произведение числа " + number1 + " на 2 в степени " + 5 + ":\t" + Math.scalb(number1, 5));
        if (1 == Math.signum(number1)) {
            System.out.println("число " +number1+ " положительное");
        } else {
            System.out.println("число " +number1+ " отрицательное");
        }
    }
}
