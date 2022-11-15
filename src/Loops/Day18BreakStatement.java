package Loops;

public class Day18BreakStatement {
    public static void main(String[] args) {
        /*for (int i +0; i<10; i++){
        if (i >7){//it will work untill loop will see the break, fe i will see it when it comes to 8. it will print it 7
        break;
        }

        for (int i +0; i<10; i++){
        if (i ==5){// will print it 5 times
        break;
        }
         */

        for (int i=0; i<10; i++){
            System.out.println(++i);
            break;
        }
        System.out.println("==============");

        for (int i=0; i<10; i++){
            System.out.println(i);
            if (i==6) //6 times prited, we are just ignoring 10 and taking a look if statement and printing 6
                //{} it does not matter if you put {} brackets
            break;
        }
        System.out.println("==============");
        for (int i=0, k=20; i<10; i++,k--){
            System.out.println(i);
            if (i>6 || k<11) {// if we are gonna put &&  we
                break;}
            System.out.println("k is : "+k);
        }
    }
}
