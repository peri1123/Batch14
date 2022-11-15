package Tasks;

import java.util.Scanner;

public class StringMethodsSong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter song name");
        String songName = scanner.nextLine();
    // Please do not change anything on lines above.

        char firstLetter=songName.charAt(0);
        System.out.println(firstLetter);

        char lastLetter=songName.charAt(songName.length()-1);

        System.out.println( lastLetter);

        int songlength=songName.length();
        System.out.println(songlength);

        int indexof=songName.indexOf('k');
        System.out.println(indexof);


        String song=songName.toUpperCase();
        System.out.println(song);

        String lowercase=songName.toLowerCase();
        System.out.println(lowercase);




    }
}
