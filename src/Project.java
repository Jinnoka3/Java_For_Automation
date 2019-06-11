public class Project {
    static int x = 10;
    static int y = 20;
    static int z = 15;
    static int q = 7;
    public static void main(String[] args) {

        int lowest = getLowest(x, y);
        System.out.println(lowest);
        int lowest1 = getLowest1(x, y, z);
        System.out.println(lowest1);
        int lowest1 = getLowest1(x, y, z);
        System.out.println(lowest1);

    }
    public static int getLowest(int a, int b){
        if(a > b){
            return b;
        }
        else if (a < b) {
            return a;
        }
        else {
           // System.out.println("");
            return a;
        }
    }

    static int getLowest1(int c){
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

    static int getLowest2(int d){
        int low = getLowest1(z);
        if(low < d){
            return low;
        }
        else if (low > d) {
            return d;
        }
        else {

            return low;
        }




}


