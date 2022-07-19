package Home_Work_1.Task6;

import java.util.Objects;
import java.util.Scanner;

public class Condition1 extends Task6 {
    public static void main(String[] args) {
        Task6 name = new Task6();

        Scanner console = new Scanner(System.in);
        String str1;
        System.out.print("Введите ваше имя:\t");
        str1 = console.nextLine();

        name.setName(str1);

        if (Objects.equals("Вася", name.getName())) {
            System.out.println("Привет! \nЯ тебя так долго ждал!");
        } else if (Objects.equals("Анастасия", name.getName())) {
            System.out.println("Я тебя так долго ждал!");
        } else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
