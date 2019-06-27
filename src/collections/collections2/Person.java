package collections.collections2;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person>{
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int compareTo(Person p){

        return name.compareTo(p.getName());
    }

    @Override
    public String toString() {
        return "Person's name " + this.name + " and age " + this.age;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static class NameSorter implements Comparator<Person>
    {
        @Override
        public int compare(Person d1, Person d2)
        {
            return d1.name.compareTo(d2.name);
        }
    }

    static public class AgeSorter implements Comparator<Person>
    {
        @Override
        public int compare(Person d1, Person d2)
        {
            return d1.age - d2.age;
        }
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
}