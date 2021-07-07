package collections.collections3;

import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(0);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.remove(1);

        list.head = list.reverse(list.head);

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            int cur = it.next();
            System.out.println(cur);
        }
    }
}
