package ForLoops;

public class ForLoopsPractice3TodayIsRainyDay {
    public static void main(String[] args) {
        // Print every letter from given string by using for loop
        String str="Today is a rainy day";
        for( int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }

        System.out.println("PRINT ONLY LETTER Y");
        String str1="Today is a rainy day";
        for (int index=0; index<=str1.length()-1; index++ ){
           if (str1.charAt(index)=='y' || str1.charAt(index)=='Y'){
               System.out.println(str1.charAt(index));
           }

        }
        //String str="Today is a rainy day"
        //count spaces from given string by using for loop
        String str2="Today is a rainy day";
        int count=0;

        for(int i=0; i<str2.length()-1; i++){
            if (str2.charAt(i)==' '){
                count++;
                System.out.println(count);

            }
        }

        //Print all characters one by one separating with comma
        String str3="Today is a rainy day";
        for(int i=0; i<str3.length(); i++){
            if (str3.charAt(i) !=' '){
                System.out.print(str3.charAt(i)+ ",");
            }

            }
        }

        }





