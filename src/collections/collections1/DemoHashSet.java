package collections.collections1;

import java.util.*;

public class DemoHashSet {
     public static class NameSorter implements Comparator<Person>
    {
        public int compare(Person d1, Person d2)
        {
            return d1.name.compareTo(d2.name);
        }
    }

    public static class Person {
        private String name;
        private int age;

        Person() {
            this.name = "lol";
            this.age = 1;
        }

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person'a name " + this.name + " and age " + this.age;
        }
    }

    public static void main(String[] args) {

        HashSet<Person> personHashSet = new HashSet<>();
        System.out.println("Add");
        personHashSet.add(new Person("Misha", 15));
        personHashSet.add(new Person("Jenya", 21));
        Person remove = new Person("Dasha", 12);
        personHashSet.add(remove);
        displayInfo(personHashSet);

        System.out.println("Edit");
        //personHashSet.add(new Person("Misha", 15)); // already exists
        displayInfo(personHashSet);

        System.out.println("Remove");
        personHashSet.remove(remove);
        displayInfo(personHashSet);

        System.out.println("Sort");
        List<Person> sortedList = new ArrayList<>(personHashSet);
        Collections.sort(sortedList, new NameSorter());
        for(int i = 0; i < sortedList.size(); i++){
            System.out.println("Person's name " + sortedList.get(i).name + " and age " + sortedList.get(i).age);
        }
    }

    public static void displayInfo(HashSet<Person> personHashSet) {
        for (Person n : personHashSet) {
            System.out.println(n.toString());
        }
        System.out.println();
    }
}
