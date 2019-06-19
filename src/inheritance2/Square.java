package inheritance2;

public class Square extends Rectangle {

    protected Square() {
    }

    protected Square(double side) {
        super(side, side);
    }

    protected Square(double side, String color, boolean filled) {
        super(side, side);
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }
    @Override
    public void setWidth(double side) {
        super.width = side;
    }

    public double getLength() {
        return length;
    }
    @Override
    public void setLength(double side) {
        super.length = side;
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

    @Override
    protected double getPerimeter(){
        return super.getPerimeter();
    }

    @Override
    public String toString() {
        return "A Square with side = " + width + ", which is a subclass of " + super.toString();
    }
}
