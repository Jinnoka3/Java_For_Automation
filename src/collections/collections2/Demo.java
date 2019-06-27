package collections.collections2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Demo {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        //first ArrayList
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

        //second ArrayList
        ArrayList<Person> persons1 = new ArrayList<>();
        persons1.add(new Person("Misha", 17));
        persons1.add(new Person("Misha", 15));
        ArrayList<Person> persons2 = new ArrayList<>();
        persons2.add(new Person("Misha", 17));
        persons2.add(new Person("Misha", 15));
        //persons2.add(new Person("Misha", 0));

        Collections.sort(persons);
        System.out.println("Comparable:");
        displayInfo(persons);

        System.out.println("Comparator:");
        Collections.sort(persons, new Person.NameSorter()
                .thenComparing(new Person.AgeSorter()));
        displayInfo(persons);

        System.out.println("Uniq:");
        displayInfo1(uniq(persons));

        System.out.println("Equals:");
        System.out.println(compareTo(persons1, persons2));
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

    public static boolean compareTo(ArrayList<Person> p1, ArrayList<Person> p2){

        if (p1.equals(p2)) {
            return true;
        } else
            return false;
    }
}
