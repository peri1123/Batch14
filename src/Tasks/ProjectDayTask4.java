package Tasks;

import java.util.Arrays;

public class ProjectDayTask4 {
    public static void main(String[] args) {
    String name="job, Happy, sun, dream job";
    String reverse="";
    for (int i=name.length()-1; i>=0; i--){
        reverse+=name.charAt(i);
    }
        System.out.println(reverse);


//=====================Reverse String in Array

    String [] drinks={"tea", "coke", "coffee", "water"};

    for (String pick: drinks){
        String r1="";
        for (int i= pick.length()-1; i>=0; i--){
            r1+=pick.charAt(i);

    }System.out.println(r1);

    }



    String states[][]={{"NY","DE", "NJ"},{"OH", "IN", "IL", "WI","MN"},{"CA","OR", "WA"}};
        System.out.println(Arrays.deepToString(states));


        System.out.println(Arrays.toString(states[0]));
        System.out.println(Arrays.toString(states[1]));
        System.out.println(Arrays.toString(states[2]));

















    }}
