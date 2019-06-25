package generics.generics2;


import inner.inner1.Circle;
import inner.inner1.Rectangle;
import inner.inner1.Square;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        System.out.println(isEqual(GenericMethod.compareTo(new Circle(5), new Circle(10))));
        System.out.println(isEqual(GenericMethod.compareTo(new Rectangle(5,5), new Rectangle(5,5))));
        System.out.println(isEqual(GenericMethod.compareTo(new Square(5), new Square(9))));

    }
    public static String isEqual(boolean res){
        if (res){
            return "Equals";
        }
        return "Not equals";
    }
}