package Primitives;

public class TrueTable2 {
    public static void main(String[] args) {
        /*
        age 7 or up
        height of 42
        with parent

                 */
        int age=7, height=42, kid=4, kidsheight=39;
        boolean parentwants=false, parentsreq=true;
        boolean canride= age>=kid||height >= kidsheight||parentwants==parentsreq;
        System.out.println(canride);


        System.out.println("___________");//B-2 ==3*C || !TRUE && C<B/3
        int b=3, c=10;
        boolean result=b+2==3*c ||!true&&c<b/3;
        System.out.println(result);//false


    }
}
