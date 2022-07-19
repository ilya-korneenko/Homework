package Home_Work_1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("у вас рабочий день: \n1-да\n2-нет\n");
        Scanner in = new Scanner(System.in);
        int poll1= in.nextInt();
        System.out.println("у вас отпуск: \n1-да\n2-нет\n");
        int poll2= in.nextInt();
        boolean weekday,vocation;
        if(1==poll1){
            weekday = true;
        }
        else {
            weekday = false;
        }
        if(1==poll2){
            vocation=true;
        }
        else {
            vocation=false;
        }
        if(SleepIn(weekday,vocation))
        {
            System.out.println("спи!");
        }
        else{
            System.out.println("Не спи!");
        }
    }
    /*
    0 0
    0 1
    1 0
    1 1
     */


    static boolean SleepIn(boolean weekday, boolean vacation){
        if(weekday==false&&vacation==false)
            return true;
        if(weekday==false&&vacation==true)
            return true;
        if(weekday==true&&vacation==false)
            return false;
        if(weekday==true&&vacation==true)
            return false;

        return false;
    }
}
