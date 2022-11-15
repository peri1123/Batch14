package InterviewQuestions;

public class AlphaCharactersInAString3 {
    public static void main(String []args) {
        String str="ZX2345678jhnxvdiugjba_)(*&JY^%";
        String replace=str.replaceAll("[^A-Za-z]", "");
        System.out.println(replace.length());


        countingChar(str);

    }

    public static void countingChar(String str){
        String replace=str.replaceAll("[^A-Za-z]", "");
        System.out.println(replace.length());

    }
}
