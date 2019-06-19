package inheritance1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        double radiusCircle;
        double radiusCylinder;
        double height;
        //Circle
        Scanner in = new Scanner(System.in);
        System.out.println("Enter circle's radius:");
        try {
            radiusCircle = Double.parseDouble(in.nextLine());
        } catch (NumberFormatException e) {
            radiusCircle = 0;
        }

        if (radiusCircle <= 0) {
            System.out.println("Wrong radius");
            System.exit(0);
        }

        System.out.println("Enter circle's color:");
        String str = in.nextLine();

        if (checkColor(str) == false) {
            System.out.println("Wrong color");
        }
        else {
            Circle circle = new Circle(radiusCircle, Color.valueOf(str.toUpperCase()));
            System.out.println(circle);
        }

        //Cylinder
        System.out.println("Enter cylinder's radius:");
        try {
            radiusCylinder = Double.parseDouble(in.nextLine());
        } catch (NumberFormatException e) {
            radiusCylinder = 0;
        }

        if (radiusCylinder <= 0) {
            System.out.println("Wrong radius");
            System.exit(0);
        }

        System.out.println("Enter cylinder's height:");
        try {
            height = Double.parseDouble(in.nextLine());
        } catch (NumberFormatException e) {
            height = 0;
        }

        if (height <= 0) {
            System.out.println("Wrong height");
            System.exit(0);
        }

        System.out.println("Enter cylinder's color:");
        String str2 = in.nextLine();

        if (checkColor(str2) == false) {
            System.out.println("Wrong color");
        }
        else {
            Cylinder cylinder = new Cylinder(radiusCylinder,height, Color.valueOf(str2.toUpperCase()));
            System.out.println(cylinder);
        }
    }

    public static boolean checkColor(String str){
        for(Color c : Color.values()){
            if(c.name().equals(str.toUpperCase())){
                return true;
            }
        }
        return false;
    }
}

