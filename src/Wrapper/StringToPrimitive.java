package Wrapper;

public class StringToPrimitive {
    public static void main(String[] args) {
        String str="123";
        System.out.println(str+100);//will concat 123100
    Integer number1= Integer.parseInt(str);//123
        System.out.println(+100);//223
        int number2=Integer.parseInt(str);
        System.out.println(">>"+(number2+1));//124

        int number3= Integer.parseInt("8");
        String str2="E12";
       // int number4= Integer.parseInt(str2); NumberFormatException

        Boolean b1=Boolean.parseBoolean("True");
        System.out.println(b1);

        Boolean b2=Boolean.parseBoolean("text");//False
        System.out.println(b2);

        Character ch= new Character('c');
        Character ch1= new Character('c');
        System.out.println(ch==ch1);




}
}
