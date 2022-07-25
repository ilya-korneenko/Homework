package HomeWork2.Homework2.arrays;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    public static int[] arrayFromConsole(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива:\t");
        int size=console.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print((i+1)+":");
            array[i]= console.nextInt();
        }
        //проверка
//        for (int i = 0; i < size; i++) {
//            System.out.println(array[i]);
//
//        }
        return array;
    }
    public static int[] arrayRandom(int size, int maxValueExclusion){
        int[] ms =new int[size];
        Random random=new Random();
        for (int i = 0; i < ms.length; i++) {
            ms[i]=random.nextInt(maxValueExclusion);
        }

        //проверка
        for (int i = 0; i < size; i++) {
            System.out.println(ms[i]);
        }
            return ms;
    }



}
