package InterviewQuestions;

public class ReturnTypeOfSplit4 {
    public static void reverseString(String str){
        String b1="";
        for(int i=str.length()-1; i>=0; i--){
            b1+=str.charAt(i);
        }
        System.out.println(b1);
    }

    public static void reversedChar(String str){
        char array[]=str.toCharArray();
        String b1="";
        for (int i= array.length-1; i>=0; i--) {
            b1+=array[i];
        }
        System.out.println(b1);

    }

    public static void main(String[] args) {
        String s="Hello World";
       reverseString(s);

       reversedChar(s);
    }


}
