package inheritance2;

import java.util.Scanner;

public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public void setWidth(double side) {
        if (side <= 0) {
            System.out.println("Wrong side");
        }
        else {
            super.setWidth(side);
            super.setLength(side);
        }
    }

    @Override
    public void setLength(double width) {
        this.setWidth(width);
    }

    @Override
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter color:");
        String color = in.nextLine();
        setColor(color);

        System.out.println("Enter filled (true/false):");
        boolean filled = in.nextBoolean();
        setFilled(filled);

        System.out.println("Enter side:");
        double side = in.nextDouble();
        setWidth(side);
    }

    @Override
    public String toString() {
        return "A Square with side = " + this.getWidth() + ", which is a subclass of " + super.toString();
    }
}
