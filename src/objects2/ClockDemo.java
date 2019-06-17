public class ClockDemo {
    public static void main(String[] args) {
        //time in seconds
        Clock zeroClock = new Clock();
        System.out.println("Default time: " + zeroClock.toString(zeroClock));
        Scanner in = new Scanner(System.in);
        System.out.println("Input time in seconds: ");
        int sec = in.nextInt();
        Clock firstClock = new Clock(sec);
        if (firstClock.checkSec(sec) == true) {
            System.out.println("First time: " + firstClock.toString(firstClock));

            //+1 sec
            System.out.println("+1 sec time: ");
            for (int i = 0; i < 10; i++) {
                firstClock.tick();
                System.out.println(firstClock.toString(firstClock));
            }
        } else
            System.out.println("Wrong first time in seconds");
        System.out.println();

        //time in 3 numbers
        Scanner in1 = new Scanner(System.in);
        System.out.println("Input hours: ");
        int h = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.println("Input minutes: ");
        int m = in2.nextInt();
        Scanner in3 = new Scanner(System.in);
        System.out.println("Input seconds: ");
        int s = in3.nextInt();

        Clock secondClock = new Clock(h, m, s);
        if (secondClock.checkTime(h, m, s) == true) {
            System.out.println("Second time: " + secondClock.toString(secondClock));

            //-1 sec
            System.out.println("-1 sec time: ");
            for (int i = 0; i < 10; i++) {
                secondClock.tickDown();
                System.out.println(secondClock.toString(secondClock));
            }
            System.out.println();
        }
        else
            System.out.println("Wrong second time");

        if(firstClock.checkSec(sec) == true && secondClock.checkTime(h, m, s) == true){
            System.out.println("First time: " + firstClock.toString(firstClock));
            System.out.println("Second time: " + secondClock.toString(secondClock));

            //add
            System.out.println("Add second time in first time: ");
            firstClock.addClock(secondClock);
            System.out.println(firstClock.toString(firstClock));
            System.out.println();

            //difference
            System.out.println("First time: " + firstClock.toString(firstClock));
            System.out.println("Second time: " + secondClock.toString(secondClock));
            System.out.println("Difference of first time and second time: ");
            firstClock.subtractClock(secondClock);
            System.out.println(firstClock.toString(firstClock));
        }
        else {
            System.out.println();
            System.out.println("Wrong first or second time");
            System.out.println("Time can't be added and difference can't be got");
        }
    }
}
