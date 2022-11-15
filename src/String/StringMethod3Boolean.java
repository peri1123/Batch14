package String;

public class StringMethod3Boolean {
    public static void main(String[] args) {

        String str="spain";
        boolean r1= str.equals("Spain");//bc small
        System.out.println(r1);

        System.out.println(str.equals("SPAIN")); //FALSE
        String str2="SPAIN";
        System.out.println(str2.toLowerCase().equals(str));//true

        System.out.println(str2.equals(str));//false
        str2.concat("is good to see");
        str.concat("is good to see");
        System.out.println(str.toUpperCase().equals(str2));//true

        //c;returns boolean
        System.out.println(str.equalsIgnoreCase(str2));//true

        String str3="Spain$";//SPAIN spain
        System.out.println(str2.equalsIgnoreCase(str3));//false bc they are ignoring the small letter or upperletter

        String name="david";
        String name1="David";
        String name2="david";
        String name3=new String("david");
        System.out.println(name1.equalsIgnoreCase(name));//if you ignore case of string,values are the same and this is true

        System.out.println("=============");
        System.out.println(1==1);//true
        System.out.println(name==name1);//false
        System.out.println(name.equals(name1));//true

        System.out.println(name.equals(name2));//true
        System.out.println(name==name2);//true
        System.out.println(name==name3);//false





    }
}
