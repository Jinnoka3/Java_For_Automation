package inheritance2;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        double radius;
        double width;
        double length;
        double side;

        Scanner in = new Scanner(System.in);
        //Shape
        System.out.println("Enter shape's color:");
        String str = in.nextLine();

        if (checkColor(str) == false) {
            System.out.println("Wrong color");
        } else {
            System.out.println("Enter filled (true/false):");
            boolean filled = in.nextBoolean();
            Shape shape = new Shape(str, filled);
            System.out.println(shape);
        }

        //Circle
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter circle's color:");
        String str1 = in1.nextLine();

        if (checkColor(str1) == false) {
            System.out.println("Wrong color");
        } else {
            System.out.println("Enter filled (true/false):");
            boolean filled1 = in1.nextBoolean();
            System.out.println("Enter circle's radius:");
            radius = in1.nextDouble();

            if (radius <= 0) {
                System.out.println("Wrong radius");
                System.exit(0);
            }

            Circle circle = new Circle(radius, str1, filled1);
            System.out.println(circle);
            System.out.println("Area: " + circle.getArea());
        }

        //Rectangle
        Scanner in2 = new Scanner(System.in);
        System.out.println("Enter rectangle's color:");
        String str2 = in2.nextLine();

        if (checkColor(str2) == false) {
            System.out.println("Wrong color");
        } else {
            System.out.println("Enter filled (true/false):");
            boolean filled2 = in2.nextBoolean();
            System.out.println("Enter width:");
            width = in2.nextDouble();
            if (width <= 0) {
                System.out.println("Wrong width");
                System.exit(0);
            }
            System.out.println("Enter length:");
            length = in2.nextDouble();
            if (length <= 0) {
                System.out.println("Wrong length");
                System.exit(0);
            }

            Rectangle rectangle = new Rectangle(width, length, str2, filled2);
            System.out.println(rectangle);
            System.out.println("Perimeter: " + rectangle.getPerimeter());
        }

        //Square
        Scanner in3 = new Scanner(System.in);
        System.out.println("Enter square's color:");
        String str3 = in3.nextLine();

        if (checkColor(str3) == false) {
            System.out.println("Wrong color");
        } else {
            System.out.println("Enter filled (true/false):");
            boolean filled3 = in3.nextBoolean();
            System.out.println("Enter side:");
            side = in3.nextDouble();
            if (side <= 0) {
                System.out.println("Wrong width");
                System.exit(0);
            }

            Square square = new Square(side, str3, filled3);
            System.out.println(square);
            System.out.println("Perimeter: " + square.getPerimeter());
        }

    }
    public static boolean checkColor (String str){
        for (Color c : Color.values()) {
            if (c.name().equals(str.toUpperCase())) {
                return true;
            }
        }
        return false;
    }
}
