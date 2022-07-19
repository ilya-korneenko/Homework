package Home_Work_1.Task4;

import java.util.Calendar;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int year;
        Scanner in = new Scanner(System.in);
        System.out.println("введите число:\t");
        double number = in.nextDouble();
        odd(number);
        double num1,num2,num3;
        System.out.println("введите 3 числа:");
        num1=in.nextDouble();
        num2=in.nextDouble();
        num3 = in.nextDouble();
        average(num1,num2,num3);
        System.out.println("делимость чисел\nвведите 2 числа:\t");
        num1=in.nextDouble();
        num2=in.nextDouble();
        divisibility(num1,num2);
        System.out.println("Введите количество байт:\t");
        num3=in.nextDouble();
        bites(num3);
        System.out.println("Введите год:");
        year=in.nextInt();

        boolean leap = isLeapYear(year);
        if (leap){
            System.out.println("Високосный");
        }
        else {
            System.out.println("Не високосный ");
        }
    }

    static void odd(double number){
        if(0==number%2)
        {
            System.out.println("чётное");
        }
        else {
            System.out.println("нечётное");
        }
    }
    static void average (double num1,double num2, double num3){
        if (((num1>num2)&&(num1<num3))||((num1<num2)&&(num1>num3))) {
            System.out.println("Среднее число:\t"+num1);
        }
        else if (((num2>num1)&&(num2<num3))||((num2>num3)&&(num2<num1))){
            System.out.println("Среднее число:\t" + num2);
            }
        else {
            System.out.println("Среднее число:\t"+num3);
        }
    }
    static void divisibility(double num1,double num2){
        if(num1%num2==0){
            System.out.println("число " + num1 + " делится на " + num2 + " без остатка");
        }else {
            System.out.println("число " + num1 + " не делится на " + num2 + " без остатка");
        }
    }

    static void bites(double num3){
        System.out.println(num3+" байт = " + 0.001*num3+" килобайт");
    }

    public static boolean isLeapYear(int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        return cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    }

}
