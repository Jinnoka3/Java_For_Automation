package inheritance2;

public class Circle extends Shape{

    protected double radius;

    protected Circle(){
        this.radius = 1.0;
    }

    protected Circle(double radius){
        this.radius = radius;
    }

    protected Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    protected double getArea() {
        final double PI = 3.1415926536;
        double area = PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + radius + ", which is a subclass of " + super.toString();
    }

}