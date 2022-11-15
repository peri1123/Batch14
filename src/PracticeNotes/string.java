package PracticeNotes;

public class string {
    public static void main(String[] args) {
        String name="Fluffy"; // craeting string
        String text= new String("Fluffy");
        System.out.println(name);
        System.out.println(text);

        int a=9, b=8;
        System.out.println(name==text);// true bc it is object// ALex & alex are not the same,
        // bc we are not checking value

        name="Saturady";
        System.out.println(name);
        name= name + "Fluffy is not here"; //concatention meaning adding more string to the existing value
        System.out.println(name);

        String word="good" +" "+ "morning"; //concatention meaning adding more string to the existing value

        System.out.println(word);

        //word.concat thats the method to add something
        word.concat (  " everyone");// we need to assigned

       word= word.concat( " everyone");
        //String is Immutable, it will not change unless you reassigned a new value
        //if we need to see the change we need to put it int variable again
        System.out.println(word);

        System.out.println( word.concat (", it is good to see you"));// it is already in display
        System.out.println(word);// will show whatever last valued(version) to word

        word+="How are you?"; //GM everyone+how are you? since we add += sign
        System.out.println(word);

        word="jave";

        word.concat(" is easy");// we did not reassined;
        word= word.concat(" is easy");
        System.out.println(word);//java since we did not reassined
         //concat method does not recognise number;

        System.out.println(word);
        word=word.concat("123");
        word=word+123;
        System.out.println(word);

        word= "java";
        String word2="selenium";
        String course=word+word2;
        System.out.println(course);

        String str="1";
        str+="2";
        str+=2;//-->str=str+2

        // String can not do arithmetic calculation
        System.out.println(str);




    }
}
