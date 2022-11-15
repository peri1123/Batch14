package String;

public class StringMethods4 {
    public static void main(String[] args) {
        String quote = "just do it";
        //substring ();-->return type is String

        String part = quote.substring(5);
        System.out.println(part);
        //->
        String part2 = quote.substring(5, 7);//from 5 to 7(7 excluded), it won't take spaces
        System.out.println(part2);

        //just cut second word from string

        //String text="do more practice"

        String quote2 = "do more practice";
        String quote3 = quote2.substring(3, 7);
        System.out.println("Peri+++" + quote3);


        String text = "#####is this dynamic";

        System.out.println(text.substring(3, 7));

        int indexOfFirstSpace = text.indexOf(" ");
        int indexOfSecondSpace = text.indexOf(" ", indexOfFirstSpace + 1);

        String part3 = text.substring( indexOfFirstSpace + 1, indexOfSecondSpace);
        System.out.println(part3);

        System.out.println("REPLACE");
        //replace(); returns String
        text = text.replace('#', '*');
        System.out.println(text);

        //get rid of all stars, will replcae with space
        text = text.replace('*', ' ');
        System.out.println(text);
        //get rid of all paces
        text = text.replace(" ", "");
        System.out.println(text);

        //JAVA--> chacnge all 'A's with 'S'
        String java = "JAVA";
        java = java.replace("A", "$");
        System.out.println(java);//J$J$

        //J$J$--> replace $V$ with ten stars
        java = java.replace("$V$", "**********");
        System.out.println(java);

        //trim;--> it will delete all leading and ending spaces
        //"       java      is working      "
        String newword = "       java      is working      ";
        System.out.println(newword.trim());// it is deleting the spaces at the begining and at the end only,
        // in the middle we need to replace

        //get rid all of the spaces
        newword = newword.replace(" ", "");
        System.out.println(newword);


    }
}