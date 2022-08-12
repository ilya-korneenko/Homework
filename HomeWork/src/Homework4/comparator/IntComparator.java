package Homework4.comparator;

import java.util.Comparator;

public class IntComparator implements Comparator<Integer> {
    /**
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return 0, если оба объекта равны; 1, если o1>o2; -1, если o1<o2
     */
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 != null && o2 != null && o1 > o2) {
            return 1;
        } else if (o1 != null && o2 != null && o1 < o2) {
            return -1;
        } else {
            return 0;
        }
    }
}
