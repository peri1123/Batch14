package InterviewQuestions;

public class StarTree {
    public static void main(String[] args) {
//        int row=5;
//
//        // outer loop to handle number of rows
//        //  n in this case
//        for (int i=0; i<row; i++)
//        {
//
//            // inner loop to handle number spaces
//            // values changing acc. to requirement
//            for (int j=1; j<=row-i; j++)
//            {
//                // printing spaces
//                System.out.print(" ");
//            }
//
//            //  inner loop to handle number of columns
//            //  values changing acc. to outer loop
//            for (int j=0; j<=i; j++ )
//            {
//                // printing stars
//                System.out.print("* ");
//            }
//
//            // ending line after each row
//            System.out.println();
      int row=5;
      for(int i=1; i<=row; i++){
          for(int space=1; space<=row-i; space++){
              System.out.print(" ");
          }for (int star=1; star<=i; star++){
              System.out.print("* ");
          }
          System.out.println();
      }








        //int i=5;
        //printTree(i);
        }

    public static void printTree(int row){
     for(int i=0; i<=row; i++){
         for(int space=1; space<=row-i; space++){
             System.out.print(" ");
         }for (int star=0; star<i; star++){
             System.out.print("* ");
         }
         System.out.println();
     }

    }


}

