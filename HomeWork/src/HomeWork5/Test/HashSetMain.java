package HomeWork5.Test;

import HomeWork5.dto.Animal;
import HomeWork5.dto.Person;
import HomeWork5.Service.PasswordPerson;
import HomeWork5.Service.ServiceName;
import HomeWork5.Service.ServiceNickAnimal;
import HomeWork5.Service.ServiceNickPerson;
import HomeWork5.Sort.AnimalSortNotArrayList;
import HomeWork5.Sort.PersonSortNotArrayList;

import java.util.HashSet;
import java.util.concurrent.ThreadLocalRandom;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet<Person> personHashSet = new HashSet<>();
        HashSet<Animal> animalHashSet = new HashSet<>();

        PasswordPerson password = new PasswordPerson();
        ServiceName service = new ServiceName();
        ServiceNickPerson nickPerson = new ServiceNickPerson();

        ServiceNickAnimal nickAnimal = new ServiceNickAnimal();

        for (int i = 0; i < 10_000; i++) {
            Person person = new Person();
            Animal animal = new Animal();

            person.setPassword(String.valueOf(password.passwordForMany()));
            person.setNick(String.valueOf(nickPerson.RandomGenericEnglishNickPerson(8)));
            person.setName(service.RandomGenericTruName());

            animal.setNick(String.valueOf(nickAnimal.RandomGenericNickAnimal(6)));
            animal.setAge(ThreadLocalRandom.current().nextInt(5, 25));

            animalHashSet.add(animal);
            personHashSet.add(person);
        }


        AnimalSortNotArrayList animalSortNotArrayList = new AnimalSortNotArrayList();
        PersonSortNotArrayList personSortNotArrayList = new PersonSortNotArrayList();

        double start = System.currentTimeMillis();
        animalSortNotArrayList.animalSort(animalHashSet);
        double finish = System.currentTimeMillis();
        double timeOperation = finish - start;
        System.out.println("Операция: сортировка Animal в HashSet. Заняла: " +
                timeOperation + " мс");

        start = System.currentTimeMillis();
        personSortNotArrayList.personSort(personHashSet);
        finish = System.currentTimeMillis();
        timeOperation = finish - start;
        System.out.println("Операция: сортировка Person в HashSet. Заняла: " +
                timeOperation + " мс");

    }
}
