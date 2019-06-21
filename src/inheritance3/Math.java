package inheritance3;

import java.util.Arrays;

public class Math {
    public static final double PI = 3.1415926536;
    private int[] arrayInt;
    private double[] arrayDouble;
    private int numInt;
    private double numDouble;


    public Math(){
    }

    public Math(int[] arrayInt){

        this.arrayInt = arrayInt;
    }


    public Math(int[] arrayInt, int num){
        this.arrayInt = arrayInt;
        this.numInt = num;
    }
    public int[] getArrayInt() {
        return arrayInt;
    }

    public void setArrayInt(int[] arrayInt) {

        this.arrayInt = arrayInt;

    }

    protected Math(double[] arrayDouble){

        this.arrayDouble = arrayDouble;
    }

    protected Math(double[] arrayDouble, double num){
        this.arrayDouble = arrayDouble;
        this.numDouble = num;
    }
    public double[] getArrayDouble() {
        return arrayDouble;
    }

    public void setArrayDouble(double[] arrayDouble) {
        this.arrayDouble = arrayDouble;
    }

    public int getNum() {
        return numInt;
    }

    public void setNum(int num) {
        this.numInt = num;
    }

    //INT
    public static int min(int array[]){
        int min = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] < min)
                min = array[i];
        }
        return min;
    }

    public static int max(int array[]){
        int max = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max)
                max = array[i];
        }
        return max;
    }

    public static int nextAfter(int array[], int num){
        int next = 0;

        for(int i = 0; i < array.length; i++) {
            if (array[i] > num ) {
                next = array[i];
                break;
            }
            // return next;
        }
        return next;
    }

    public static int pow(int a, int b){
        int result = 1;
        for (int i = 1; i <= b; i++){
            result *= a;
        }
        return result;
    }
    //DOUBLE
    public static double min(double array[]){
        double min = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] < min)
                min = array[i];
        }
        return min;
    }

    public static double max(double array[]){
        double max = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max)
                max = array[i];
        }
        return max;
    }

    public static double nextAfter(double array[], double num){
        double next = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] > num ) {
                next = array[i];
                break;
            }
        }
        return next;
    }

    public static double pow(double a, int b){
        double result = 1;
        for (int i = 1; i <= b; i++){
            result *= a;
        }
        return result;
    }

}
