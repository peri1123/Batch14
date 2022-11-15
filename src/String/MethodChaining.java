package String;

public class MethodChaining {
    public static void main(String[] args) {
        System.out.println("Method Chaining");
        String flower="Rose";
                flower=flower.concat("can be different colors");
        System.out.println(flower);
        /*
        substring,trim, replace,upper/lower,concat
         */
        char letter=flower.substring(5).trim().replace('i', '#').toUpperCase().concat("as well as other flowers").charAt(0);

        System.out.println(letter);

        //Method chaining is call another method one after another// we need to put the last method in DT


    }
}
