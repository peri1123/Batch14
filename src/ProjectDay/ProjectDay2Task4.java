package ProjectDay;

import java.util.Scanner;

public class ProjectDay2Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please put 3 words");
        String name=scanner.nextLine();
        System.out.println(name);
        int lastletterofimportance=name.indexOf("e");
        System.out.println(lastletterofimportance);
        int lastnumberof=name.indexOf("f");
        System.out.println("lastnumberof "+ lastnumberof);
        int lastnumberofhuman=name.indexOf("n",15);
        System.out.println(lastnumberofhuman);
        int thefinal=lastletterofimportance+lastnumberof+lastnumberofhuman;
        System.out.println("The sum is>> "+thefinal);






    }
}
