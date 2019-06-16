package object2;

public class Clock {

    public int hours;
    public int minutes;
    public int seconds;

    public Clock(){
        hours = 12;
        minutes = 0;
        seconds = 0;
    }
    public Clock(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public Clock(int seconds){
        this.seconds = seconds;
    }

    public static boolean checkSec(int seconds){
        if (seconds > 86399 || seconds < 0){
            return false;
        }
        return true;
    }

    public static boolean checkTime(int hours, int minutes, int seconds){
        if (hours > 23 || hours < 0){
            return false;
        }
        else if (minutes > 59 || minutes < 0){
            return false;
        }
        else if (seconds > 59 || seconds < 0){
            return false;
        }
        return true;
    }

    public Clock setClock(int seconds){
        if (seconds == 0) {
            hours = 0;
            minutes = 0;
            this.seconds = 0;
            Clock clock = new Clock(this.hours, this.minutes, this.seconds);
            return clock;
        }
        else {
            hours = seconds / 3600;
            minutes = (seconds - hours * 3600) / 60;
            this.seconds = (seconds - hours * 3600 - minutes * 60);
            Clock clock = new Clock(this.hours, this.minutes, this.seconds);
            return clock;
        }
    }

    public Clock tick() {
        seconds++;
        if (seconds == 60){
            seconds = 0;
            minutes++;
        }
        if (minutes == 60){
            minutes = 0;
            hours++;
        }

        if (hours == 24) {
            hours = 0;
        }
        int sec = hours * 3600 + minutes * 60 + seconds;
        //System.out.println(sec);
        return setClock(sec);
    }

    public Clock tickDown() {
        seconds--;
        if (seconds < 0){
            seconds = 59;
            minutes--;
        }
        if (minutes < 0){
            minutes = 59;
            hours--;
        }

        if (hours < 0) {
            hours = 23;
        }
        int sec = hours * 3600 + minutes * 60 + seconds;
        //System.out.println(sec);
        return setClock(sec);
    }

    public Clock addClock(Clock secondClock){
        seconds += secondClock.seconds;
        minutes += secondClock.minutes;
        hours += secondClock.hours;
        int sec = hours * 3600 + minutes * 60 + seconds;
        //System.out.println(sec);
        int maxSec = 86400;
        int difSec = sec - maxSec;
        if (sec < maxSec){
            return setClock(sec);
        }
        else if (sec == maxSec){
            return setClock(0);
        }
        else {
            return setClock(difSec);
        }
    }

    public Clock subtractClock(Clock secondClock){
        seconds -= Math.abs(secondClock.seconds);
        minutes -= Math.abs(secondClock.minutes);
        hours -= Math.abs(secondClock.hours);
        int sec = Math.abs(hours * 3600 + minutes * 60 + seconds);
        //System.out.println(sec);
        int minSec = 0;
        if (sec == minSec){
            return setClock(0);
        }
        else {
            return setClock(sec);
        }
    }

    public String toString(Clock b){
        String clock = String.format("%02d", hours) + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", seconds);
        return clock;
    }
}
