package ArrayPractice;

import java.util.Arrays;

public class SplitMethodStringArray {
    public static void main(String[] args) {
        String str = "It is a hot Sunday";
        String[] words = str.split(" ");

        System.out.println(Arrays.toString(words));//[It, is, a, hot, Sunday] commas come from arrays


        String sentence1 = "I want to solve all java questions by myself";
        String[] sentenceParts = sentence1.split("j");
        System.out.println(Arrays.toString(sentenceParts));//[I want to solve all , ava questions by myself]

        String sentence2="I want to solve all java questions by myself." +
                "That would be great moment. It would be also great if the room is cooler";
        //seperate those three sentences from given string
        String []result= sentence2.split("\\.");// split recognise .. only with \\.
        System.out.println(Arrays.toString(result));

       // 09.18.22.>> "Happy Birthday"
            String  day= "09.18.2022.";
        String [] result2=day.split("\\.");
        System.out.println(Arrays.toString(result2));
        if (result2[1].equals("18") && result2[0].equals("09")) {
                    System.out.println("Happy Birthday");




            }
    }
}