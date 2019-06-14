import java.util.Scanner;

public class TowerOfHanoi {
    static char fromStick = 'A';
    static char midStick = 'B';
    static char toStick = 'C';
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input n: ");
        int n = in.nextInt();
       // System.out.println(n);
       // System.out.println();
        towerOfHanoi(n, fromStick, midStick, toStick);
    }

    static void towerOfHanoi(int n, char fromStick, char midStick, char toStick){
        if (n == 1){
            System.out.println(n + " moved from " + fromStick + " to " + toStick);
            return;
        }
        towerOfHanoi(n - 1, fromStick, toStick, midStick);
        System.out.println(n + " moved from " + fromStick + " to " + toStick);
        towerOfHanoi(n - 1, midStick, fromStick, toStick);
    }
}
