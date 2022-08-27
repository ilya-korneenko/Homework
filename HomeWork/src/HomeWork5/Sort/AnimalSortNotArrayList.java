package HomeWork5.Sort;

import HomeWork5.dto.Animal;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AnimalSortNotArrayList {
    private final AnimalSort animalSort = new AnimalSort();

    public ArrayList animalSort(Collection collection){
        Iterator<Animal> it = collection.iterator();

        ArrayList<Animal> animalArrayList = new ArrayList<>();
        for (int i = 0; i < collection.size(); i++) {
            Animal animal;
            animal = it.next();
            animalArrayList.add(animal);

        }
        animalSort.animalSort(animalArrayList);
        return animalArrayList;
    }
}
