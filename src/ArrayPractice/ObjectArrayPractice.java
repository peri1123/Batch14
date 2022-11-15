package ArrayPractice;

public class ObjectArrayPractice {
    public static void main(String[] args) {
         Object [] mixedTypes={7, true, "David", 3.4};
         //print out every single data one by one from the array ny using for each
        for (Object a : mixedTypes){
            System.out.println(a.equals("3.4"));

        }
    }
}
