package ArrayPractice;

public class ForEachPractice2 {
    public static void main(String[] args) {
        String [] colors= {"red", "blue", "pink", "violet", "yellow"};
        // print every color as upper case and put a '*' after it >> red*, blue* ...
        for (String color:colors
             ) {
            System.out.println(color.toUpperCase().concat("*"));
            //System.out.println(colors[1]);//blue
        }
        System.out.println(colors[1]);//blue
    }
}
