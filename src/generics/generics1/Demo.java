package generics.generics1;

import inheritance.inheritance2.Shape;

public class Demo {
    public static void main(String[] args) {

        Pair<String, Shape> objectsPair = new Pair<>("Figure", new Shape());
        //objectsPair.input();
        System.out.println("Name: " + objectsPair.getFirst());
        System.out.println("Shape: " + objectsPair.getSecond());
        objectsPair.showType();

    }
}
