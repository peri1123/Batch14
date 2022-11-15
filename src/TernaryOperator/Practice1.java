package TernaryOperator;

public class Practice1 {
    public static void main(String[] args) {
        int num1=4, num2=10;

        String str= num2>num1? "This is first side" : "Second side";
        System.out.println(num2>num1? "This is first side" : "Second side");
        System.out.println(str);
        System.out.println(str.equalsIgnoreCase(num2>num1? "This is first side" : "Second side"));//true
        System.out.println( "Java".equalsIgnoreCase("selenuim")? num2+num1 : num2-num1);// it goes to 2nd side
       // since it is false, java is not == selenuim
       int  d1= "Java".equalsIgnoreCase("selenuim")? num2+num1 : num2-num1;
        System.out.println(d1);

        //===============
        String str2=7<4?"Correct" : "Not";
        System.out.println(str2);

        String str3="Yes";
        boolean b2= str2.equalsIgnoreCase(str3);
        str2.equals(7<4?"Correct" : "Not");

        //=========
        int r3='t' == 'T' ? 5+7 : 7-5;
        System.out.println(r3);

        boolean r4="text" == "word" ? true:false;
        System.out.println(r4);

        //============
       //int i= "text".equalsIgnoreCase("t")  ?  "t" : 25; compile time error, can not store in one DT
        System.out.println("text".equalsIgnoreCase("t")  ?  "t" : 25);
        //false and we can show the result without storing
        //String r5= "text".equalsIgnoreCase("t") ? "t" : 'r'; // compile error bc char and string
        System.out.println("text".equalsIgnoreCase("t") ? "t" : 'r');
        //if ('r' == 'r') can compile
        if ("r"==("text".equalsIgnoreCase("t") ? "t" : 'r')){
            System.out.println("Got it!");
        }
       if (8>(4>3 ?  5 :  4)){
           System.out.println("Example");//true// watch right here

       }





    }

}
