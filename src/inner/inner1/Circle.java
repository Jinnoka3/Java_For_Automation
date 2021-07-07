package inner.inner1;

import java.util.Scanner;

public class Circle extends Shape implements Comparable<Circle>{

    private double radius;


    public Circle(){
        super();
        this.radius = 1.0;
    }

    public Circle(double radius){
        super();
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

    public void input() {
            Point.input();
            Scanner in = new Scanner(System.in);
            System.out.println("Enter radius:");
            double radius = in.nextDouble();
            setRadius(radius);
    }

    @Override
    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }//////////////////////////////////////////

    @Override
    public boolean isInside(){

        if(Math.abs(Point.getX())> radius || Math.abs(Point.getY()) > radius){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + radius;
    }

    @Override
    public int compareTo(Circle x) {
        return this.getArea() != x.getArea() ? 1 : 0;
    }
}
