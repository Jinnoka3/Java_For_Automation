package inheritance2;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    protected Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    protected Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    protected Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
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

    protected double getPerimeter(){
        return (2 * (width + length));
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + width + " and length = " + length + ", which is a subclass of " + super.toString();
    }
}
