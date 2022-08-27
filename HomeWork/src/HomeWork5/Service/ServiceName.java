package HomeWork5.Service;

import java.util.Random;


public class ServiceName {

    private final String[] names = {"Илья", "Влад", "Кирилл", "Max", "Diamond", "FlexBoy", "Попереч", "Платон", "Аристотель", "Сократ",};
    private final String englishStr = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String getEnglishStr() {
        return englishStr;
    }

    public String getRussianStr() {
        return RussianStr;
    }

    private final String RussianStr = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    /**
     *
     * @param length - длинна имени
     * @param englishStr - строка, используемая для создания имени
     * @return name - возврат "нового" имени
     */
    public StringBuffer RandomGenericName(int length, String englishStr) {
        Random random = new Random();
        StringBuffer name = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(length);
            name.append(englishStr.charAt(number));
        }
        return name;
    }

    /**
     *
     * @param length
     * @param //str
     * @return
     */
    public StringBuffer RandomGenericRussianName(int length, String russianStr) {
        return RandomGenericName(length, russianStr);
    }

    /**
     *
     * @return
     */
    public String RandomGenericTruName() {
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }


}
