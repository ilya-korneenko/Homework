package HomeWork2.Homework2.loops;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double number = input_number(console);
        int degree = input_degree(console);
        double exponent = exponentiation(number,degree);
        String str = String.format("%.3f",exponent);
        System.out.println(number + " ^ " +degree + " = "+ str);

    }
    static double input_number(Scanner console){
        System.out.print("Введите дробное число:\t");
        return console.nextDouble();
    }

    static int input_degree(Scanner console){
        System.out.print("Введите степень(целая и положитеьная):\t");
        return console.nextInt();
    }

    static double exponentiation(double number, int degree){
        double exponent = number;
        for (int i = 0; i < degree-1; i++) {
            exponent*=number;
        }
        return exponent;
    }
}
