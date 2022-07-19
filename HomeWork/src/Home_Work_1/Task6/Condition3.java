package Home_Work_1.Task6;

import java.util.Objects;
import java.util.Scanner;

public class Condition3 {
    public static void main(String[] args) {
        Task6 name = new Task6();

        Scanner console = new Scanner(System.in);
        String str1;
        System.out.print("Введите ваше имя:\t");
        str1 = console.nextLine();
        name.setName(str1);

        boolean term1 = Objects.equals("Вася", name.getName());
        boolean term2 = Objects.equals("Анастасия", name.getName());

        switch (str1) {
            case "Вася":
                System.out.println("Привет! \nЯ тебя так долго ждал!");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал!");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }

    }
}
