package collections.collections3;

import java.util.Iterator;

public class LinkedList implements Iterable<Integer> {

    private static class Node {

        int data;
        Node next;
    }

    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void remove(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
        }
    }

    public Node reverse(Node curr) {
        Node prev = null;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private class ListIterator implements Iterator<Integer> {

        private Node currNode;
        private ListIterator(Node start) {
            currNode = start;
        }

        @Override
        public boolean hasNext() {
           return currNode != null;
        }

        @Override
        public Integer next() {
            int value = currNode.data;
            currNode = currNode.next;
            return value;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ListIterator(head);
    }
}
