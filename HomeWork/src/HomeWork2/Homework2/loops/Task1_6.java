package HomeWork2.Homework2.loops;

public class Task1_6 {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            String s=" ";
            for (int j = 2; j <=5 ; j++) {
                if (i >= 5 && i < 10) {
                    s += (Integer.toString(j) + "* " + Integer.toString(i) + "=" + Integer.toString(i * j) + "\t\t");
                } else if (i >= 1 && i < 5) {
                    if(i==3&&j==4){
                        s += (Integer.toString(j) + "* " + Integer.toString(i) + "=" + Integer.toString(i * j) + "\t\t");
                    } else if (i==4&&j==4) {
                        s += (Integer.toString(j) + " *" + Integer.toString(i) + "=" + Integer.toString(i * j) + "\t\t");

                    } else if(i==4&&j==3){
                        s += (Integer.toString(j) + "* " + Integer.toString(i) + "=" + Integer.toString(i * j) + "\t\t");
                    }
                        else {
                        s += (Integer.toString(j) + " * " + Integer.toString(i) + "=" + Integer.toString(i * j) + "\t\t");
                    }
                        } else {
                    s += (Integer.toString(j) + "*" + Integer.toString(i) + "=" + Integer.toString(i * j) + "\t\t");
                }
            }
            System.out.println(s);
        }
        System.out.println();
        for (int i=1;i<=10;i++){
            String s=" ";
            for (int j = 6; j <10 ; j++) {
                if (i >= 2 && i < 10) {
                    s += (Integer.toString(j) + "* " + Integer.toString(i) + "=" + Integer.toString(i * j) + "\t\t");
                } else if (i >= 1 && i < 2) {
                    s += (Integer.toString(j) + " * " + Integer.toString(i) + "=" + Integer.toString(i * j) + "\t\t");
                } else {
                    s += (Integer.toString(j) + "*" + Integer.toString(i) + "=" + Integer.toString(i * j) + "\t\t");
                }
            }
            System.out.println(s);
        }


    }

}
