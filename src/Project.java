public class Project {
    static int x = 10;
    static int y = 5;
    static int z = 2;
    static int q = 1;


    public static void main(String[] args) {

        int lowest = getLowest(x, y);
        System.out.println(lowest);
        int lowest1 = getLowest(z);
        System.out.println(lowest1);
        int lowest2 = getLowest(q);
        System.out.println(lowest2);

    }

    public static int getLowest(int a, int b){
        int get = (a <= b) ? a : b;
        return get;
    }

    public static int getLowest(int c){
        int low = getLowest(x, y);
        int get = (low <= c) ? low : c;
        return get;
    }
}
