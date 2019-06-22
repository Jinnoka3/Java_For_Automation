package inner1;

import java.util.Scanner;

public abstract class Shape {

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract boolean isInside();

    public static class Point{
        private static double x;
        private static double y;

        static {
            x = 0;
            y = 0;
        }

        public static double getX() {
            return x;
        }

        public static void setX(double xx) {
            x = xx;
        }

        public static double getY() {
            return y;
        }

        public static void setY(double yy) {
            y = yy;
        }

        public static void input() {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter x:");
            double x = in.nextDouble();
            setX(x);

            System.out.println("Enter y:");
            double y = in.nextDouble();
            setY(y);
        }
    }
}
