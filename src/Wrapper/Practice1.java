package Wrapper;

public class Practice1 {
    public static void main(String[] args) {



        byte b=11;
        Byte bt= new Byte (b);
        System.out.println(bt);//11

        bt=22;
        System.out.println(bt);//22

        //Short sh=new Short(34) wont compile since it will take an integer
        short s1=12;
        Short s=new Short(s1);
        System.out.println(s1);//12

        Integer i=new Integer(25);
        Long l=new Long(12);
        Double d= new Double(23);

        Character ch=new Character('r');

        Boolean b1=new Boolean(true);//value
        Boolean b2=new Boolean("true");//String
        Boolean bl3=new Boolean("car");// this will give false since car does not match
        System.out.println(">>>" +bl3);

        Integer j1=new Integer(33);
        Integer j=33;//Auto Boxing
        System.out.println("They are not the same object>>"+ (j1==j));

        Character ch2='c';
        Character ch3 = new Character('c');











    }
}
