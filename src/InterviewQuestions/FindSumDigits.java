package InterviewQuestions;

public class FindSumDigits {
    public static void main(String[] args) {

        int row = 5;
        for (int i = 0; i <row; i++) {
            for (int k =row-i ; k>1; k--) {
                System.out.print(" ");
            }
            for (int l = 0; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }}


