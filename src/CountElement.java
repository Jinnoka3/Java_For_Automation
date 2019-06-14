package practice;

import java.util.Scanner;

public class CountElement {

    final static String TEXT = "Hello, you are pretty!";

    public static void main(String[] args) {

        System.out.println(TEXT);
        Scanner in = new Scanner(System.in);
        System.out.println("input symbol: ");
        char symbol = in.next().charAt(0);
       // System.out.println(symbol);
        int count = 0;
        char[] array = TEXT.toCharArray();
        for (int i = 0; i < array.length; i++){

           // System.out.println(array[i]);
            if (array[i] == symbol){
                count++;
            }
        }
        System.out.println("number occurrence: " + count);

    }


}


