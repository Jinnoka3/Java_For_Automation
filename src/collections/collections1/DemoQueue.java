package collections.collections1;

import java.util.*;

public class DemoQueue {

    public static void main(String[] args) {
        Queue numbers = new LinkedList();
        System.out.println("Add");
        numbers.add(1);
        numbers.add(5);
        numbers.add(7);
        numbers.add(0);
        for (Object n : numbers){
            System.out.println(n);
        }
        System.out.println();

        System.out.println("Offer 10");
        numbers.offer(10);
        for (Object n : numbers){
            System.out.println(n);
        }
        System.out.println();

        System.out.println("Remove 5");
        numbers.remove(5);
        for (Object n : numbers){
            System.out.println(n);
        }
        System.out.println();
        System.out.println("Peek");
        System.out.println(numbers.peek());
        System.out.println();
        System.out.println("After peek");
        for (Object n : numbers){
            System.out.println(n);
        }
        System.out.println();
        System.out.println("Poll");
        System.out.println(numbers.poll());
        System.out.println();
        System.out.println("After poll");
        for (Object n : numbers){
            System.out.println(n);
        }
        System.out.println();
        System.out.println("Sort");
        List sortedList = new ArrayList(numbers);
        Collections.sort(sortedList);
        for(int i = 0; i < sortedList.size(); i++){
            System.out.println(sortedList.get(i));
        }
    }
}
