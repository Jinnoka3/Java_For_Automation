package collections.collections2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Demo {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Person("Misha", 15));
        persons.add(new Person("Misha", 12));
        persons.add(new Person("Misha", 17));
        persons.add(new Person("Dasha", 12));
        persons.add(new Person("Iliya", 24));
        persons.add(new Person("Jenya", 22));
        persons.add(new Person("David", 21));
        persons.add(new Person("Dima", 24));
        persons.add(new Person("Dima", 24));
        persons.add(new Person("Dima", 24));
        Collections.sort(persons);
        System.out.println("Comparable:");
        displayInfo(persons);

        System.out.println("Comparator:");
        Collections.sort(persons, new Person.NameSorter()
                .thenComparing(new Person.AgeSorter()));
        displayInfo(persons);

        System.out.println("Uniq:");
        displayInfo1(uniq(persons));

    }

    public static void displayInfo1(HashSet<Person> names) {
        for (Person n : names) {
            System.out.println(n);
        }
        System.out.println();
    }

    public static void displayInfo(ArrayList<Person> names) {
        for (Person n : names) {
            System.out.println(n);
        }
        System.out.println();
    }

    public static HashSet<Person> uniq(ArrayList<Person> p){

        HashSet<Person> uniqList = new HashSet<>(p);
        return uniqList;
    }

}
