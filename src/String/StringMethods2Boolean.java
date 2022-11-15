package String;

public class StringMethods2Boolean {
    public static void main(String[] args) {
        /*
        startWith
        endWith            RETURN TYPE IS BOOLEAN AND IT GIVES FALSE & TRUE
        contains
         */
        String str="muffin";
       boolean b1=str.startsWith("m");
        System.out.println(b1);
        System.out.println(str.startsWith("m"));
        System.out.println(str.startsWith("123"));

        System.out.println(str.endsWith("in"));
        //System.out.println(str.endsWith('n'));//wont take since it is char
        System.out.println(str.endsWith("n"));

        boolean b2=str.contentEquals("muffin");
        boolean b3=str.contains("xxxx");

        System.out.println(b2);
        System.out.println(b3);

        System.out.println("===========");

        System.out.println(str.contains("mfn"));// it looks the same consequence that's why gives false
        System.out.println(str.contains("muf"));//true

        System.out.println(str.contains("MUFFIN"));//FALSE, THEY ARE WITH LOWERCASE





    }

}
