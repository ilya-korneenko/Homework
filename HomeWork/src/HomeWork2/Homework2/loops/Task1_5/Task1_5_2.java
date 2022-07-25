package HomeWork2.Homework2.loops.Task1_5;

import java.util.Random;

public class Task1_5_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int even=0;

        for (int i = 0; i < 1000; i++) {
            int num=rand.nextInt();
            if(0==num%2){
                even++;
            }
        }
        System.out.println("Вероятность:\t"+((double)even/1000*100));
    }
}
