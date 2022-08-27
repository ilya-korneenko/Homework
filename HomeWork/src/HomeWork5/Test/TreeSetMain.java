package HomeWork5.Test;

import HomeWork5.Comparator.ComparatorOfAgeAndNick;
import HomeWork5.Comparator.ComparatorOfLengthAndNicks;
import HomeWork5.dto.Animal;
import HomeWork5.dto.Person;
import HomeWork5.Service.PasswordPerson;
import HomeWork5.Service.ServiceName;
import HomeWork5.Service.ServiceNickAnimal;
import HomeWork5.Service.ServiceNickPerson;
import HomeWork5.Sort.AnimalSortNotArrayList;
import HomeWork5.Sort.PersonSortNotArrayList;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class TreeSetMain {

    public static void main(String[] args) {
        ComparatorOfAgeAndNick comp1 = new ComparatorOfAgeAndNick();
        ComparatorOfLengthAndNicks comp2 = new ComparatorOfLengthAndNicks();

        TreeSet<Person> personTreeSet = new TreeSet(comp2);

        TreeSet<Animal> animalTreeSet = new TreeSet(comp1);

        PasswordPerson password = new PasswordPerson();
        ServiceName service = new ServiceName();
        ServiceNickPerson nickPerson = new ServiceNickPerson();

        ServiceNickAnimal nickAnimal = new ServiceNickAnimal();


        for (int i = 0; i < 100_000; i++) {
            Animal animal = new Animal();
            animal.setNick(nickAnimal.RandomGenericTruNickAnimal());
            animal.setAge(ThreadLocalRandom.current().nextInt(1, 100));
            animalTreeSet.add(animal);
        }

        for (int i = 0; i < 100_000; i++) {
            Person pers = new Person();
            pers.setName(service.RandomGenericTruName());
            pers.setNick(String.valueOf(nickPerson.RandomGenericNickPerson(32)));
            pers.setPassword(String.valueOf(password.passwordForMany()));
            personTreeSet.add(pers);
        }

        AnimalSortNotArrayList animalSortNotArrayList = new AnimalSortNotArrayList();
        PersonSortNotArrayList personSortNotArrayList = new PersonSortNotArrayList();

        double start = System.currentTimeMillis();
        personSortNotArrayList.personSort(personTreeSet);
        double finish = System.currentTimeMillis();
        double timeOperation = finish - start;
        System.out.println("Операция: сортировка Person в TreeSet. Заняла: " +
                timeOperation +" мс");

        start = System.currentTimeMillis();
        animalSortNotArrayList.animalSort(animalTreeSet);
        finish = System.currentTimeMillis();
        timeOperation = finish - start;
        System.out.println("Операция: сортировка Animal в TreeSet. Заняла: " +
                timeOperation +" мс");
    }
}
