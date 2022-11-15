package PracticesPeri;

public class ArrayPracticePeri {
    /*public static void main(String[] args) {
        String [] seats={"Harry", "Neville","Ron", "Hermione", "Seamus"};
        for (String s1: seats){
            System.out.println(s1.concat("1"));
        }
        System.out.println(seats[4]);

         String sentence= "Whereas digital signals and other data use discrete signs " +
                 "to convey information, other phenomena and artifacts such as analog signals, " +
                 "poems, pictures, music or other sounds, and currents convey information in a more continuous form." +
                 "[1] Information is not knowledge itself, " +
                 "but the meaning that may be derived from a representation through interpretation.[2]";


         //String [] text=sentence.split(sentence);
         String text="";
         for (int i=0; i<sentence.length(); i++){
             if ((sentence.charAt(i)>='a' && sentence.charAt(i)<='z') || ( sentence.charAt(i)<='A' &&sentence.charAt(i)>='Z')){
                 text+=sentence.charAt(i);


             }System.out.println(text);

     */


   public int sum(int array[]){
       int r1=0;
        for(int number:array){
            r1=r1+number;
        }
       return r1;
   }
    public int totalFinder(int ...array){
        int r1=0;
        for(int number:array){
            r1=r1+number;
        }
        return r1;

    }
    public String[] names(String ... names){
        for (int i=0; i< names.length; i++){
            System.out.println(i+1 + names[i]);
        }return names;

    }

    public static void main(String[] args) {
        ArrayPracticePeri r2 = new ArrayPracticePeri();
        int array[] = {1, 2, 3, 4, 5};
        System.out.println(r2.sum(array));

        int i = r2.totalFinder(1, 2, 3, 4, 5);
        System.out.println(">>>" + i);

        r2.names("Alex", "Marta", "Owl");

    }






}




















