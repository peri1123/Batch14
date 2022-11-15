package Tasks;

import java.util.Scanner;

public class Task6ProjectDay4 {
    public static void main (String[]args){
        System.out.println("Please enter words with no space");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String r1=" ";
      for (int i=0; i<str.length(); i++){
      if(str.charAt(i)>='A' && str.charAt(i)<='Z' ) {
         r1+=" "+str.charAt(i);

      }else{
          r1+=str.charAt(i);
      }
      }System.out.println(r1.trim());


      }

      }





