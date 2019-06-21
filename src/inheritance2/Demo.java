package inheritance2;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        //Circle
        System.out.println("Circle");
            Circle circle = new Circle();
            circle.input();
        System.out.println(circle);
        //Rectangle
        System.out.println("Rectangle");
            Rectangle rectangle = new Rectangle();
            rectangle.input();
        System.out.println(rectangle);
        //Square
        System.out.println("Square");
            Square square = new Square();
            square.input();
        System.out.println(square);

        Shape[] array = new Shape[]{circle, rectangle, square};
        for (Shape shape : array){
            if (shape instanceof Circle){
                System.out.println("Circle's area: " + ((Circle)shape).getArea());
            }
            else if (shape instanceof Square){
                System.out.println("Square's perimeter: " + ((Square)shape).getPerimeter());
            }
            else if (shape instanceof Rectangle){
                System.out.println("Rectangle's perimeter: " + ((Rectangle)shape).getPerimeter());
            }
        }
    }

}

