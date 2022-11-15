package StringBuilder;

public class Practice2CharAlpha {
    public static void main(String[] args) {

//        String str = "";
//        for (char ch = 'a'; ch <= 'z'; ch++) {
//            //str += ch;
//            //System.out.println(ch);
//            System.out.println(str);
//
//        }
//
//        System.out.println("StringBuilder");
//
//        StringBuilder builder = new StringBuilder();
//        for (char ch = 'a'; ch <= 'z'; ch++) {
//            builder.append(ch);
//            //System.out.println(ch);
//            System.out.println(builder);
//        }
//
//        StringBuilder stringBuilder = new StringBuilder("water");
//
//        //insert();
//        stringBuilder.insert(3, "fresh");
//        System.out.println(stringBuilder);
//        stringBuilder.insert(stringBuilder.indexOf("f"), " ");
//        System.out.println(stringBuilder);
//
//        //stringBuilder.insert(15,"***");//StringIndexOutOfBoundsException
//        //System.out.println(stringBuilder);
//
//        String str1 = stringBuilder.substring(0, 4);//single index or double index
//        System.out.println(str1);//wat
//
//        //delete();- deleteCharAt();'
//        stringBuilder.delete(0, 4);
//        System.out.println(stringBuilder);//fresher
//
//        stringBuilder.deleteCharAt(0);//it delete only one char
//        System.out.println(stringBuilder);//resher
//
//
//        //i*n*t*e*r*V*i*e*w
//        /*
//        create a method that takes a String parameter
//        it will delete "*" and return give as String builder object
//         */
//
//        String str3 = "i*n*t*e*r*V*i*e*w";
//        starRemover(str3);
//        System.out.println(starRemover(str3));
//        System.out.println("This is coming from str2>>>" +starRemover2(str3));
//
//
//
//    }
//
//    public static StringBuilder starRemover(String string) {
//        StringBuilder stringBuilderMethod = new StringBuilder();
//        for (int i = 0; i < string.length(); i++) {
//            if (string.charAt(i) != '*') {
//                stringBuilderMethod.append(string.charAt(i));
//
//            }
//
//        }
//        return stringBuilderMethod;
//    }
//
//
//    public static StringBuilder starRemover2(String str1){
//        StringBuilder builder1=new StringBuilder(str1);
//        for (int i=0; i<builder1.length(); i++){
//            if(builder1.charAt(i)=='*'){
//                builder1.deleteCharAt(i);
//                //i--;
//
//            }
//        }return builder1;

        String str1="i***n******************t*e*r***V*i*e*w";
        starRemover(str1);


   }
    //i*n*t*e*r*V*i*e*w
//        /*
//        create a method that takes a String parameter
//        it will delete "*" and return give as String builder object
//         */

    public static StringBuilder starRemover(String str) {
      StringBuilder b1=new StringBuilder(str);
        for (int i = 0; i < b1.length(); i++) {
            if(b1.charAt(i)=='*'){
                b1.deleteCharAt(i);
                i--;

            }
            System.out.println(b1);


        }

        return b1;
    }

}







