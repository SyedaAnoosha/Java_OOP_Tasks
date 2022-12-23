package OOP_test;/*

question:"Create a clock class with hour minute second attributes and getters and setters.Add conversion methods like int convertToSeconds (float hour, float minute) float convertToHour(float minute, float int second).Add main function to convert time."
*/


class Clock{
    float hour;
    float minute;
    float second;

    public void setHour(float hour) {
        this.hour = hour;
    }

    public float getHour() {
        return hour;
    }

    public void setMinute(float minute) {
        this.minute = minute;
    }

    public float getMinute() {
        return minute;
    }

    public void setSecond(float second) {
        this.second = second;
    }

    public float getSecond() {
        return second;
    }
    public float convertToSeconds(){
        float seconds;
        float hours;
        float minutes;
        hours=this.hour;
        minutes=60*hours;
        seconds=minutes*60;
        return seconds;
    }
    public float convertToMinutess(){
        float hours;
        float minutes;
        hours=this.hour;
        minutes=60*hours;
        return minutes;
    }
    public float convertToHours(){
        float seconds;
        float hours;
        seconds=this.second;
        hours= seconds/3600;
        return hours;
    }

}
public class question3 {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.setHour(1);
        clock.setSecond(3600);
        clock.setMinute(32);
        System.out.println(clock.convertToSeconds());
        System.out.println(clock.convertToHours());
        System.out.println(clock.convertToMinutess());
    }
}