package inner1;

public class Demo {
    public static void main(String[] args) {

        //Circle
        System.out.println("Circle");
            Circle circle = new Circle();
            circle.input();
        System.out.println(circle);

        if(circle.isInside()){
            System.out.println("Point is inside");
        }
        else
            System.out.println("Point isn't inside");

        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        //Rectangle
        System.out.println();
        System.out.println("Rectangle");
            Rectangle rectangle = new Rectangle();
            rectangle.input();
        System.out.println(rectangle);

        if(rectangle.isInside()){
            System.out.println("Point is inside");
        }
        else
            System.out.println("Point isn't inside");

        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        //Square
        System.out.println();
        System.out.println("Square");
            Square square = new Square();
            square.input();
        System.out.println(square);

        if(square.isInside()){
            System.out.println("Point is inside");
        }
        else
            System.out.println("Point isn't inside");

        System.out.println("Area: " +square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }

}

