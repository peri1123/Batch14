package StringBuilder;

public class Practice3ReversedReplace {
    //Reverse String
    //create a method that will take a string and return reversed version

    public static String reversedString(String str){
        String reversed="";
        for(int i=str.length()-1; i>=0; i--){
            reversed=reversed+str.charAt(i);

        }return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reversedString("Interview"));

        //reverse();
        StringBuilder builder=new StringBuilder("Interview");
        System.out.println(builder.reverse());


        //String str=builder; won't compile
        String str=builder.toString();// return typ is string thats why we can store in string


        //replace();
        System.out.println(builder);
        builder.replace(0,builder.length(),"$$$");
        System.out.println(builder);

        builder.replace(1,2,"***");
        System.out.println(builder);

        builder.append("vacation").replace(5,7,"---").append("is coming").reverse();
        System.out.println(builder.reverse());

    }

}
