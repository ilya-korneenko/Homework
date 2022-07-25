package HomeWork2.Homework2.loops.Task1_5;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task1_5_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Input(console);
        int maxNatural = maxNat(number);
        System.out.println("максимальное число:\t"+maxNatural);
    }

    static int Input(Scanner console) {
        System.out.print("Введите натуральное число:\t");
        return console.nextInt();
    }

    static int maxNat(int number){
        String str = String.valueOf(number);
        String[] s= str.split("");
        int[] arr=new int[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i]=Integer.parseInt(s[i]);
        }
        return getMaxOfArray(arr);


    }



    static int getMaxOfArray(int[] numArray) {
        IntStream intStream = Arrays.stream(numArray);
        OptionalInt optionalInt = intStream.max();
            return optionalInt.getAsInt();
    }


}
