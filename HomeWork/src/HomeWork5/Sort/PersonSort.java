package HomeWork5.Sort;

import HomeWork5.Comparator.ComparatorOfLengthAndNicks;

import java.util.ArrayList;

public class PersonSort {
    private ComparatorOfLengthAndNicks comparator = new ComparatorOfLengthAndNicks();

    public ArrayList personSort(ArrayList arrayList){
        arrayList.sort(comparator);
        return arrayList;
    }
}
