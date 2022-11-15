package Tasks;

import java.util.Scanner;

public class Task5ProjectDay4 {
    public static void main(String[] args) {

        System.out.println("please enter a string");
        Scanner scanner=new Scanner(System.in);
        String str= scanner.nextLine();
        String str2="";

        for (int i=0; i<str.length(); i++){
            if(str.charAt(i)==' '){
                str2+=str.charAt(i);
            } else if (!str2.contains(""+str.charAt(i))) {
                str2+=str.charAt(i);
            }


        }System.out.println(str2);















    }
}
