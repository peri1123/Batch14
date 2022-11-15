package RecapWithAhmet;

import java.util.Arrays;

public class StringAndMethods {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1-Most of the technical questions are related with String
    2- What is the difference between (.)equals and (==)
    3-What is String and how do you declare?

    The big difference between .equals and == is all about the location and value comparison .equals-->
    is a way to compare two variables  based on the values of it
    String name="Peri";       name.equals(name1)-->true
    String name1=new String("Peri");
    (==)--> is a way to compare two variables based on the "LOCATION" of it.
    String name="Peri";  (SP or Stack) name==name1 (Heap)//false
    String name1=new String("Peri"); name1==name2//false
     String name2=new String("Peri");  name==name3-->true
      String name3=Peri;



    TIPS: Once you are explaining anything in IT. Try to use Technical terms.

    String name="Peri"-->initializing  --> are assigning a value
    Employee ahmet=new Employee()--> you are declaration the object. You do not assign only value


    *******REALLY IMPORTANT FOR AUTOMATION************

    METHODS:*means Ahmet's favorite

    1-length()-->it counts the number of characters. It returns int
    2-equal()--> it compares the value of the variable. It returns boolean
    3-indexOf()--> it gives you the index of number of character. It returns int
    4-charAt()--> it gives you character of the specific index.It returns char.Accepts int
    *5-substring()-->it is a way to get a specific characters from the String. It returns String
    6-toUpper/toLower()--> it makes the characters upper or lower cases. it returns String
    7-concat()--> it is a way to the two or more characters together.it returns String
    *8-split() --> it is  way to cut the specific characters/words from String. it returns String
    9-replace()-->it replaces the specific characters/words with the new value. it returns String
    **10-contains()-->it is a way check the specific characters/words in the String. It returns boolean
    11-equalIgnoreCase()--> it is a way to compare two values without checking any sensitivity.it returns boolean
    12-StartsWith()-->it checks the word/characters starts with specific given character. it returns boolean
    13-endSWith()-->it checks the word/characters starts with specific given character. it returns boolean
    14-valueOf-->it converting the value into the specific Object.It returns Object
   **** 15-trim()-->it removes the spaces from beginning and end. it returns String






     */

    public static void main(String[] args) {
        String str="Ahmet Loves Java";//initialized variable// directly assigning//String Pool
        String str1=new String("Ahmet Loves Java");//Heap
        String str2="Ahmet Loves Java";
        String str3=new String("Ahmet Loves Java");
        String str4="Ahmet loves Java";


        System.out.println(str.equals(str1));//true
        System.out.println(str==str1);//false
        System.out.println(str==str2);//true
        System.out.println(str==str3);//false
        System.out.println(str.equals(str3));//true

       // String str="Ahmet loves Java";//initialized variable// directly assigning//String Pool
        System.out.println(str.length());
        System.out.println(str.indexOf("a"));
        System.out.println(str.charAt(4));
        System.out.println(str.indexOf('a',14));//we can do method chain
        System.out.println(str.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.concat(str2));

        String []array=str1.split(" ");
        System.out.println(Arrays.toString(array));

        System.out.println(str.replace("Java","Selenium"));
        System.out.println(str1.contains("Java"));//true bc String immutable

        System.out.println(str1.equals(str4));//false
        System.out.println(str1.equalsIgnoreCase(str4));//true

        System.out.println(str4.startsWith("A"));
        System.out.println(str4.startsWith("Ahmet"));//no limitation
        System.out.println(str4.endsWith("ava"));

        String str6="        Ahmet loves java        ";
        System.out.println(str6);
        System.out.println(str6.trim());







    }




}
