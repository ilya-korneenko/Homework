package Home_Work_1;

//важно !!! ввести комментарии вычислений , привести к типу

public class Task2 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 8;
        int res1,res2,res3,res4,res5,res6, res7;
        boolean res8, res9;
        res1=(int) function1(num1, num2);
        res2=(int)function2(num1, num2);
        res3=(int)function3(num1, num2);
        res4=(int)function4(num1, num2);
        res5=(int)function5(num1, num2);
        res6= (int)function6(num1, num2);
        //res7=(int)function7(num1, num2);
        res8=function8(num1);
        res9=function9();

        System.out.println("5+" + num1 + "/" + num2 + "=" + function1(num1,num2)+"|||"+res1);
        System.out.println("(5+" + num1 + ")/" + num2 + "=" + function3(num1, num2)+"|||"+res2);
        System.out.println("(5+" + num1 + "++)/" + num2 + "=" + function3(num1,num2)+"|||"+res3);
        System.out.println("(5+" + num1 + "++)/ --" + num2 + "=" +function4(num1,num2)+"|||"+ res4);
        System.out.println("(5*" + num1 + ">>" + num1 + "++)/ --" + num2 + "=" + res5);
        //(5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8
        System.out.println("(5+7>20? : 68:" + "22*" + num1 + ">>" + num1 + "++)/ --" + num2 + "="+function6(num1, num2)+ "|||"+ res6);
        // 6 - 2 > 3 && 12 * 12 <= 119
        System.out.println("6 - " + num1 + " > 3 && 12 * 12 <= 119 = " + res8);
        System.out.println("true && false ="+ res9);

    }

    static double function1(int num1, int num2) {
        return (double) (5 + (double)num1 / num2);
    }

    static double function2(int num1, int num2) {
        return (5 + (double)num1) / num2;
    }

    static double function3(int num1, int num2) {
        return (5 + (double)num1++) / num2;
    }

    static double function4(int num1, int num2) {
        return (5 + (double)num1++) / --num2;
    }

    //(5 * 2 >> 2++) / --8
    //проверь тут!!!
    static double function5(int num1, int num2) {
        return (5 * num1 >> num2++) / (double)--num2;
    }



    //44>>3=5------
    //44>>2=11!!!
    //(5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8
    static double function6(int num1, int num2) {
        return (5 + 7 > 20 ? 68 : 22 * num1 >> num1++) / (double)--num2;
    }

    //(5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8
//    static double function7(int num1, int num2) {
//        boolean value = 68 >= 68;
//        //System.out.println((5 + 7 > 20 ? value : 22 * num1 >> num1++) / --num2);
//        return 0;
//    }

    // 6 - 2 > 3 && 12 * 12 <= 119
    static boolean function8(int num1) {
        return 6 - num1 > 3 && 12 * 12 <= 119;
    }
    static boolean function9(){
        return true&&false;
    }

}
