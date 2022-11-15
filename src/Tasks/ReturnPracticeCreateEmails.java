package Tasks;

import java.util.Arrays;

public class ReturnPracticeCreateEmails {
//public class ReturnPracticeEmailsForStudents {
    /*
    create a method that will return as an array of e-mails
    this method should take an array of names of students
    this method should create e-mail for every student and store it into array

     */
    public String[] creator(String[] names) {
        String[] emails = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            emails[i]=names[i]+"@gmail.com";
        }
        System.out.println(Arrays.toString(emails));
      return emails;
    }

    public static void main(String[] args) {
        ReturnPracticeCreateEmails s1=new ReturnPracticeCreateEmails();
        String [] names={"Alex", "Dima", "Ahmet", "Aida"};
        s1.creator(names);
        //System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(s1.creator(names)));




    }



}
