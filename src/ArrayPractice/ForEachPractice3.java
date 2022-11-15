package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ForEachPractice3 {
    public static void main(String[] args) {


    /*
    get 5 employee names from user
    store those names into employeeNames array
    create email for each employee
    store  the emails int employeeEmails array
    >> jhon@java.com,
    show  each array to see the data
     */
        System.out.println("How many names would you like to add to the list?");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        scanner.nextLine();
        String [] employeeNames=new String[size];
        String [] employEmails= new String[size];

        for (int i=0; i<size; i++){
            System.out.println("Please enter employee name");
           employeeNames[i]= scanner.nextLine();
          employEmails[i]=employeeNames[i].concat("@java.com");
        }
        System.out.println("Here are the names of employees:" + Arrays.toString(employeeNames));
        System.out.println(Arrays.toString(employEmails));


        System.out.println("===============");
        System.out.println("How many employees?");
        Scanner scanner1=new Scanner(System.in);
        int size1= scanner1.nextInt();
        scanner1.nextLine();
        String [] names=new String[size1];

        for (int i=0; i<size1; i++){
            System.out.println("enter names");
            String names1=scanner1.nextLine();
            System.out.println(names1+"java.com");

        }





    }
}
