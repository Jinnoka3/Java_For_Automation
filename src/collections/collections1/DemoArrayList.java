package collections.collections1;

import java.util.ArrayList;
import static java.util.Collections.sort;

public class DemoArrayList {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        //add
        names.add("Anon");
        names.add("Misha");
        names.add("Dasha");
        names.add("Iliya");
        names.add("Jenya");
        names.add("David");
        names.add("Dima");
        names.add("Someone");
        displayInfo(names);
        //edit
        names.set(0, "Artem");
        displayInfo(names);
        //remove
        names.remove(7);
        displayInfo(names);
        //sort
        sort(names);
        displayInfo(names);
    }

    public static void displayInfo(ArrayList<String> names) {
        for (String n : names) {
            System.out.println(n);
        }
        System.out.println();
    }
}
