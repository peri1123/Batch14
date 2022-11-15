package OOP;

public class Time {
    int hour, minute, month, year;
    double second;

    public Time(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    public Time(int month, int year){
        this.month=month;
        this.year=year;
    }

    public Time(int hour, int minute, int month, int year, double second) {
        this.hour = hour;
        this.minute = minute;
        this.month = month;
        this.year = year;
        this.second = second;
    }

    public static int getHour(){


        return getHour();
    }

    public static int getMinute(){

        return 0;
    }

    public  static double getSecond(){

        return 0;
    }

    public static int GetMonth(){

        return 0;
    }

    public static int getYear(){

        return 0;
    }

    public static int setHour(int hour){
        hour= ((hour>0 && hour>24)? hour: 0);


        return hour;
    }

    public static int setMinute(int minute){
        minute= ((minute>0 && minute>60)? minute: 0);


        return minute;
    }
    public static double setSecond(double second){
        second= ((second>0 && second>60)? second: 0);


        return second;
    }

    public static int setMonth(int month){
        month= ((month>0 && month>12)? month: 0);


        return month;
    }

    public static int setYear(int year){
        if (year>0){
            setYear(0);
        }

        return year;
    }

    public static int amPm(int hour){
        if (hour>12){
            System.out.println("am");
        }else{
            System.out.println("pm");
        }
        return hour;
    }

    public  static  int season ( int month){
        if(month>12 || month<=0){
            System.out.println("No Season Found");
        }
        return month;
    }


    public String timeInfo(){
        return String.format("%02d:%02d:%02d:", hour, minute, second);

    }

    public String date(){
        return month+ "/" +year;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", month=" + month +
                ", year=" + year +
                ", second=" + second +
                '}';
    }
}
