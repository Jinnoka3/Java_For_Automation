package inheritance3;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //INT
        System.out.println("Enter int array size: ");
        int n1 = in.nextInt();
        if (n1 < 1){
            System.out.print("Wrong size");
        }

        System.out.print("Enter int elements: ");
        int[] arrayInt = new int[n1];
        for(int i = 0; i < arrayInt.length; i++){
            arrayInt[i] = in.nextInt();
        }
        Arrays.sort(arrayInt);
        System.out.println("Lowest number: " + Math.min(arrayInt));
        System.out.println("Biggest number: " + Math.max(arrayInt));

        System.out.println("Enter int number: ");
        int num = in.nextInt();

        System.out.println("First int number is greater than parameter: " + Math.nextAfter(arrayInt, num));

        //DOUBLE
        System.out.println("Enter double array size: ");
        int n2 = in.nextInt();
        if (n1 < 1){
            System.out.print("Wrong size");
        }

        System.out.print("Enter double elements: ");
        double[] arrayDouble = new double[n2];
        for(int i = 0; i < arrayDouble.length; i++){
            arrayDouble[i] = in.nextDouble();
        }
        Arrays.sort(arrayDouble);
       // Math math2 = new Math(arrayInt);
        System.out.println("Lowest number: " + Math.min(arrayDouble));
        System.out.println("Biggest number: " + Math.max(arrayDouble));

        System.out.println("Enter double number: ");
        double num2 = in.nextDouble();
        System.out.println("First int number is greater than parameter: " + Math.nextAfter(arrayDouble, num2));

        //3
        System.out.println("Pow: ");
        System.out.println("Enter int number: ");
        int a = in.nextInt();
        System.out.println("Enter a power: ");
        int b = in.nextInt();
        System.out.println(Math.pow(a, b));

        System.out.println("Enter double number: ");
        double c = in.nextDouble();
        System.out.println("Enter a power: ");
        int d = in.nextInt();
        System.out.println(Math.pow(c, d));
    }

}
