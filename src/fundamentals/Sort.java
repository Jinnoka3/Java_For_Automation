package fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input number of arguments: ");
        int number = in.nextInt();
        //System.out.println(number);
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*100);
            System.out.println(array[i]);
        }
        System.out.println("bubble sort");
        bubbleSort(array);
        System.out.println("optimized bubble sort");
        optimizedBubbleSort(array);
        System.out.println("insertion sort");
        insertionSort(array);
        System.out.println("selection sort");
        selectionSort(array);
    }

    static void bubbleSort(int[] arr){

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length - 1; j++){
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    static void optimizedBubbleSort(int[] arr){

        boolean t;
        do{
            t = false;
            for (int i = 0; i < arr.length - i - 2; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    t = true;
                }
            }
        }
        while (t);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    static void insertionSort(int[] arr){
        int tmp, j;
        for(int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i + 1]) {
                tmp = arr[i + 1];
                arr[i + 1] = arr[i];
                j = i;
                while (j > 0 && tmp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = tmp;
            }
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    static void selectionSort(int[] arr){
        int min, tmp;
        for (int i = 0; i < arr.length-1; i++){
            min = i;
            for (int scan = i + 1; scan < arr.length; scan++){
                if (arr[scan] < arr[min])
                    min = scan;
            }
            tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

