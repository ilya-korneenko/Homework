package Homework4.comparator;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    /**
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return 0, если оба объекта равны; 1, если o1>o2; -1, если o1<o2
     */
    @Override
    public int compare(String o1, String o2) {
        if(o1==null||o2==null)
            return 0;
        char[] firstArray = o1.toCharArray();
        char[] secondArray = o2.toCharArray();
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] > secondArray[i]) {
                return 1;
            } else if (secondArray[i] > firstArray[i]) {
                return -1;
            }
        }
        return 0;
    }
}
