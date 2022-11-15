package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1FavoriteMovies {
    public static void main(String[] args) {
        /*
        ask user to give 5 of his/her favorite movies
        store movies to a list /arraylist
        if name of the movie has more than 5 letters do not add that movie to the list
         */
        Scanner s=new Scanner(System.in);
        System.out.println("Please add your 5 favorite movies");
        List<String> movies= new ArrayList<>();
        for (int count=0; count<5; count++){
            String nameOfMovie=s.nextLine();
            if(nameOfMovie.length()<=5){
                movies.add(nameOfMovie);

            }
        }
        System.out.println(movies);
        //from stored movies remove if the movie is white

        for (int i=0; i< movies.size(); i++){

                movies.remove("white");


        }System.out.println(movies);


    }}