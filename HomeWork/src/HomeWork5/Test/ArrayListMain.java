package HomeWork5.Test;

import HomeWork5.Service.*;
import HomeWork5.dto.Animal;
import HomeWork5.dto.Person;
import HomeWork5.Sort.AnimalSort;
import HomeWork5.Sort.PersonSort;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayListMain<S>  {


    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();
        ArrayList<Animal> animalArrayList = new ArrayList<>();

        ServiceNickAnimal serviceNickAnimal = new ServiceNickAnimal();
        PasswordPerson password = new PasswordPerson();
        ServiceName service = new ServiceName();
        ServiceNickPerson nickPerson = new ServiceNickPerson();

        for (int i = 0; i < 10_000; i++) {
            Person pers = new Person();
            Animal animal = new Animal();

            animal.setAge(ThreadLocalRandom.current().nextInt(1,100));
            animal.setNick(serviceNickAnimal.RandomGenericTruNickAnimal());

            pers.setName(service.RandomGenericTruName());
            pers.setNick(String.valueOf(nickPerson.RandomGenericNickPerson(32)));
            pers.setPassword(String.valueOf(password.passwordForMany()));

            personArrayList.add(i,pers);
            animalArrayList.add(i,animal);
        }

        AnimalSort animalSort = new AnimalSort();

        PersonSort personSort = new PersonSort();

        double start = System.currentTimeMillis();
        personSort.personSort(personArrayList);
        double finish = System.currentTimeMillis();
        double timeOperation = finish - start;
        System.out.println("Операция: сортировка Person в ArrayList. Заняла: " +
                timeOperation +" мс");

        start = System.currentTimeMillis();
        animalSort.animalSort(animalArrayList);
        finish = System.currentTimeMillis();
        timeOperation = finish - start;
        System.out.println("Операция: сортировка Animal в ArrayList. Заняла: " +
                timeOperation +" мс");

        System.out.println(personArrayList);
//        DeleteCollection deleteCollection = new DeleteCollection();
//        deleteCollection.deleteCollectionPerson(personArrayList);
//        System.out.println("Новая: " + personArrayList);
    }

}

