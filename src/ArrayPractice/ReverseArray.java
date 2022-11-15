package ArrayPractice;

public class ReverseArray {
    public static void main(String[] args) {
        String [] drinks= {"tea", "coke", "coffee", "water"};

        for (String drink: drinks){

            String reverse="";// will create as a new reverse, typically says next line
            for(int i=drink.length()-1; i>=0; i--){
                reverse+= drink.charAt(i);
            }
            System.out.println(reverse);

        }
    }
}
