package inheritance1;

public class Circle {

    protected double radius;
    protected Color color;

    protected Circle(){
    }

    protected Circle(double radius){
        this.radius = radius;
    }

    protected Circle(double radius, Color color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color colour) {
        this.color = colour;
    }

    protected double getArea() {
        final double PI = 3.1415926536;
        double area = PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public String toString() {
        return "Radius: " + radius + "\nColor: " + color.name().toLowerCase() + "\nArea: " + getArea();
    }

}