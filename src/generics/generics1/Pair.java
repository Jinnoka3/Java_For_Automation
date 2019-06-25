package generics.generics1;

import java.util.Scanner;

public class Pair<T, K> {
    private T first;
    private K second;

    Pair(T first, K second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public K getSecond(){
        return second;
    }

    public void setSecond(K second) {
        this.second = second;
    }

    public void showType(){
        System.out.println(first.getClass().getName());
        System.out.println(second.getClass().getName());
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name:");
        T name = (T) in.nextLine();
        setFirst(name);
    }
}