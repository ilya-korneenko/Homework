package HomeWork5.Comparator;

import HomeWork5.dto.Person;

import java.util.Comparator;

public class ComparatorOfLengthPassword implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getPassword().length() - o2.getPassword().length();
    }


//    @Override
//    public int compare(Integer o1, Integer o2) {
//        return 0;
//    }
}
