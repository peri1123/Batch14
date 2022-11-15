package RecapWithAhmet;

import java.util.Scanner;

public class Switch {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1-there is not directly switch questions, but it is good to use in AUTOMATION.(PROFESSIONAL)

    QUESTION: in what condition would you use switch?

    --> Whenever you have LIMITED options then use switch.
    (It is going to look mor proff and cool)


     */


    public static void main(String[] args) {
        System.out.println("Please provide a number");
        Scanner  scanner=new Scanner(System.in);
        int choice=scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("This is IT Department");
                break;
            case 2:
                System.out.println("Health department");
                break;
            case 3:
                System.out.println("Accounting Department");
                break;
            default:
                System.out.println("No department");
                break;//that's ok to put break after default
        }

    }
}
