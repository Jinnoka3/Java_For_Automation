package inner.inner1;

import java.util.Scanner;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        super();
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            System.out.println("Wrong width");
        }
        else {
            this.width = width;
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            System.out.println("Wrong length");
        }
        else {
            this.length = length;
        }
    }

    public void input() {
        Point.input();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter width:");
        double width = in.nextDouble();
        setWidth(width);

        System.out.println("Enter length:");
        double length = in.nextDouble();
        setLength(length);

    }
    @Override
    public double getPerimeter(){
        return 2 * (this.width + this.length);
    }

    @Override
    public double getArea(){
        return this.width * this.length;
    }

    @Override
    public boolean isInside(){

        if(Math.abs(Point.getX())> width/2 || Math.abs(Point.getY()) > length/2){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + width + " and length = " + length;
    }
}
