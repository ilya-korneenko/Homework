package HomeWork5.Comparator;

import HomeWork5.dto.Animal;

import java.util.Comparator;

public class ComparatorOfAge implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getAge()-o2.getAge();
    }
}
