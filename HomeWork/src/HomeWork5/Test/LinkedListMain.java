package HomeWork5.Test;

import HomeWork5.dto.Animal;
import HomeWork5.dto.Person;
import HomeWork5.Service.PasswordPerson;
import HomeWork5.Service.ServiceName;
import HomeWork5.Service.ServiceNickAnimal;
import HomeWork5.Service.ServiceNickPerson;
import HomeWork5.Sort.AnimalSortNotArrayList;
import HomeWork5.Sort.PersonSortNotArrayList;

import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class LinkedListMain {
    //LinkedList<Person> personLinkedList = new LinkedList<>();

    public static void main(String[] args) {
        LinkedList<Person> personLinkedList = new LinkedList<>();
        LinkedList<Animal> animalLinkedList = new LinkedList<>();


        PasswordPerson password = new PasswordPerson();
        ServiceName service = new ServiceName();
        ServiceNickPerson nickPerson = new ServiceNickPerson();

        ServiceNickAnimal nickAnimal = new ServiceNickAnimal();


        for (int i = 0; i < 100_000; i++) {
            Animal animal = new Animal();
            animal.setNick(nickAnimal.RandomGenericTruNickAnimal());
            animal.setAge(ThreadLocalRandom.current().nextInt(1, 100));
            animalLinkedList.add(i, animal);
        }

        for (int i = 0; i < 100_000; i++) {
            Person pers = new Person();
            pers.setName(service.RandomGenericTruName());
            pers.setNick(String.valueOf(nickPerson.RandomGenericNickPerson(32)));
            pers.setPassword(String.valueOf(password.passwordForMany()));
            personLinkedList.add(i, pers);
        }

        AnimalSortNotArrayList animalSortNotArrayList = new AnimalSortNotArrayList();
        PersonSortNotArrayList personSortNotArrayList = new PersonSortNotArrayList();

        double start = System.currentTimeMillis();
        personSortNotArrayList.personSort(personLinkedList);
        double finish = System.currentTimeMillis();
        double timeOperation = finish - start;
        System.out.println("Операция: сортировка Person в LinkedList. Заняла: " +
                timeOperation + " мс");

        start = System.currentTimeMillis();
        animalSortNotArrayList.animalSort(animalLinkedList);
        finish = System.currentTimeMillis();
        System.out.println("Операция: сортировка Animal в LinkedList. Заняла: " +
                timeOperation + " мс");
    }
}
