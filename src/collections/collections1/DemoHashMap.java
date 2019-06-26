package collections.collections1;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

    public static void main(String[] args) {

        System.out.println("Add");
        Map<String, String> students = new HashMap<>();
        students.put("VolGU", "Misha");
        students.put("VolGU", "Jenya");
        students.put("VolGTU", "Ilya");
        students.put("VolGTU", "David");
        students.put("VolGTU", "someone");

        for (Map.Entry<String, String> item : students.entrySet()){
            System.out.println("Key: " + item.getKey() + " Name: " + item.getValue());
        }
        System.out.println();
        System.out.println("Edit");
        students.replace("VolGU", "Misha","Dasha");
        students.put("VolGU", "Jenya"); // already exist
        students.put("VolGTU", "Dima");
        for (Map.Entry<String, String> item : students.entrySet()){
            System.out.println("Key: " + item.getKey() + " Name: " + item.getValue());
        }

        System.out.println();
        System.out.println("Remove");
        students.remove("VolGTU", "someone");
        for (Map.Entry<String, String> item : students.entrySet()){
            System.out.println("Key: " + item.getKey() + " Name: " + item.getValue());
        }
    }

}
