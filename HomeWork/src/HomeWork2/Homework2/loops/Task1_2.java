package HomeWork2.Homework2.loops;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 */
public class Task1_2 {
    public static void main(String[] args) {
        String str;
        Scanner console = new Scanner(System.in);
        int number = 0;

        number = input(number, console);        //ввод данных
        str = String.valueOf(number);           //int->string
        int[] ms = perevod(str);                 //создание массива для перемножения
        int sum = productOfNumbers(ms);         //умнжение
        output(ms, sum);                        //рабочий и костыльный метод вывода


    }

    public static boolean contains(String str, String substr) {
        return str.contains(substr);
    }

    public static int input(int number, Scanner console) {
        int flag = 1; //флаг для выхода из проверки ввода
        while (1 == flag) {
            System.out.println("Введите целое число:");
            if (console.hasNextInt()) {
                number = console.nextInt();
                flag = 0;
            } else if (console.hasNextDouble()) {
                System.out.println("Введено не целое число");
                console.next();
            } else if (console.hasNextLine()) {
                System.out.println("Введено не число");
                console.next();
            }
        }
        return number;
    }

    public static int productOfNumbers(int[] ms) {
        int sum = 1;
        for (int m : ms) {
            sum *= m;
        }
        return sum;
    }

    public static int[] perevod(String str) {
        String[] s = str.split("");
        int[] ms;
        if (Objects.equals(s[0], "-")) {
            ms = new int[s.length - 1];
            ms[0] = -1;
        } else {
            ms = new int[s.length];
        }

        for (int i = 0; i < s.length; i++) {
            if (Objects.equals(s[0], "-")&&i == (s.length-1)) {
                break;
            }

            if (Objects.equals(s[i], "-")) {

                ms[i] = ms[i] * Integer.parseInt(s[i + 1]);
                continue;
            }
            if (Objects.equals(s[0], "-")) {
                if (i == s.length) {
                    break;
                }
                ms[i] = Integer.parseInt(s[i + 1]);
            } else {
                ms[i] = Integer.parseInt(s[i]);
            }


        }
        return ms;
    }


        static void output ( int[] ms, int sum){
            for (int i = 0; i < ms.length; i++) {
                if (i == 0) {
                    System.out.print(ms[i]);
                } else {
                    System.out.print("*" + ms[i]);
                }
                if (i == (ms.length - 1)) {
                    System.out.print("=" + sum);
                }
            }
        }
    }


