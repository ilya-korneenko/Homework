package HomeWork5.Sort;

import HomeWork5.Comparator.ComparatorOfAgeAndNick;

import java.util.ArrayList;


public class AnimalSort {

    private ComparatorOfAgeAndNick comparator = new ComparatorOfAgeAndNick();

    public ArrayList animalSort(ArrayList arrayList){
        arrayList.sort(comparator);
        return arrayList;
    }
}
