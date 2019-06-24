package inheritance.inheritance1;

public class Cylinder extends Circle{

    private double height;

    protected Cylinder(){
    }

    protected Cylinder(double radius){
        this.radius = radius;
    }

    protected Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    protected Cylinder(double radius, double height, Color color){
        this.radius = radius;
        this.height = height;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return radius;
    }

    public void setHeight(double radius) {
        this.radius = radius;
    }

    public Color getColour() {
        return color;
    }

    public void setColour(String colour) {
        this.color = color;
    }

    @Override
    protected double getArea() {
        final double PI = 3.1415926536;
        double area = 2 * PI * radius * height + super.getArea();
        return area;
    }

    private double getVolume() {

        double volume = super.getArea() * height;
        return volume;
    }

    @Override
    public String toString() {
        return "Radius: " + radius + "\nColor: " + color.name().toLowerCase() + "\nArea: " + getArea() + "\nVolume: " + getVolume();
    }
}

