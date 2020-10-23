package Java_07Oop;

import javax.rmi.CORBA.Tie;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(12,35,30);
        System.out.println(t);
        t.setHour(t.getHour()+1); //현재시간보다 1시간 후로 변경한다.
        System.out.println(t); // System.out.println(t.toString()); 과 같다
    }
}

class Time{
    private int hour,minute, second;

    Time(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setSecond(int second) {
        if(second < 0|| second > 59)return;
        this.second = second;
    }

    public void setMinute(int minute) {
        if(minute < 0|| minute > 59)return;
        this.minute = minute;
    }

    public void setHour(int hour) {
        if(hour < 0 || hour > 23) return;
        this.hour = hour;
    }

    public int getSecond() {
        return second;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}