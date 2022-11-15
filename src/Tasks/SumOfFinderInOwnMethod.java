package Tasks;

public class SumOfFinderInOwnMethod {

     public static void main(String[] args) {
          /*
    create a method that will take a StringBuilder as parameter
    it will find the sum of digits from the builder object
    it will return the sum as an Integer Object
     */

         StringBuilder builder=new StringBuilder("TRu6FH8N6*L");
         Integer sum=0;
         for (int i = 0; i < builder.length(); i++) {
             if(Character.isDigit(builder.charAt(i))){
                 sum+=Integer.parseInt(""+builder.charAt(i));

             }
             System.out.println(sum);
         }


     }


}
