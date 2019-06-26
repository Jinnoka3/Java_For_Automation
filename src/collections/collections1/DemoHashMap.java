package collections.collections1;

import java.util.*;

public class DemoHashMap {

    public static void main(String[] args) {

        System.out.println("Add");
        Map<String, String> students = new HashMap<>();
        students.put("VolGU", "Misha");
        students.put("VolGTU", "Iliya");
        students.put("VolGMU", "someone");

        for (Map.Entry<String, String> item : students.entrySet()){
            System.out.println("Key: " + item.getKey() + " Name: " + item.getValue());
        }
        System.out.println();
        System.out.println("Edit");
        students.replace("VolGU", "Misha","Dasha");

        for (Map.Entry<String, String> item : students.entrySet()){
            System.out.println("Key: " + item.getKey() + " Name: " + item.getValue());
        }

        System.out.println();
        System.out.println("Remove");
        students.remove("VolGMU");

        for (Map.Entry<String, String> item : students.entrySet()){
            System.out.println("Key: " + item.getKey() + " Name: " + item.getValue());
        }

        System.out.println();
        System.out.println("Sort");
        List sortedList = new ArrayList(students.values());
        Collections.sort(sortedList);
        for(int i = 0; i < sortedList.size(); i++){
            System.out.println("Person's name " + sortedList.get(i));
        }
    }

}
