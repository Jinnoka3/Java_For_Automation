package lambda;

import collections.collections2.Person;

import java.util.ArrayList;
import java.util.Comparator;

public class DemoPerson {

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Person("Mishaaa", 12));
        persons.add(new Person("Mishaaa", 12));
        persons.add(new Person("Mishaaa", 12));
        persons.add(new Person("dasha", 12));
        persons.add(new Person("Iliya", 24));
        persons.add(new Person("Jenya", 32));
        persons.add(new Person("Daviddddddd", 21));

        //1
        System.out.println("20 < age < 30");
        persons.stream().filter(p -> p.getAge() > 20 && p.getAge() < 30)
                .forEach(System.out::println);
        System.out.println();

        //2
        System.out.println("Unique");
        persons.stream().distinct()
                .forEach(System.out::println);
        System.out.println();

        //3
        System.out.println("To upper-case");
        persons.stream().map(p -> p.getName().toUpperCase())
                .forEach(System.out::println);
        System.out.println();

        //4
        System.out.println("Sort");
        Comparator<Person> nameLength = Comparator.comparingInt(p -> p.getName().length());
        persons.stream().sorted(nameLength)
                .forEach(System.out::println);
    }
}
