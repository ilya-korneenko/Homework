package Homework4.comparator;

import java.util.Comparator;

public class DataComparator <T extends Comparable<T>> implements Comparator<T> {
    /**
     *
      * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return 0, если оба объекта равны; 1, если o1>o2; -1, если o1<o2
     */
    @Override
    public int compare(T o1, T o2) {
        return o1.compareTo(o2);
    }
}
