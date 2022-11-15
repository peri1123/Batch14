package InterviewQuestions;

public class StringIsPalindrome {
    public static void main(String[] args) {
        String str="madam";
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        if (str.equals(reversed)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("Str is not palindrome");
        }
    }
}
