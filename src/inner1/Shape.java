package inner1;

import java.util.Scanner;

public abstract class Shape {

    private double x;
    private double y;

    public Shape(){
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
            this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
            this.y = y;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
         System.out.println("Enter x:");
         double x = in.nextDouble();
         setX(x);

        System.out.println("Enter y:");
        double y = in.nextDouble();
        setY(y);
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract boolean isInside();
}
