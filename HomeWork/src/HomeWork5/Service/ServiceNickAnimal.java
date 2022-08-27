package HomeWork5.Service;

import HomeWork5.Service.ServiceName;

import java.util.Random;

public class ServiceNickAnimal {
    private final String[] nicks = {"Джекки","Лорд","Хвостик","Маня","Барсик","Jo","Йозеф","К.","Карамазов","Рыжик","Пушистик"};
    private final ServiceName example = new ServiceName();

    public StringBuffer RandomGenericNickAnimal(int length){
        //ServiceName example = new ServiceName();
        return example.RandomGenericName(length,example.getEnglishStr());
    }

    public StringBuffer RandomGenericRussianNameAnimal(int length){
        return example.RandomGenericRussianName(length,example.getRussianStr());
    }

    public String RandomGenericTruNickAnimal(){
        Random random = new Random();
        return nicks[random.nextInt(nicks.length)];
    }
}
