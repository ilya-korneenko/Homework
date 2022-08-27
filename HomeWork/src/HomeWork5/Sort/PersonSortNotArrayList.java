package HomeWork5.Sort;

import HomeWork5.dto.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PersonSortNotArrayList {
    private final PersonSort personSort = new PersonSort();

    public ArrayList personSort(Collection collection){
        ArrayList<Person> personArrayList = new ArrayList<>();

        Iterator<Person> it = collection.iterator();

        for (int i = 0; i < collection.size(); i++) {
            Person person = new Person();
            person = it.next();
            personArrayList.add(i, person);
        }

        personSort.personSort(personArrayList);

        return personArrayList;
    }
}
