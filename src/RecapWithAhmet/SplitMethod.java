package RecapWithAhmet;

public class SplitMethod {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1-There some technical interview questions can be solved with Split Method

    Note:Split method returns the "String Array";





     */
    //HOMEWORK
   // String str="Hello Java is so good";
    //output:olleH
    //avaJ
    //si
    //doog
    //Note:Please use split method and nested loop

    public static void main(String[] args) {
        //Reading whole questions and understanding the question is your first step
        //Declare, initialize your variables
        String str="Hello Java is so good";
        String [] word=str.split(" ");//Hello, java, is, so, good

        for (String words:word) {
            String reverse="";
            for(int i=words.length()-1; i>=0; i--){
                reverse+=words.charAt(i);
            }
            System.out.print(reverse+ " ");
        }










    }






        //reversedString(str);

        //reversedStr(str);


//    public static void reversedString(String str){
//        String newString[]=str.split(" ");
//        String reversedStr="";
//        for(String eachWord:newString){
//           StringBuilder builder=new StringBuilder(eachWord);
//          builder.reverse();
//          reversedStr+=builder.toString()+" ";
//        }
//        System.out.println(reversedStr);
//    }

//    public static void reversedStr(String str){
//        String reverse = "";
//        String[] array = str.split(" ");
//
//        for (int i = 0; i < array.length; i++) {
//            String word = "";
//            for (int j = array[i].length() - 1; j >= 0; j--) {
//                word += array[i].charAt(j);
//            }
//            reverse = reverse + word + " ";
//        }
//        System.out.println(reverse);


    }



