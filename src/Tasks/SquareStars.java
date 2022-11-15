package Tasks;

public class SquareStars {
    public static void stars(int a){
        for (int i=0; i<a; i++){
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
