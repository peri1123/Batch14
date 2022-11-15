package Loops;

public class DoWhilePractice3LettersNumberOfDigits {
    public static void main(String[] args) {
        /*
        String str ="tdfgr6fva*7A&!";
        count number of letters, number of digits, number of other symbols
         "there are..9.. digits in given string
        "there are..9.. letter in given string
        "there are ..3.. other symbols in given string"
         */
        /*String str ="gr6fva*337A&!";
        String letters="";
        int index=0, lettercount=0,digitcounter=0, symbolCounter=0;

        do {
                    if(str.charAt(index) >='a' && str.charAt(index)<='z' || str.charAt(index)<='Z') {
                        lettercount++;
                        letters+=str.charAt(index);

                    }else if(str.charAt(index)>= '0' && str.charAt(index) <='9'){
                       digitcounter++;
                    }else {
                        symbolCounter++;
                    }
            index++;//localy update
        }while(index<str.length());

        System.out.println("There are " + lettercount + " letters in given string");
        System.out.println("There are " + digitcounter + " digit in given string");
        System.out.println("There are " + symbolCounter + " symbols in given string");
        System.out.println("There are " + letters+ " letters in given string");

         */
      //////---------------------
        /*
        String str ="aAAA---**674***!";
        int index=0, letterCount=0, digitCounter=0,symbolCounter=0;
        String letters="";//what is this?

        do {
            if (str.charAt(index)>='a' && str.charAt(index)<='z' || str.charAt(index)>='A' && str.charAt(index)<='Z') {
                letterCount++;
                letters += str.charAt(index);
            } else if (str.charAt(index)>'0' && str.charAt(index)<='9') {//where did he get 9
                digitCounter++;
            }else{
                symbolCounter++;
            }

            index++;
        }while (index<str.length());
        System.out.println("There are " + letterCount + " letters in given string");
        System.out.println("There are " + digitCounter + " digit in given string");
        System.out.println("There are " + symbolCounter + " symbol in given string");
        System.out.println("There are " + letters );

        //--------------------------

         */

        String name="hfjgnknkug";
        int index=0, letterCounter=0;


        do {
            if (name.charAt(index)>='a' && name.charAt(index)<='z' || name.charAt(index)>='A' && name.charAt(index)<='Z')
            {
                letterCounter++;
            }

            index++;
        }while(index>name.length());
        System.out.println("The letter is" +letterCounter);













    }
}
