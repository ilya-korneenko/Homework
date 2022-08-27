package HomeWork5.Comparator;

import HomeWork5.dto.Animal;

import java.util.Comparator;

public class ComparatorOfAgeAndNick implements Comparator<Animal> {


    @Override
    public int compare(Animal o1, Animal o2) {
        int res = o1.getAge() - o2.getAge();

        if (res != 0) {
            return res;
        } else {
            return o1.getNick().compareTo(o2.getNick());
        }
    }
}
