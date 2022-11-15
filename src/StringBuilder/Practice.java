package StringBuilder;

public class Practice {
    public static void main(String[] args) {
        StringBuilder builder= new StringBuilder();
        System.out.println(builder);

        //builder= "TEST"; COMPILE TIME ERROR
        builder.append("Techtorial");
        System.out.println(builder);
        //mutablity

        builder.append(builder).append("Academy");//TechtorialTechtorialAcademy
        System.out.println(builder);

        builder.append(true);
        builder.append(234556);// Stringbuilder it won't convert to int
        System.out.println(builder);

        StringBuilder builder1= new StringBuilder();
        builder1.append(2);
        builder1.append("Academy a");

        System.out.println(builder1.charAt(2));//c it took from the asci table

        //indexOf()
        System.out.println(builder1.indexOf("A")+100);//101

        System.out.println(builder1.indexOf("a", 4));//a is at the index of 9, we put 4 which means look after index 4

        //length()
        System.out.println(builder1.length());

        //substring();
        String str=builder1.substring(1);// we can not assighn as StringBuilder since subctrig returning String
        System.out.println(builder1);


        System.out.println(str);
        System.out.println(builder1.substring(1,builder1.indexOf(" ")));//Academy



    }

}
