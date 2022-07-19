package Home_Work_1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num1=0;
        int num2=0;

        System.out.print("Введи первое число: ");
        num1=in.nextInt();  //187
        System.out.print("Введи второе число: ");
        num2=in.nextInt();  //141

        System.out.println(num1 + "&" +num2+ ": " +Integer.toBinaryString(num1&num2));
        /*
         *   10111011
         *   10001101
         * & _______
         *   10001001
         * */
        System.out.println(num1 + "|" +num2+ ": " + Integer.toBinaryString((num1|num2)));
        /*
         *   10111011
         *   10001101
         * | ________
         *   10111111       * */

//        num1 = transfer(num1);  //10111011
//        num2 = transfer(num2);  //10001101
        System.out.println(num1 + " в двоичной сс: " + transfer(num1) + "\n" +num2+" в двоичной сс: " + transfer(num2));




    }

     static int transfer(int num) {
        String mystr;
        mystr=Integer.toBinaryString(num);  //num1=10111011;num2=10001101
        num=Integer.parseInt(mystr);
        return num;
    }//перевод из 10й в 2ю сс




}


