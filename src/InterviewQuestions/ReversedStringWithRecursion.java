package InterviewQuestions;

public class ReversedStringWithRecursion {
    public static void main(String[] args) {
        String str="I hate Java";
        System.out.println(reversedString(str));

    }

    public static String reversedString(String str){
        if(str.isEmpty()) {
            return str;
        } return reversedString(str.substring(1)+str.charAt(0));
    }

}
