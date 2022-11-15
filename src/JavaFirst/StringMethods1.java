package JavaFirst;

public class StringMethods1 {
    public static void main(String[] args) {
        String day="today";
        // concat ()
        day.concat("is saturday");

        //indexing
        //charAt(); finds and returns char at a given index number

        char letter1= day.charAt(0); //t
        System.out.println(day.charAt(0));//t
        System.out.println(letter1);//t

        // day=""+day.charAt(0);// string
        System.out.println(day);

        //use charAt method, find and store last letetr letetr from the string day
        char thelastindex=day.charAt(4);
        System.out.println(thelastindex);//4

        //System.out.println(day.charAt(8));//run time error -->String index out of range:
        //System.out.println(day.charAt(-2));//it gives when you looking for something does not exist

        //length(); --> returns/counts number of characters on the string
        day.length();//it counts how many characters fe:today has 5 charachters
        System.out.println(day.length());//5
        //Lenght is counting and index is giving position

        int l= day.length();
        System.out.println(l);
        System.out.println(day.length() ==l); //

        //can you use length to find out last index number?

        day.charAt(day.length()-1);
        System.out.println( day.charAt(day.length()-1));//5-1; today and result is y

        //lenght
        //charAt
        //concat
        System.out.println("++++++++++++++++++");

        //indexof()-->finds and returns index of given character
        String name= "Alexander";

        name.indexOf('A'); //it will return it
        System.out.println(name.indexOf('A'));

        int indexofA=name.indexOf('A');
        //find the index of 'a'
        System.out.println(name.indexOf('a'));
        System.out.println(name.indexOf('w'));//bc we are looking for something does not exist

        System.out.println(name.indexOf('A'));
        System.out.println(name.indexOf("exan"));//it is going to return first character's index if there is matching sequence
        //and it will return the first index of the word

        name="Alexander";
        System.out.println(name.indexOf('e'));//2
        System.out.println(name.indexOf("er"));
        System.out.println(name.indexOf('e',3));//7 which means it will look after index 3

        System.out.println(name.indexOf('e'));
        // System.out.println(name.indexOf('e',++i)); it is just unary operator 2+1=3 which

        //Homework--> evergeen index number of 30;

        //toUppercase(), toLowercase()
        name=name.toUpperCase();
        System.out.println(name);//ALEXANDER

        //just imagine we work on text and we need to similar looking we need to (we want to modify)
        //alex,ALEX, Alex-->'A'

        name=name.toLowerCase();
        System.out.println(name);//alex









    }
}
