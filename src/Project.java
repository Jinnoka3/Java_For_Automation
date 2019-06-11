import java.util.Scanner;

public class Project {
    static int x = 10;
    static int y = 5;
    static int z = 2;
    static int q = 7;


    public static void main(String[] args) {

        int lowest = getLowest(x, y);
        System.out.println(lowest);
        int lowest1 = getLowest(z);
        System.out.println(lowest1);
        int lowest2 = getLowest1(q);
        System.out.println(lowest2);

    }

    public static int getLowest(int a, int b){
        if(a > b){
            return b;
        }
        else if (a < b) {
            return a;
        }
        else {
            return a;
        }
    }

    static int getLowest(int c){
        int low = getLowest(x, y);
        if(low < c){
            return low;
        }
        else if (low > c) {
            return c;
        }
        else {
            return low;
        }
    }

    static int getLowest1(int d) {
        int low = getLowest(z);
        if (low < d) {
            return low;
        } else if (low > d) {
            return d;
        } else {
            return low;
        }
    }
}


