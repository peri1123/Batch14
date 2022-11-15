package PracticesPeri;

import java.util.Scanner;

public class NestedSwitchPractice {
    public static void main(String[] args) {
         /*Nested Switch
        department calling
        IT-->Alex/David//giving options
        HR-->sara/ana/jessi
        ADMIN-->
                Reception-->
                ("Please choose following options \n1-IT \n2-HR \n3-Admin \n4-Reception \n5-Resources"
                Who do you want  speak with?
Alex
David

          */

        Scanner in = new Scanner(System.in);
        System.out.println("Please choose following options \n1-IT \n2-HR \n3-Admin \n4-Reception \n5-Resources");
        int depar = in.nextInt();
        switch (depar) {
            case 1:
                System.out.println("This is IT depar. Who would you like to speak with?");
                String name = in.nextLine().toLowerCase();
                name = in.nextLine();
                switch (name) {
                    case "alex":
                    System.out.println("You are specking with " + name);
                    break;
                    case "david":
                        System.out.println("You are specking with " + name);
                        break;
                    default:
                        System.out.println("We do do not have such a person in IT.Try again");
                        break;
                } break;
                    case 2:
                        System.out.println("This is HR depar. Who would you like to speak with?");
                        String hrname= in.nextLine().toLowerCase();
                        hrname= in.nextLine();
                        switch (hrname){
                            case "sara":
                                System.out.println("You are specking with " + hrname);
                                break;
                            case "stan":
                                System.out.println("You are specking with " + hrname);
                                break;
                            case "matt":
                                System.out.println("You are specking with " + hrname);
                                break;
                            default:
                                System.out.println("We do do not have such a person in HR.Try again");
                                break;
                        }break;
            case 3:
                System.out.println("This is Admin depar. Who would you like to speak with?");
                String admin= in.nextLine().toLowerCase();
                admin=in.nextLine();
                switch (admin){
                    case "peri":
                        System.out.println("You are specking with " + admin);
                        break;
                    case "john":
                        System.out.println("You are specking with " + admin);
                        break;
                    case "matt":
                        System.out.println("You are specking with " + admin);
                        break;
                    case "melo":
                        System.out.println("You are specking with " + admin);
                        break;
                    default:
                        System.out.println("We do do not have such a person in admin.Try again");
                        break;
                } break;
            case 4:
                System.out.println("This is reception. Who would you like to speak with?");
                String recep=in.next().toLowerCase();
                in.nextLine();
                switch (recep){
                    case"venky":
                        System.out.println("You are specking with " + recep);
                        break;
                    case "jacob":
                        System.out.println("You are specking with " + recep);
                        break;
                    case "rosy":
                        System.out.println("You are specking with " + recep);
                        break;
                    case "ekim":
                        System.out.println("You are specking with " + recep);
                        break;
                    default:
                        System.out.println("We do do not have such a person at the reception.Try again");
                        break;
                }break;
            case 5:
                System.out.println("This is resources . Who would you like to speak with?");
                String res=in.nextLine().toLowerCase();
                res=in.nextLine();
                switch (res){
                    case "kyle":
                        System.out.println("You are specking with " + res);
                        break;
                    default:
                        System.out.println("We do do not have such a person at the res.Try again");
                        break;

                }




        }


    }
}

