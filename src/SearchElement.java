import java.util.Arrays;
import java.util.Scanner;


public class SearchElement {

    public static void main(String[] args) {
        input();
    }

    static void input(){
        Scanner in1 = new Scanner(System.in);
        System.out.print("Input array size: ");
        int num1 = in1.nextInt();

        Scanner in2 = new Scanner(System.in);
        System.out.print("Input a number to search: ");
        int num2 = in2.nextInt();
        int[] array;
        array = new int[num1];
        for (int i = 0; i < num1; i++){
            array[i] = (int) (Math.random()*num1);
        }
        Arrays.sort(array);
        for (int i = 0; i < num1; i++){
            System.out.println(array[i]);
        }

        System.out.println();
        long t0 = System.nanoTime();
        regularSearch(array, num2);
        long t1 = System.nanoTime();
        System.out.println("time: " + (double)(t1 - t0));
        System.out.println();
        long t2 = System.nanoTime();
        binarySearch(array, num2);
        long t3 = System.nanoTime();
        System.out.println("time: " + (double)(t3 - t2));
    }

    static void regularSearch(int[] arr, int num){
        System.out.print("Regular Search");
        System.out.println();
        boolean bool = false;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == num){
                bool = true;
                //System.out.println(arr[i]);
            }
        }
        System.out.println(bool);
    }

    static void binarySearch(int[] arr, int num){
        boolean bool = false;
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        System.out.print("Binary Search");
        System.out.println();
        while (firstIndex <= lastIndex) {
            int midIndex = (firstIndex + lastIndex)/2;
            if (arr[midIndex] == num){
               // System.out.println(arr[midIndex]);
                bool = true;
                break;
            }
            else if (arr[midIndex] < num)
                firstIndex = midIndex + 1;

            else if (arr[midIndex] > num)
                lastIndex = midIndex - 1;
        }
        System.out.println(bool);
    }
}
