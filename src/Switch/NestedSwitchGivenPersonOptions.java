package Switch;

import java.util.Scanner;

public class NestedSwitchGivenPersonOptions {
    public static void main(String[] args) {
        /*Nested Switch
        department calling
        IT-->Alex/David//giving options
        HR-->sara/ana/jessi
        ADMIN-->
                Reception-->

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please choosefrom following options: \n 1-IT \n 2-HR \n 3-ADMIN \n 4-RECEPTION");

        int department= scanner.nextInt();
        int hour=10;
        switch (department){
            case 1:
                System.out.println("Who do want you speak with? \nAlex \nDavid");
                String name=scanner.nextLine().toUpperCase();
                scanner.nextLine();
                switch (name){
                    case "ALEX":
                        System.out.println("What time is it now?");
                        if (hour >=8 && hour<=12) {
                            System.out.println("You are speaking with" + name);
                        }else{
                            System.out.println("Alex is not at the office");
                        }
                        break;
                    case "DAVID":
                        System.out.println("You are speaking with" + name);
                        break;
                    default:
                    System.out.println("There is no such person in IT");
                    break;
                }
                break;
                //HR-->sara/ana/jessi
            case 2:
            System.out.println("Who do want you speak with? \nana \njessi \nsara?");
            String name1=scanner.nextLine().toUpperCase();
            scanner.nextLine();
            switch (name1){
            case "Sara":
                System.out.println("You are speaking with" + name1);
                break;
            case "ANA":
                System.out.println("You are speaking with" + name1);
                break;
            case "JESSI":
                System.out.println("You are speaking with" + name1);
                break;
                default:
                    System.out.println("There is no such person in IT");
                    break;





        }



    }
}
}
