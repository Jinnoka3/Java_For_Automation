package generics.generics2;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter first:");
        String line1 = in.nextLine();

        System.out.println("Enter second:");
        String  line2 = in.nextLine();
        if (GenericMethod.isEquals(line1, line2)){
            System.out.println("Equals!");
        }
        else
        System.out.println("Not equals!");

    }
}