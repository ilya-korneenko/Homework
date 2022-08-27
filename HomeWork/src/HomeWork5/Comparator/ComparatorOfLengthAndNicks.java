package HomeWork5.Comparator;

import HomeWork5.dto.Person;

import java.util.Comparator;

public class ComparatorOfLengthAndNicks implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int res = o1.getPassword().length()-o2.getPassword().length();
        if(res!=0){
            return res;
        }else{
            return o1.getNick().compareTo(o2.getNick());
        }
    }
}
