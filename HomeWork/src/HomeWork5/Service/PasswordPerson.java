package HomeWork5.Service;

import java.util.Random;
import java.util.Scanner;

public class PasswordPerson {

    private String randomStr = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private int length;
    //( Math.random() * (b-a) ) + a
    public StringBuffer passwordForMany() {

        StringBuffer password = new StringBuffer();
        Random randomForPasswordLength = new Random();
        length = (int) (Math.random()*(10-5)+5);
        for (int i = 0; i < length; i++) {
            length = (int) (Math.random()*(10-5)+5);
            password.append(randomStr.charAt(length));
        }
        return password;
    }

    public String password() {

        Scanner scan = new Scanner(System.in);
        int check = -1;
        String password;
        do {
            System.out.print("\nВведите пароль от 5 до 10 символов включительно: ");
            password = scan.nextLine();
            String[] subPassword = password.split("");
            int length = subPassword.length;
            if (length < 5 || length > 10) {
                System.out.println("Введен некорректный пароль! Попробуйте снова");
            } else {
                return password;
            }
        } while (check == -1);
        return password;
    }
}
