package inheritance.inheritance2;

import java.util.Scanner;

public class Circle extends Shape{

    private double radius;

    public Circle(){
        super();
        this.radius = 1.0;
    }

    public Circle(double radius){
        super();
        setRadius(radius);
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            System.out.println("Wrong radius");
        }
        else {
            this.radius = radius;
        }
    }
    @Override
    public void input() {
            super.input();
            Scanner in = new Scanner(System.in);
            System.out.println("Enter radius:");
            double radius = in.nextDouble();
            setRadius(radius);
    }
    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + radius + ", which is a subclass of " + super.toString();
    }

}
