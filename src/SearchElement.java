import java.util.Arrays;
import java.util.Scanner;


public class SearchElement {

    public static void main(String[] args) {

        input();
    }

    static void input(){
        Scanner in1 = new Scanner(System.in);
        System.out.print("Input array size");
        int num1 = in1.nextInt();

        Scanner in2 = new Scanner(System.in);
        System.out.print("Input a number to search");
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
        //sort(array);
        System.out.println();
        regularSearch(array, num2);
        System.out.println();
        binarySearch(array, num2);


    }

    static void regularSearch(int[] arr, int num){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == num){
                System.out.println(arr[i]);
                System.out.println("true");
                break;
            }
        }
    }

    static void binarySearch(int[] arr, int num){
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        while (firstIndex <= lastIndex) {
            int midIndex = (firstIndex + lastIndex)/2;
            if (arr[midIndex] == num){
                System.out.println(arr[midIndex]);
                System.out.println("true");
                break;
            }
            else if (arr[midIndex] < num){
                firstIndex = midIndex + 1;

            }
            else if (arr[midIndex] > num)
                lastIndex = midIndex - 1;
        }
    }
}
