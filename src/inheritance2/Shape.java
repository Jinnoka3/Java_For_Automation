package inheritance2;

public class Shape {
    protected String color;
    protected boolean filled;

    protected Shape(){
        this.color = "green";
        this.filled = true;
    }
    protected Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
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

    protected String filled(){
        String str = (filled == true) ? "filled" : "not filled";
        return str;
    }

    @Override
    public String toString() {
        return "A Shape with the color of " + color + " and " + filled();
    }
}
