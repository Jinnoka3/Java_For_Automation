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
            return "Person's name " + this.name + " and age " + this.age;
        }

        @Override
        public boolean equals(Object o) {

            if (o == this)
                return true;
            if (!(o instanceof Person)) {
                return false;
            }
            Person user = (Person) o;
            return age == user.age &&
                    Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }

    public static void main(String[] args) {

        HashSet<Person> personHashSet = new HashSet<>();
        System.out.println("Add");
        Person misha1 = new Person("Misha", 15);
        System.out.println(misha1.hashCode());
        personHashSet.add(misha1);
        personHashSet.add(new Person("Jenya", 21));
        Person remove = new Person("Dasha", 12);
        personHashSet.add(remove);
        displayInfo(personHashSet);

        System.out.println("Edit (try to add second Misha 15)");
        Person misha2 = new Person("Misha", 15);
        Person misha3 = new Person("Misha", 16);
        System.out.println(misha2.equals(misha1));
        System.out.println(misha2.hashCode());
        personHashSet.add(misha2);
        personHashSet.add(misha3);
        displayInfo(personHashSet);

        System.out.println("Edit (Anon instead Misha 16)");
        System.out.println();
        for(Object i : personHashSet)
            if(i.equals(new Person("Misha", 16))) {
                personHashSet.remove(i);
                personHashSet.add(new Person("Anon", 0));
                break;
            }
        displayInfo(personHashSet);

        System.out.println("Remove Dasha");
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
