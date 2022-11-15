package InterviewQuestions;

public class SwapStrings {
    public static void main(String[]args){

//        String x="Hello";
//        String y="World";
//        x=x+y;
//        y=x.substring(0,(x).length()-y.length());
//        x=x.substring(y.length());
//        System.out.println("x is after swap>"+ x +"this is y after swap>"+ y);

//        System.out.println("==============");
//        String word="Hello Tectorial";
//        StringBuffer sb=new StringBuffer(word);
//        sb.reverse();
//        System.out.println(sb);
//
//        StringBuilder bulder=new StringBuilder(word);
//        System.out.println(bulder.reverse());
//
//        String str="Life is beautiful";
//        String b1="";
//        for (int i=str.length()-1; i>=0; i--) {
//            b1=b1+str.charAt(i);
//
//        }System.out.println(b1);

        String x="Hello";
        String y="World";
        reversedString(x,y);



    }

    public static void reversedString(String x, String y){
        x=x+y; //HelloWorld;
        y=x.substring(0,x.length()-y.length());
        x=x.substring(y.length());
        System.out.println("x is >"+x+" y is> " +y);

    }
}
