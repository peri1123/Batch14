package InterviewQuestions;

public class ReverseWithSplit {

    public static void reversedStr(String string){
        String[] array=string.split(" ");

        for(String str:array) {
            String word = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                word += str.charAt(i);
            }
            System.out.print(word+ " ");
        }

    }

    public static void main(String[] args) {
        String s="Hello Java";
      reversedStr(s);
    }

}
