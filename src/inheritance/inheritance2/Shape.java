package inheritance.inheritance2;

import java.util.Scanner;

public class Shape {

    private String color;
    private boolean filled;

    public Shape(){
        this.color = "green";
        this.filled = true;
    }
    public Shape(String color, boolean filled){
        setColor(color);
        setFilled(filled);
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!Color.checkColor(color)) {
            System.out.println("Wrong color");
        }
        else {
            this.color = color;
        }
    }
    public boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String filled(){
        String str = (filled == true) ? "filled" : "not filled";
        return str;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter color:");
        String color = in.nextLine();
        setColor(color);

        System.out.println("Enter filled (true/false):");
        boolean filled = in.nextBoolean();
        setFilled(filled);

    }

    @Override
    public String toString() {
        return "A Shape with the color of " + color + " and " + filled();
    }
}
