package PracticeNotes;

public class TeamWorkTask4 {
    public static void main(String[] args) {
        double givenminutes=3456789;
        double minute=60, day=24, daysinyear=365;
        double hours=givenminutes/minute;
        System.out.println(hours);//57513 hours in 3456789
        double days=hours/day;
        System.out.println(days);//2400 days in 3456789
        double years=days/daysinyear;
        System.out.println(years);//6 years in 3456789
        double remainingday=days%365;
        System.out.println(years+remainingday);




    }
}
