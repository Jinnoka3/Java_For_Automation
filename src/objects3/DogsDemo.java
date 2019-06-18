import java.util.*;

public class DogsDemo {
    static public class NameSorter implements Comparator<Dog>
    {
        public int compare(Dog d1, Dog d2)
        {
            return d1.name.compareTo(d2.name);
        }
    }
    static  public class SizeSorter implements Comparator<Dog>
    {
        public int compare(Dog d1, Dog d2)
        {
            return d1.getSize().compareTo(d2.getSize());
        }
    }
    static public class AgeSorter implements Comparator<Dog>
    {
        public int compare(Dog o1, Dog o2)
        {
            return o1.age - o2.age;
        }
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter num of dogs:");
        int num;
        try {
            num = Integer.parseInt(in.nextLine());
        } catch (NumberFormatException e) {
            num = 0;
        }

        if (num < 0) {
            System.out.println("Wrong numbers of dogs");
        } else System.out.println("Numbers of dogs: " + num);

        List<Dog> array = new ArrayList<Dog>();

        for(int i = 0; i < num; i++){
            String name;
            String size;
            int age;
            System.out.println("Enter dog's name:");
            name = in.nextLine();
            System.out.println("Enter dog's size:");
            size = in.nextLine();
            if (!size.equals("big") && !size.equals("medium") && !size.equals("small") && !size.isEmpty()) {
                System.out.println("Wrong size");
                size = "";
            }
            System.out.println("Enter dog's age:");
            try {
                age = Integer.parseInt(in.nextLine());
                if (age < 1 || age > 20){
                    System.out.println("Wrong age");
                    age = 0;
                }

            } catch (NumberFormatException e) {
                age = 0;
            }
            array.add(new Dog(name, size, age));
        }

        for(int i = 0; i < num; i++){
            // System.out.println("name: " + array.get(i).name + " size: " + array.get(i).size + " age: " + array.get(i).age);
        }
        System.out.println();
        Collections.sort(array, new NameSorter()
                .thenComparing(new SizeSorter())
                .thenComparing(new AgeSorter()));
        for(int i = 0; i < num; i++){
            System.out.println("name: " + array.get(i).name + ", size: " + array.get(i).size + ", age: " + array.get(i).age);
        }
    }
}