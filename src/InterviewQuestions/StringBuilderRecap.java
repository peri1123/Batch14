package InterviewQuestions;

public class StringBuilderRecap {
    /*
    POSSIBLE QUESTIONS:
    1-What is the difference between String Builder and String?
    They are both useful for the project in terms of mutability and immutability.
    **String is immutable**
    **StringBuilder is mutable**
    String and StringBuilder have some different methods reverse,append


    2-What is the difference between StringBuilder and StringBuffer?
    *StringBuffer and HashTable are synchronized
    *Map,List,Set,String, StringBuilder are non-Synchronized

    NOTE:Mutable is all about the giving functions/actions/manipulations without "RE-ASSIGNING"

    IMMUTABILITY is all about the giving functions/actions/manipulations with "RE-ASSIGNING"
    examples below
    NOTE#3:PASSbyVALUE and PASSbyReference is all about the way that you pass the data
    -->IF you call the method and pass the value directly (StringBuilderRecap.run("AHMET"). It means you are passing by value
    -->If you call the method and pass the value with the reference:
    String name="Kemal";
    stringbuilderrecap.run(name)


     */

    public static void main(String[] args) {
        String name ="Ahmet";
        StringBuilder b=new StringBuilder("Ahmet");
        name.toUpperCase().replace("H","*");
        System.out.println(name);
        name=name.toUpperCase().replace("H","*");
        System.out.println(name);
        b.append("Mehmet").append("Mahmut").reverse();//AhmetMehmetMahmut
        System.out.println(b);

    }
}
